package com.example.authserver.config;

import com.example.authserver.config.keys.JwksKeys;
import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.jwk.RSAKey;
import com.nimbusds.jose.jwk.source.JWKSource;
import com.nimbusds.jose.proc.SecurityContext;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.OAuth2AuthorizationServerConfiguration;
import org.springframework.security.oauth2.core.AuthorizationGrantType;
import org.springframework.security.oauth2.core.ClientAuthenticationMethod;
import org.springframework.security.oauth2.core.oidc.OidcScopes;
import org.springframework.security.oauth2.server.authorization.client.InMemoryRegisteredClientRepository;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClient;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClientRepository;
import org.springframework.security.oauth2.server.authorization.config.ClientSettings;
import org.springframework.security.oauth2.server.authorization.config.ProviderSettings;
import org.springframework.security.oauth2.server.authorization.config.TokenSettings;
import org.springframework.security.web.SecurityFilterChain;

import java.time.Duration;
import java.util.UUID;

@Configuration
@AllArgsConstructor
public class AuthorizationServerConfig {

    // http://localhost:8080/oauth2/authorize?response_type=code&client_id=client&scope=openid&redirect_uri=http://127.0.0.1:8000/authorized
  // http://localhost:8080/oauth2/token?client_id=client&redirect_uri=http://127.0.0.1:8000/authorized&grant_type=authorization_code&code=

  private final CORSCustomizer corsCustomizer;

  @Bean
  @Order(Ordered.HIGHEST_PRECEDENCE)
  public SecurityFilterChain securityASFilterChain(HttpSecurity http) throws Exception {
    OAuth2AuthorizationServerConfiguration.applyDefaultSecurity(http);
    corsCustomizer.corsCustomizer(http);
//    http.cors();
    return http.formLogin().and().build();
  }

  @Bean
  public RegisteredClientRepository registeredClientRepository() {
    RegisteredClient registeredClient = RegisteredClient.withId(UUID.randomUUID().toString())
        .clientId("client")
        .clientSecret("secret")
        .clientAuthenticationMethod(ClientAuthenticationMethod.CLIENT_SECRET_BASIC)
        .authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
        .authorizationGrantType(AuthorizationGrantType.PASSWORD)
        .authorizationGrantType(AuthorizationGrantType.CLIENT_CREDENTIALS)
        .authorizationGrantType(AuthorizationGrantType.REFRESH_TOKEN)
        .redirectUri("http://127.0.0.1:8000/authorized")
        .scope(OidcScopes.OPENID)
        .clientSettings(ClientSettings.builder()
            .requireAuthorizationConsent(true).build())
        .tokenSettings(TokenSettings.builder()
                .accessTokenTimeToLive(Duration.ofDays(365))
//            .refreshTokenTimeToLive(Duration.ofHours(12))
            .build())
        .build();

    return new InMemoryRegisteredClientRepository(registeredClient);
  }

  @Bean
  public ProviderSettings providerSettings() {
    return ProviderSettings.builder().issuer("http://localhost:8080").build();
  }

  @Bean
  public JWKSource<SecurityContext> jwkSource() {
    RSAKey rsaKey = JwksKeys.generateRSAKey();
    JWKSet set = new JWKSet(rsaKey);
    return (j, sc) -> j.select(set);
  }
}

package org.invopayWebService.config.security;

import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
public class SecurityConfig {//extends WebSecurityConfigurerAdapter {
//    public static final String[] PUBLIC_URLS = {
//            "/v3/api-docs",
//            "/v2/api-docs",
//            "/swagger-resources/**",
//            "/swagger-ui/**",
//            "/webjars/**",
//            "/actuator",
//            "/zai/**",
//            "/web/**"
//    };
//
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .csrf().disable()
//                .cors().disable()
//                .authorizeRequests()
//                .antMatchers(PUBLIC_URLS).permitAll()
//                .and()
//                .authorizeRequests()
//                .anyRequest()
//                .authenticated()
//                .and()
//                .sessionManagement()
//                .and()
//                .oauth2ResourceServer()
//                .jwt();
//    }
}

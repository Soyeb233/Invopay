package org.zai.config.swagger;


import com.google.common.collect.ImmutableList;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@EnableSwagger2
@EnableSwagger2WebMvc
@Configuration
@Component
@Primary
@EnableAutoConfiguration
public class SwaggerConfig {

    public static final String AUTHORIZATION_HEADER= "Authorization";


    private ApiKey apiKeys(){
        return new ApiKey("JWT" , AUTHORIZATION_HEADER , "header");
    }

    private List<SecurityContext> securityContexts(){
        return Arrays.asList(SecurityContext.builder().securityReferences(securityReferences()).build());
    }

    private List<SecurityReference> securityReferences(){
        AuthorizationScope socpes = new AuthorizationScope("global" , "accessEverything");
        return  Arrays.asList(new SecurityReference("JWT" ,new AuthorizationScope[] { socpes } ));
    }



    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .securityContexts(securityContexts())
                .securitySchemes(Arrays.asList(apiKeys()))
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "INVOPAY - ZAI - API",
                "Real Time Pyament Intigration",
                "1.0",
                "Terms of service",
                new Contact("Peet", "https://deveinvoice.invopay.com.au/einvoice/", "abc"),
                "License of API", "API license URL", Collections.emptyList());
    }

//    private SwaggerResource swaggerResource(String name, String location, String version) {
//        SwaggerResource swaggerResource = new SwaggerResource();
//        swaggerResource.setName(name);
//        swaggerResource.setLocation(location);
//        swaggerResource.setSwaggerVersion(version);
//        return swaggerResource;
//    }




}

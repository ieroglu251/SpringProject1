package com.cybertek.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAoi(){

        SecurityScheme securityScheme = new SecurityScheme();

        securityScheme.setType(SecurityScheme.Type.HTTP);
        securityScheme.setScheme("bearer");
        securityScheme.setBearerFormat("jwt");
        securityScheme.setIn(SecurityScheme.In.HEADER);
        securityScheme.setName("authorization");
        io.swagger.v3.oas.models.info.Info infoVerson = new io.swagger.v3.oas.models.info.Info().title("cybooo").version("snpshot");
        SecurityRequirement securityItem = new SecurityRequirement().addList("bearer-jwt", Arrays.asList("read","write"));

        return  new OpenAPI().components(new Components().addSecuritySchemes("bearer-jwt", securityScheme))
                .info(infoVerson)
                .addSecurityItem(securityItem);
    }
}

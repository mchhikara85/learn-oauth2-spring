package com.manjeet.learnsso.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .csrf((csrfConfigurer) -> csrfConfigurer.disable())
                .authorizeHttpRequests((requestCustomizer) -> requestCustomizer.anyRequest().authenticated())
                .oauth2ResourceServer((oAuth2ServerCustomizer) -> oAuth2ServerCustomizer.jwt(Customizer.withDefaults()))
                .sessionManagement((sessionCustomizer) -> sessionCustomizer.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .build();
    }
}

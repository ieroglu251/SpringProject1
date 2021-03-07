package com.rest.restapi.config;


import com.rest.restapi.service.SecurityService;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private SecurityService securityService;
    private AuthSeccessHandler authSeccessHandler;


    public SecurityConfig(SecurityService securityService, AuthSeccessHandler authSeccessHandler) {
        this.securityService = securityService;
        this.authSeccessHandler = authSeccessHandler;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                .authorizeRequests()
                .antMatchers("/user/**").hasAuthority("Admin")
                .antMatchers("/project/**").hasAuthority("Manager")
                .antMatchers("/task/employee/**").hasAuthority("Employee")
                .antMatchers("/task/**").hasAuthority("Manager")
                .antMatchers("/","/login","/fragments/**", "/assets/**", "/images/**").permitAll()
                .and()
                .formLogin().loginPage("/login")
//                .defaultSuccessUrl("/welcome")
                .successHandler(authSeccessHandler)
                .failureUrl("/login?error=true").permitAll()
                .and()
                .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/login")
                .and()
                .rememberMe().tokenValiditySeconds(120).key("cybertekSecret").userDetailsService(securityService);
    }
}

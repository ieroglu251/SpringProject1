package com.rest.restapi.controller;

import com.rest.restapi.service.ConfirmationTokenservice;
import com.rest.restapi.service.UserService;
import com.rest.restapi.util.JWTUtil;
import com.rest.restapi.util.MapperUtil;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Authentication",description = "Authentication API")
public class LoginController {


    private AuthenticationManager authenticationManager;
    private UserService userService;
    private MapperUtil mapperUtil;
    private JWTUtil jwtUtil;
    private ConfirmationTokenservice confirmationTokenService;

    public LoginController(AuthenticationManager authenticationManager, UserService userService, MapperUtil mapperUtil,
                           JWTUtil jwtUtil, ConfirmationTokenservice confirmationTokenService) {
        this.authenticationManager = authenticationManager;
        this.userService = userService;
        this.mapperUtil = mapperUtil;
        this.jwtUtil = jwtUtil;
        this.confirmationTokenService = confirmationTokenService;
    }
}

package com.offer.manager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtService jwtService;

    public String verify() {
        Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken("harsh", "h@123"));
        if (authenticate.isAuthenticated()) {
            return jwtService.getToken("harsh");
        }
        return "fail";
    }
}

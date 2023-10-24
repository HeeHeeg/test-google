package com.example.test000;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.OAuth2AuthenticatedPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
@CrossOrigin("*")
public class testController {
    @GetMapping
    public String test(@AuthenticationPrincipal OAuth2AuthenticatedPrincipal user) {
      log.info("{}", user);
        return "index";
    }
}

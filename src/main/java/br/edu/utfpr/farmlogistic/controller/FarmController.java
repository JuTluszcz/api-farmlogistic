package br.edu.utfpr.farmlogistic.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/farm")
@SecurityRequirement(name = "Authorization")
@Tag(name = "Farm", description = "Farm resource endpoints.")
public class FarmController {

    @GetMapping
    public String hello() {
        return "Hello Farm";
    }
}



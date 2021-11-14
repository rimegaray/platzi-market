package com.platzi.market.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
class SaludoController {

    @GetMapping("/hola")
    public String saludar() {
        return "Hola Mundo";
    }
}
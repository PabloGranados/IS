package ipn.mx.HolaSpring6CV3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HolaController {

    @GetMapping("/mensaje")
    public String holaSpring() {
        return "¡Hola Spring!";
    }
}
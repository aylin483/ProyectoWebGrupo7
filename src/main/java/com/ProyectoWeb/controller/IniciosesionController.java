
package com.ProyectoWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IniciosesionController {
    
    @RequestMapping("/iniciosesion/iniciosesion")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "/iniciosesion/iniciosesion";
    }
    
}

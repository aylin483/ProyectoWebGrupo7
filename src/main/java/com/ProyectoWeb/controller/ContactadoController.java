
package com.ProyectoWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ContactadoController {
    
    @RequestMapping("/contactado")
    public String Contactado (Model model) {
        model.addAttribute("attribute", "value");
        return "/contactado";
    }
    
}

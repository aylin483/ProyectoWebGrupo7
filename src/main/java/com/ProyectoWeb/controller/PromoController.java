
package com.ProyectoWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Aylin - aylinth483@gmail.com
 */
@Controller
public class PromoController {
    
    @RequestMapping("/cabinas/promociones")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "/cabinas/promociones";
    }
    
}

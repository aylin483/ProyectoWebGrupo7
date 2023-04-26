/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.ProyectoWeb.controller;

import com.ProyectoWeb.dao.RegistrarDao;
import com.ProyectoWeb.domain.Registrar;
import com.ProyectoWeb.service.RegistrarService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

 
@Slf4j
@Controller
public class RegistrarController {
    
    @Autowired
    RegistrarDao registrarDao;
    
    
    @Autowired
    private RegistrarService service;
    @GetMapping("/registrar")
    public String registro (Model model) {
       
        
        var registros = registrarDao.findAll();
        model.addAttribute("registros", registros);
        return "/registrar";
    
    }
    
   // @PostMapping("registrarUsuario")
  // public String registrarUsuario(@ModelAttribute("usuario") Registrar registrar){
     //  System.out.println(registrar);
     //  service.(registrar);
      //  return "/Index";
       
   }
// }
       
   


    
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.cct.raquel.kiosk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Raquel
 */
@Controller
public class HelloController {
    
    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("name", "World");
        return "hello";
    }
}

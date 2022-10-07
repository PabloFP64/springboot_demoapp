package demoapp.controller;


import demoapp.service.NumeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NumeroControllerPlantilla {

    @Autowired
    private NumeroService service;

    @RequestMapping("/numeroplantilla/{numeroURL}")
    public String num(@PathVariable(value = "numeroURL") int numero, Model model){
        model.addAttribute("mensajeNpar", service.npar(numero));
        return "isNpar";
    }




}

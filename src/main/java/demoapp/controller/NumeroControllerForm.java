package demoapp.controller;


import demoapp.service.NumeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class NumeroControllerForm {

    @Autowired
    private NumeroService service;

    @GetMapping("/numeroForm")
    public String numeroForm(NumData numData){
        return "formNumero";
    }

    @PostMapping("/numeroForm")
    public String checkNumInfo(@ModelAttribute @Valid NumData numData, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "formNumero";
        }
        model.addAttribute("mensajeNpar", service.npar(numData.getNumeroInt()));
        return "isNpar";
    }

}

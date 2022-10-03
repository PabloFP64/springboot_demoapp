package demoapp.controller;



import demoapp.service.NumeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NumeroController {

    @Autowired
    private NumeroService service;

    @RequestMapping("numero/{numero}")
    public @ResponseBody String numero(@PathVariable(value="numero") int numero) {return service.npar(numero);}



}

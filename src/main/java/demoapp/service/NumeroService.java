package demoapp.service;


import org.springframework.stereotype.Service;

@Service
public class NumeroService {

    public String npar(int num){
        if(num%2==0){
            return "El número "+ num+ " es par";
        }else{
            return "El número "+ num+ " es impar";
        }

    }
}

package sn.ism.ProjetFinal.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class Controller{
    @GetMapping("/")
    public String demarrer(){
        return "index";
    }
}

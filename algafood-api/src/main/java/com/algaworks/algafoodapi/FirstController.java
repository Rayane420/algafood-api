package com.algaworks.algafoodapi;

import com.algaworks.algafoodapi.di.modelo.Cliente;
import com.algaworks.algafoodapi.di.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {

    private AtivacaoClienteService ativacaoClienteService;

    public FirstController(AtivacaoClienteService ativacaoClienteService) {
        this.ativacaoClienteService = ativacaoClienteService;
        System.out.println("FirstController: " + ativacaoClienteService);
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        Cliente rayane = new Cliente("Rayane", "rayane@gmail.com", "6199000-8484");

        ativacaoClienteService.ativar(rayane);

        return "Hello World =)";
    }

}

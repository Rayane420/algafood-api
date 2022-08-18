package com.algaworks.algafoodapi.di.notificacao;

import com.algaworks.algafoodapi.di.modelo.Cliente;
import org.springframework.stereotype.Component;

@Component
public class NotificadorSms implements Notificador {

    @Override
    public void notificar(Cliente cliente, String mensagem){
        System.out.printf("Notificando %s através de SMS no número %s: %s\n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }

}
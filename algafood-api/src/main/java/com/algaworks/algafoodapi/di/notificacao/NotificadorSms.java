package com.algaworks.algafoodapi.di.notificacao;

import com.algaworks.algafoodapi.di.modelo.Cliente;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("urgente")
@Component
public class NotificadorSms implements Notificador {

    @Override
    public void notificar(Cliente cliente, String mensagem){
        System.out.printf("Notificando %s através de SMS no número %s: %s\n",
                cliente.getNome(), cliente.getTelefone(), mensagem);
    }

}
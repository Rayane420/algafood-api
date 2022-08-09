package com.algaworks.algafoodapi.di.notificacao;

import com.algaworks.algafoodapi.di.modelo.Cliente;

public interface Notificador {

    void notificar(Cliente cliente, String mensagem);
}

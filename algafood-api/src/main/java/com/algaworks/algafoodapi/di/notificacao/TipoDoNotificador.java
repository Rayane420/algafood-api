package com.algaworks.algafoodapi.di.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface TipoDoNotificador {

    NivelUrgencia value();

}

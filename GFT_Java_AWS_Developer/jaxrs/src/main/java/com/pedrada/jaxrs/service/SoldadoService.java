package com.pedrada.jaxrs.service;

import com.pedrada.jaxrs.dto.Soldado;
import org.springframework.stereotype.Service;

import javax.swing.*;

@Service
public class SoldadoService {

    public Soldado buscarSoldado(String rg) {
        Soldado soldado = new Soldado();
        soldado.setRg(rg);
        soldado.setNome("Legolas");
        soldado.setRaca("Elfo");
        soldado.setArma("Arco");
        return soldado;
    }

    public void criadSoldado(Soldado soldado){

    }

    public void deletarSoldado(String rg) {
    }
}

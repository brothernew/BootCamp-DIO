package com.pedrada.jaxrs.controller;

import com.pedrada.jaxrs.controller.request.SoldadoRequest;
import com.pedrada.jaxrs.dto.Soldado;
import com.pedrada.jaxrs.service.SoldadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/soldado")
public class SoldadoController {

    private final SoldadoService soldadoService;

    @Autowired
    public SoldadoController(SoldadoService soldadoService){
        this.soldadoService = soldadoService;
    }

    @GetMapping("/{rg}")
    public ResponseEntity<Soldado> buscarSoldado(@PathVariable() String rg){
        Soldado soldado = soldadoService.buscarSoldado(rg);
        return ResponseEntity.status(HttpStatus.OK).body(soldado);
    }

    @PostMapping
    public ResponseEntity criarSoldado(@RequestBody Soldado soldado){

        soldadoService.criadSoldado(soldado);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/{rg}")
    public ResponseEntity editarSoldado(@PathVariable() String rg, @RequestBody SoldadoRequest soldadoRequest){

        soldadoRequest.alteraSoldado(rg, soldadoRequest);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    public ResponseEntity deletarSoldado(@PathVariable() String rg){
        soldadoService.deletarSoldado(rg);
        return ResponseEntity.ok().build();
    }

}

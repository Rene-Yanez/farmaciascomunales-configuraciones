package com.farmaciascomunales.configuraciones.controller;

import com.farmaciascomunales.configuraciones.model.ParametroSistema;
import com.farmaciascomunales.configuraciones.service.ConfiguracionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/configuracion")
public class ConfiguracionController {

    private final ConfiguracionService service;

    public ConfiguracionController(ConfiguracionService service) {
        this.service = service;
    }

    @GetMapping
    public List<ParametroSistema> listar() {
        return service.listar();
    }

    @PostMapping
    public ParametroSistema crear(@RequestBody ParametroSistema p) {
        return service.crear(p);
    }
}
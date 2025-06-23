package com.farmaciascomunales.configuraciones.service;

import com.farmaciascomunales.configuraciones.model.ParametroSistema;
import com.farmaciascomunales.configuraciones.repository.ParametroSistemaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConfiguracionService {

    private final ParametroSistemaRepository repository;

    public ConfiguracionService(ParametroSistemaRepository repository) {
        this.repository = repository;
    }

    public List<ParametroSistema> listar() {
        return repository.findAll();
    }

    public ParametroSistema crear(ParametroSistema parametro) {
        return repository.save(parametro);
    }
}
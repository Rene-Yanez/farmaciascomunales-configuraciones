package com.farmaciascomunales.configuraciones.service;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class KeepAliveService {

    private final JdbcTemplate jdbcTemplate;

    public KeepAliveService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Scheduled(fixedRate = 40000) // cada 4 minutos (240,000 milisegundos)
    public void keepDatabaseAlive() {
        try {
            jdbcTemplate.queryForObject("SELECT 1", Integer.class);
            System.out.println("[KeepAlive] Base de datos despierta");
        } catch (Exception e) {
            System.err.println("[KeepAlive] Error al mantener base de datos viva");
            e.printStackTrace();
        }
    }
}
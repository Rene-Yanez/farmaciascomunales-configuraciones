package com.farmaciascomunales.configuraciones.model;

import jakarta.persistence.*;

@Entity
public class ParametroSistema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String clave;
    private String valor;

    // Getters y setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getClave() { return clave; }

    public void setClave(String clave) { this.clave = clave; }

    public String getValor() { return valor; }

    public void setValor(String valor) { this.valor = valor; }
}
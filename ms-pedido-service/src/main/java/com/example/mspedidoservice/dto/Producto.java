package com.example.mspedidoservice.dto;

import lombok.Data;

@Data
public class Producto {
    private Integer id;
    private String name;
    private String description;
    private String code;
    private Categoria category;
}

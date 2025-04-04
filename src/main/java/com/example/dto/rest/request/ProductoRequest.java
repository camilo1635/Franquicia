package com.example.dto.rest.request;

import lombok.Data;

@Data
public class ProductoRequest {
    private String nombre;
    private Integer sucursal_id;
    private String stock;
}

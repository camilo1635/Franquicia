package com.example.dto.rest.response;

import lombok.Data;

@Data
public class ProductoResponse {
    private Integer id;
    private String nombre;
    private Integer sucursal_id;
    private String stock;    
}

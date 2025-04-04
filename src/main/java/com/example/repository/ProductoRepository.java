package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.domain.Producto;

public interface ProductoRepository extends JpaRepository<ProductoRepository, Integer>{
    @Query(value = """
        SELECT s.id, s.nombre, s.sucursal_id, stock
        FROM producto s  
        ORDER BY s.id asc
        """, nativeQuery = true )
    List<Producto> findAllProductosById();
}

package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.domain.Sucursal;

public interface SucursalRepository extends JpaRepository<SucursalRepository, Integer>{
    @Query(value = """
        SELECT s.id, s.nombre, franquicia_id
        FROM sucursal s  
        ORDER BY s.id asc
        """, nativeQuery = true )
    List<Sucursal> findAllSucursalesById();
}

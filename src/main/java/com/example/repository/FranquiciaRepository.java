package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.domain.Franquicia;

public interface FranquiciaRepository extends JpaRepository<FranquiciaRepository, Integer> {
    @Query(value = """
        SELECT s.id, s.nombre
        FROM franquicia s  
        ORDER BY s.id asc
        """, nativeQuery = true )
    List<Franquicia> findAllFranquiciasById();
}

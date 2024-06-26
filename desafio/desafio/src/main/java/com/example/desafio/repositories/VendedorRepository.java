package com.example.desafio.repositories;

import com.example.desafio.model.VendedorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendedorRepository extends JpaRepository <VendedorModel, Long>{
}

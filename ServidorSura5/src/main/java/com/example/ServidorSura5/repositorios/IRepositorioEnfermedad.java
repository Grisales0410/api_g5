package com.example.ServidorSura5.repositorios;

import com.example.ServidorSura5.modelos.Enfermedad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IRepositorioEnfermedad extends JpaRepository<Enfermedad, Long> {
}

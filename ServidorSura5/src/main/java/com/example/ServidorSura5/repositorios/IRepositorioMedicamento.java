package com.example.ServidorSura5.repositorios;

import com.example.ServidorSura5.modelos.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IRepositorioMedicamento extends JpaRepository<Medicamento, Long> {
}

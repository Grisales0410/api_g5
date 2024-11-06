package com.example.ServidorSura5.repositorios;

import com.example.ServidorSura5.modelos.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IRepositorioPaciente extends JpaRepository<Paciente, Long>  {
}


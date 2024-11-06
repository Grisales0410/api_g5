package com.example.ServidorSura5.repositorios;

import com.example.ServidorSura5.modelos.SignoVital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IRepositorioSignoVital extends JpaRepository<SignoVital, Long> {
}

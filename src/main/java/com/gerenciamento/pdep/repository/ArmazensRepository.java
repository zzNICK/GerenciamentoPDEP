package com.gerenciamento.pdep.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerenciamento.pdep.entity.Armazens;

public interface ArmazensRepository extends JpaRepository<Armazens, Integer> {
	Armazens findByFabricaF1(boolean fabricaF1);
	Armazens findByArmazenA1(boolean armazenA1);
	Armazens findByArmazenA2(boolean armazenA2);
}

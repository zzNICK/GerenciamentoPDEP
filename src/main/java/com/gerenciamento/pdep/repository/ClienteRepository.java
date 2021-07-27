package com.gerenciamento.pdep.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.gerenciamento.pdep.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	Cliente findByClienteNome(String clienteNome);

}

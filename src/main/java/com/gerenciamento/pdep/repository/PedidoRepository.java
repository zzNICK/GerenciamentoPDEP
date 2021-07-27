package com.gerenciamento.pdep.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerenciamento.pdep.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer>{
	Pedido findByProdutoX(boolean produtoX);
	Pedido findByProdutoY(boolean produtoY);
}

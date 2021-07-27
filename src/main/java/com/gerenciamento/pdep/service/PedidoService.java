package com.gerenciamento.pdep.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerenciamento.pdep.entity.Cliente;
import com.gerenciamento.pdep.entity.Pedido;
import com.gerenciamento.pdep.repository.PedidoRepository;

@Service
public class PedidoService {
	@Autowired
	private PedidoRepository pedidoRepository;
	
	public Pedido savePedido(Pedido pedido) {
		return pedidoRepository.save(pedido);
	}
	
	public List<Pedido> savePedidos(List<Pedido> pedidos) {
		return pedidoRepository.saveAll(pedidos);
	}
	
	public List<Pedido> getPedidos() {
		return pedidoRepository.findAll();
	}
	
	public Pedido getPedidoByNumPedido(int numPedido) {
		return pedidoRepository.findById(numPedido).orElse(null);
	}
	
	public Pedido getPedidoByProdutoX(boolean produtoX) {
		return pedidoRepository.findByProdutoX(produtoX);
	}
	
	public Pedido getPedidoByProdutoY(boolean produtoY) {
		return pedidoRepository.findByProdutoY(produtoY);
	}
	
	public 	String deletePedido(int numPedido) {
		pedidoRepository.deleteById(numPedido);
		return "Pedido removido" + numPedido;
	}
	
	public Pedido updatePedido(Pedido pedido) {
		Pedido existingPedido = pedidoRepository.findById(pedido.getNumPedido()).orElse(null);
		existingPedido.setProdutoX(pedido.isProdutoX());
		existingPedido.setProdutoY(pedido.isProdutoY());
		existingPedido.setQntd(pedido.getQntd());
		return pedidoRepository.save(existingPedido);
	}
}

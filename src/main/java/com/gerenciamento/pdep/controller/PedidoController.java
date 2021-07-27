package com.gerenciamento.pdep.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gerenciamento.pdep.entity.Pedido;
import com.gerenciamento.pdep.service.PedidoService;

@RestController
public class PedidoController {
	@Autowired
	private PedidoService pedidoService;
	
	@PostMapping("/addPedido")
	public Pedido addPedido(@RequestBody Pedido pedido) {
		return pedidoService.savePedido(pedido);
	}
	
	@PostMapping("/addPedidos")
	public List<Pedido> addPedidos(@RequestBody List<Pedido> pedidos) {
		return pedidoService.savePedidos(pedidos);
	}
	
	@GetMapping("/buscaPedidos")
	public List<Pedido> findAllPedidos() { 
		return pedidoService.getPedidos();
	}
	
	@GetMapping("/PedidoByNumPedido/{numPedido}")
	public Pedido findPedidoById(@PathVariable int numPedido) {
		return pedidoService.getPedidoByNumPedido(numPedido);
	}
	
	@PutMapping("/updatePedido")
	public Pedido updatePedido(@RequestBody Pedido pedido) {
		return pedidoService.updatePedido(pedido);
	}
	
	@DeleteMapping("/deletePedido/{numPedido}")
	public String deletePedido(@PathVariable int numPedido) {
		return pedidoService.deletePedido(numPedido);
	}
}

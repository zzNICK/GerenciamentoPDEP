package com.gerenciamento.pdep.entity;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "CLIENTE")
public class Cliente {
	
	@Id
	@Column(nullable = false)
	private int cnpj;
	
	private String clienteNome;

	
	@Column(nullable = false)
	private int prioridade;
	
	@ManyToMany
	@JoinTable(name = "carteira_pedidos",
		joinColumns = @JoinColumn(name = "cnpj"),
		inverseJoinColumns = @JoinColumn(name = "numPedido"))
	private Set<Pedido> pedidos = new HashSet<>();
	
	public Cliente() {
	}

	public Cliente(int cnpj, String clienteNome, int prioridade, Set<Pedido> pedidos) {
		this.cnpj = cnpj;
		this.clienteNome = clienteNome;
		this.prioridade = prioridade;
		this.pedidos = pedidos;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}



	public String getClienteNome() {
		return clienteNome;
	}

	public void setClienteNome(String clienteNome) {
		this.clienteNome = clienteNome;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	public Set<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	

}

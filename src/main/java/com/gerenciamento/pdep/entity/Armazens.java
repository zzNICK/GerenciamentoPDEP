package com.gerenciamento.pdep.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ARMAZENS")
public class Armazens {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private boolean fabricaF1;
	private boolean armazenA1;
	private boolean armazenA2;
	
	@OneToMany
	private List<Pedido> pedidos;
	
	public Armazens() {
	}

	public Armazens(int id, boolean fabricaF1, boolean armazenA1, boolean armazenA2, List<Pedido> pedidos) {
		this.id = id;
		this.fabricaF1 = fabricaF1;
		this.armazenA1 = armazenA1;
		this.armazenA2 = armazenA2;
		this.pedidos = pedidos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isFabricaF1() {
		return fabricaF1;
	}

	public void setFabricaF1(boolean fabricaF1) {
		this.fabricaF1 = fabricaF1;
	}

	public boolean isArmazenA1() {
		return armazenA1;
	}

	public void setArmazenA1(boolean armazenA1) {
		this.armazenA1 = armazenA1;
	}

	public boolean isArmazenA2() {
		return armazenA2;
	}

	public void setArmazenA2(boolean armazenA2) {
		this.armazenA2 = armazenA2;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	
	

}

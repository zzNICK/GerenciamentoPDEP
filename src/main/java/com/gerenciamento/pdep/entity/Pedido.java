package com.gerenciamento.pdep.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PEDIDO")
public class Pedido {
	@Id
	@Column(nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numPedido;
	
    private boolean produtoX;
    private boolean produtoY;	
    private int qntd;
    
    @ManyToMany(mappedBy = "pedidos")
    private Set<Cliente> clientes = new HashSet<>();
    
	@ManyToOne
	private Armazens armazens;
    
    public Pedido() {
    }
  
	public Pedido(int numPedido, boolean produtoX, boolean produtoY, int qntd, Set<Cliente> clientes) {
		this.numPedido = numPedido;
		this.produtoX = produtoX;
		this.produtoY = produtoY;
		this.qntd = qntd;
		this.clientes = clientes;
	}

	public int getNumPedido() {
		return numPedido;
	}
	public void setNumPedido(int numPedido) {
		this.numPedido = numPedido;
	}

	
	
	public boolean isProdutoX() {
		return produtoX;
	}

	public void setProdutoX(boolean produtoX) {
		this.produtoX = produtoX;
	}

	public boolean isProdutoY() {
		return produtoY;
	}

	public void setProdutoY(boolean produtoY) {
		this.produtoY = produtoY;
	}

	public int getQntd() {
		return qntd;
	}
	public void setQntd(int qntd) {
		this.qntd = qntd;
	}
	public Set<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}

	
    
	
    

}

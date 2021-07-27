package com.gerenciamento.pdep.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LINHA_PRODUCAO")
public class LinhaProducao {
	@Id
	@Column(nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	
	@Column(nullable = false)
	private boolean lpx;
	private boolean lpy;
	
	public LinhaProducao() {	
	}

	public LinhaProducao(int id, boolean lpx, boolean lpy) {
		this.id = id;
		this.lpx = lpx;
		this.lpy = lpy;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isLpx() {
		return lpx;
	}

	public void setLpx(boolean lpx) {
		this.lpx = lpx;
	}

	public boolean isLpy() {
		return lpy;
	}

	public void setLpy(boolean lpy) {
		this.lpy = lpy;
	}

	
	
}

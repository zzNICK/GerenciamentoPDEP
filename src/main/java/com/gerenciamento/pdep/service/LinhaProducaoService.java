package com.gerenciamento.pdep.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerenciamento.pdep.entity.LinhaProducao;
import com.gerenciamento.pdep.repository.LinhaProducaoRepository;

@Service
public class LinhaProducaoService {
	@Autowired
	private LinhaProducaoRepository linhaProducaoRepository;
	
	public LinhaProducao saveProducao(LinhaProducao linhaProducao) {
		return linhaProducaoRepository.save(linhaProducao);
	}
	
	public List<LinhaProducao> saveAllProducao(List<LinhaProducao> linhaProducao) {
		return linhaProducaoRepository.saveAll(linhaProducao);
	}
	
	public List<LinhaProducao> getProducoes() {
		return linhaProducaoRepository.findAll();
	}
	
	public LinhaProducao getProducaoById(int id) {
		return linhaProducaoRepository.findById(id).orElse(null);
	}
	
	public LinhaProducao getProducaoByLpx(boolean lpx) {
		return linhaProducaoRepository.findByLpx(lpx);
	}
	
	public LinhaProducao getProducaoByLpy(boolean lpy) {
		return linhaProducaoRepository.findByLpy(lpy);
	}
	
	public 	String deleteProducaoId(int id) {
		linhaProducaoRepository.deleteById(id);;
		return "Linha de Producao REMOVIDA" + id;
	}
	
	
	public LinhaProducao updateProducao(LinhaProducao linhaProducao) {
		LinhaProducao existingProducao = linhaProducaoRepository.findById(linhaProducao.getId()).orElse(null);
		existingProducao.setLpx(linhaProducao.isLpx());
		existingProducao.setLpy(linhaProducao.isLpy());
		return linhaProducaoRepository.save(existingProducao);
	}
	

}

package com.gerenciamento.pdep.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerenciamento.pdep.entity.Armazens;
import com.gerenciamento.pdep.repository.ArmazensRepository;

@Service
public class ArmazensService {
	@Autowired
	private ArmazensRepository armazensRepository;
	
	public Armazens saveArmazens(Armazens armazens) {
		return armazensRepository.save(armazens);
	}
	
	public List<Armazens> saveArmazenss(List<Armazens> armazenss) {
		return armazensRepository.saveAll(armazenss);
	}
	
	public List<Armazens> getArmazens() {
		return armazensRepository.findAll();
	}
	
	public Armazens getArmazensById(int id) {
		return armazensRepository.findById(id).orElse(null);
	}
	
	public Armazens getArmazensByFabricaF1(boolean fabricaF1) {
		return armazensRepository.findByFabricaF1(fabricaF1);
	}
	
	public Armazens getArmazensByArmazenA1(boolean armazenA1) {
		return armazensRepository.findByArmazenA1(armazenA1);
	}
	
	public Armazens getArmazensByArmazenA2(boolean armazenA2) {
		return armazensRepository.findByArmazenA1(armazenA2);
	}
	
	public 	String deleteArmazens(int id) {
		armazensRepository.deleteById(id);
		return "Armazen removido" + id;
	}
	
	public Armazens updateArmazens(Armazens armazens) {
		Armazens existingArmazens = armazensRepository.findById(armazens.getId()).orElse(null);
		existingArmazens.setFabricaF1(armazens.isFabricaF1());
		existingArmazens.setArmazenA1(armazens.isArmazenA1());
		existingArmazens.setArmazenA2(armazens.isArmazenA2());
		return armazensRepository.save(existingArmazens);
	}
}

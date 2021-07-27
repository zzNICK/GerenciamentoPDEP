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

import com.gerenciamento.pdep.entity.Armazens;
import com.gerenciamento.pdep.service.ArmazensService;

@RestController
public class ArmazensController {
	@Autowired
	private ArmazensService armazensService;
	
	@PostMapping("/addArmazens")
	public Armazens addArmazens(@RequestBody Armazens armazens) {
		return armazensService.saveArmazens(armazens);
	}
	
	@PostMapping("/addArmazenss")
	public List<Armazens> addArmazenss(@RequestBody List<Armazens> armazenss) {
		return armazensService.saveArmazenss(armazenss);
	}
	
	@GetMapping("/findArmazens")
	public List<Armazens> findAllArmazenss() { 
		return armazensService.getArmazens();
	}
	
	@GetMapping("/ArmazensId/{id}")
	public Armazens findArmazensById(@PathVariable int id) {
		return armazensService.getArmazensById(id);
	}
	
	@PutMapping("/updateArmazens")
	public Armazens updateArmazens(@RequestBody Armazens armazens) {
		return armazensService.updateArmazens(armazens);
	}
	
	@DeleteMapping("/deleteArmazens/{id}")
	public String deletePedido(@PathVariable int id) {
		return armazensService.deleteArmazens(id);
	}

}

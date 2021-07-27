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

import com.gerenciamento.pdep.entity.LinhaProducao;
import com.gerenciamento.pdep.service.LinhaProducaoService;

@RestController
public class LinhaProducaoController {
	@Autowired
	private LinhaProducaoService linhaProducaoService;
	
	@PostMapping("/addProducao")
	public LinhaProducao addProducao(@RequestBody LinhaProducao linhaProducao) {
		return linhaProducaoService.saveProducao(linhaProducao);
	}
	
	@PostMapping("/addProducoes")
	public List <LinhaProducao> addProducoes(@RequestBody List <LinhaProducao> linhaProducao ) {
		return linhaProducaoService.saveAllProducao(linhaProducao);
	}
	
	@GetMapping("/findProducaoId/{id}")
	public LinhaProducao findProducaoId(@PathVariable int id) {
		return linhaProducaoService.getProducaoById(id);
	}
	
	@GetMapping("/findProducao")
	public List <LinhaProducao> findAllProducao() {
		return linhaProducaoService.getProducoes();
	}
	
	@PutMapping("/uptadeProducao")
	public LinhaProducao uptadeProducao(@RequestBody LinhaProducao linhaProducao) {
		return linhaProducaoService.updateProducao(linhaProducao);
	}
	
	@DeleteMapping("/deleteProducao/{id}")
	public String deleteProducao(@PathVariable int id) {
		return linhaProducaoService.deleteProducaoId(id);
	}
}

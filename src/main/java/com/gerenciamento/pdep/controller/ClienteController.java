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

import com.gerenciamento.pdep.entity.Cliente;
import com.gerenciamento.pdep.service.ClienteService;



@RestController
public class ClienteController {

    @Autowired
    private ClienteService service;

    @PostMapping("/addCliente")
    public Cliente addCliente(@RequestBody Cliente cliente) {
        return service.saveCliente(cliente);
    }

    @PostMapping("/addClientes")
    public List<Cliente> addClientes(@RequestBody List<Cliente> clientes) {
        return service.saveClientes(clientes);
    }

    @GetMapping("/clientes")
    public List<Cliente> findAllClientes() {
        return service.getClientes();
    }

    @GetMapping("/clienteByCnpj/{cnpj}")
    public Cliente findClienteById(@PathVariable int cnpj) {
        return service.getClinteByCnpj(cnpj);
    }

    //----------------------------------------------------

    @PutMapping("/update")
    public Cliente updateCliente(@RequestBody Cliente cliente) {
        return service.updateCliente(cliente);
    }

    @DeleteMapping("/delete/{cnpj}")
    public String deleteCliente(@PathVariable int cnpj) {
        return service.deleteCliente(cnpj);
    }
    
    //--------PEDIDO_CONTROLLER
    
}
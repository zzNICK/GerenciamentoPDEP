package com.gerenciamento.pdep.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.gerenciamento.pdep.entity.Cliente;
import com.gerenciamento.pdep.repository.ClienteRepository;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente saveCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public List<Cliente> saveClientes(List<Cliente> clientes) {
		return clienteRepository.saveAll(clientes);
	}
	
	public List<Cliente> getClientes() {
	        return clienteRepository.findAll();
	}
	
	   public Cliente getClinteByCnpj(int cnpj) {
	        return clienteRepository.findById(cnpj).orElse(null);
	    }

	    public Cliente getClienteByClienteNome(String clienteNome) {
	        return clienteRepository.findByClienteNome(clienteNome);
	    }
	    

	    public String deleteCliente(int cnpj) {
	        clienteRepository.deleteById(cnpj);
	        return "Cliente removido com sucesso !! " + cnpj;
	    }

	    public Cliente updateCliente(Cliente cliente) {
	        Cliente existingCliente = clienteRepository.findById(cliente.getCnpj()).orElse(null);
	        existingCliente.setClienteNome(cliente.getClienteNome());
	        existingCliente.setPrioridade(cliente.getPrioridade());
	        return clienteRepository.save(existingCliente);
	    }
	    
	   

}

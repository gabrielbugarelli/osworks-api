package com.algaworks.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Cliente;

@RestController //serve para indicar que a classe é uma rest controladora
public class ClienteController {
	
	@GetMapping("/clientes") //serve para mapear o projeto
	public List<Cliente> Listar() {
		Cliente cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Gabriel");
		cliente1.setEmail("gabrielfonsecaoficial@gmail.com");
		cliente1.setTelefone("65988888-8888");
		
		Cliente cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Robervaldo");
		cliente2.setEmail("robervaldodacunhasilva@gmail.com");
		cliente2.setTelefone("65988888-8888");
	
		return Arrays.asList(cliente1, cliente2);
	}

}

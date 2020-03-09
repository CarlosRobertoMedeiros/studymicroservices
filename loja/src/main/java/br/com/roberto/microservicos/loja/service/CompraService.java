package br.com.roberto.microservicos.loja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.roberto.microservicos.loja.controller.dto.CompraDTO;
import br.com.roberto.microservicos.loja.controller.dto.InfoFornecedorDTO;

@Service
public class CompraService {

	@Autowired
	private RestTemplate client;
	
	public void realizaCompra(CompraDTO compraDto) {
		//A anotação LoadBalanced fez a associação entre fornecedor com fornecedor baseado na spring application
		ResponseEntity<InfoFornecedorDTO> exchange = 
				client.exchange("http://fornecedor/info/"+compraDto.getEndereco().getEstado(),
				HttpMethod.GET, null, InfoFornecedorDTO.class);
		
		System.out.println(exchange.getBody().getEndereco());
		
	}
	
}

package br.com.roberto.microservicos.fornecedor.service;

import org.springframework.data.repository.CrudRepository;

import br.com.roberto.microservicos.fornecedor.model.InfoFornecedor;

public interface InfoRepository extends CrudRepository<InfoFornecedor, Long>{

	InfoFornecedor findByEstado(String estado); 
}

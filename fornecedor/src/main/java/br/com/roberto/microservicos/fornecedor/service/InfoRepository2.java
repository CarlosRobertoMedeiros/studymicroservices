package br.com.roberto.microservicos.fornecedor.service;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.roberto.microservicos.fornecedor.model.InfoFornecedor;

public interface InfoRepository2 extends JpaRepository<InfoFornecedor, Long>{

}

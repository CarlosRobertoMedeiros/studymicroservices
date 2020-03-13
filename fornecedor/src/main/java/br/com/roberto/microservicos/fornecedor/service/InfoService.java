package br.com.roberto.microservicos.fornecedor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.roberto.microservicos.fornecedor.model.InfoFornecedor;

@Service
public class InfoService {

	@Autowired
	private InfoRepository infoRepository;
	
	@Autowired
	private JpaRepository<InfoFornecedor, Long> infoRepository2;

	public InfoFornecedor getInfoPorEstado(String estado) {
		return infoRepository.findByEstado(estado);
	}

	public List<InfoFornecedor> getAll() {
		return infoRepository2.findAll();
	}

}

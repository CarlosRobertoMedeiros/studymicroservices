package br.com.roberto.microservicos.loja.controller.dto;

import java.util.List;

public class CompraDTO {

	private List<ItemsDaCompraDTO> itens;

	private EnderecoDTO endereco;

	public List<ItemsDaCompraDTO> getItens() {
		return itens;
	}

	public void setItens(List<ItemsDaCompraDTO> itens) {
		this.itens = itens;
	}

	public EnderecoDTO getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoDTO endereco) {
		this.endereco = endereco;
	}

}

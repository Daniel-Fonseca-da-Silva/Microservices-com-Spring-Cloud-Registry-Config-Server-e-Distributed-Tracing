package br.com.alura.microservice.loja.dto;

import java.util.List;

public class CompraDTO {
	
	private List<ItemDaCompraDTO> itens;
	private List<EnderecoDTO> endereco;
	
	public List<ItemDaCompraDTO> getItens() {
		return itens;
	}
	public void setItens(List<ItemDaCompraDTO> itens) {
		this.itens = itens;
	}
	public List<EnderecoDTO> getEndereco() {
		return endereco;
	}
	public void setEndereco(List<EnderecoDTO> endereco) {
		this.endereco = endereco;
	}
	
	
	
}

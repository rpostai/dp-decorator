package com.dp.decorator;

public final class ProdutoBase implements Produto {

	private String nome;
	private Integer quantidade;

	public ProdutoBase(String nome, Integer quantidade) {
		this.nome = nome;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String descreverProduto() {
		return "Nome: " + nome + "\n\r" + "Quantidade: " + quantidade + "\n\r";
	}

}

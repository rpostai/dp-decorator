package com.dp.decorator;

public class ProdutoCozinha implements Produto {

	private Produto produto;
	private int numeroPecas;

	public ProdutoCozinha(Produto produto, int numeroPecas) {
		this.produto = produto;
		this.numeroPecas = numeroPecas;
	}

	@Override
	public String descreverProduto() {
		String str = produto.descreverProduto();
		str += "Numero de pe�as: " + numeroPecas;
		return str;
	}

}

package com.dp.decorator;

public class ProdutoTV implements Produto {

	private Produto produto;

	private int polegadas;

	public ProdutoTV(Produto p, int polegadas) {
		this.produto = p;
		this.polegadas = polegadas;
	}

	public int getPolegadas() {
		return polegadas;
	}

	public void setPolegadas(int polegadas) {
		this.polegadas = polegadas;
	}

	@Override
	public String descreverProduto() {
		String str = produto.descreverProduto();
		str += "Polegadas: " + polegadas + "\n\r";
		return str;
	}

}

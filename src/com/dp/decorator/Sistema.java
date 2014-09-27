package com.dp.decorator;

public class Sistema {

	public static void main(String[] args) {
		Produto p = new ProdutoBase("TV", 10);
		Produto p1 = new ProdutoTV(p,40);
		System.out.println(p.descreverProduto());
		System.out.println(p1.descreverProduto());
		
		ProdutoCozinha cozinha =  new ProdutoCozinha(new ProdutoBase("Cozinha",1),5);
		System.out.println(cozinha.descreverProduto());
	}
	
	
}

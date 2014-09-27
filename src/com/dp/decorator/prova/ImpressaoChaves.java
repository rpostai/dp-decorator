package com.dp.decorator.prova;

public class ImpressaoChaves implements Impressao {
	
	private Impressao impressao;

	public ImpressaoChaves(Impressao impressao) {
		this.impressao = impressao;
	}

	@Override
	public void imprimir(int i) {
		System.out.print("{");
		impressao.imprimir(i);
		System.out.print("}");
	}
}

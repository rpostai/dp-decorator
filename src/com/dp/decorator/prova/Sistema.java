package com.dp.decorator.prova;

public class Sistema {

	public static void main(String[] args) {
		Impressao i = new ImpressaoChaves(new ImpressaoColchetes(
				new Impressora()));
		i.imprimir(1);

		Impressao i2 = new ImpressaoColchetes(new ImpressaoChaves(
				new Impressora()));
		i2.imprimir(1);
	}
}

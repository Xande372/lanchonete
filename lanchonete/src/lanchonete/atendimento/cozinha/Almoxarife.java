package lanchonete.atendimento.cozinha;

public class Almoxarife {

	//(private) apenas o almoxarife precisa desse controle.
	private void controlarEntrada() {
		System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
	}

	private void controlarSaida() {
		System.out.println("CONTROLANDO A SAIDA DOS ITENS");
	}

	//métodos default (nível de pacote)
	void entregarIngredientes() {
		System.out.println("ENTREGANDO INGREDIENTES");
		controlarSaida();
	}

	void trocarGas() {
		System.out.println("ALMOXARIFE TROCANDO O GÁS");
	}
}
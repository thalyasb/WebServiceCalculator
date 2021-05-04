package ac.dominio.com.br;

import javax.jws.WebService;

@WebService(endpointInterface = "ac.dominio.com.br.Calculator")
public class CalculatorImpl implements Calculator {

	private float soma(float numero1, float numero2) {

		return numero1 + numero2;
	}

	private float subtracao(float numero1, float numero2) {

		return numero1 - numero2;
	}

	private float multiplicacao(float numero1, float numero2) {

		return numero1 * numero2;
	}

	private float divisao(float numero1, float numero2) {

		return numero1 / numero2;
	}

	@Override
	public String calcular(float numero1, float numero2, String operacao) {
		switch (operacao) {
		case "+":
			return String.valueOf(soma(numero1, numero2));
		case "-":
			return String.valueOf(subtracao(numero1, numero2));
		case "*":
			return String.valueOf(multiplicacao(numero1, numero2));
		case "/":
			return String.valueOf(divisao(numero1, numero2));
		default:
			return "operação não encontrada";
		}
	}

}
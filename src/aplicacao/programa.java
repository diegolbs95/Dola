package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import utilidade.ConversorDeMoeda;

public class programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Qual e o preço do dolar? ");
			double precoDoDolar = sc.nextDouble();
		System.out.print("Quantos dolares serao comprados? ");
			double quantidade = sc.nextDouble();
			double Resultado = ConversorDeMoeda.dolarParaReal(quantidade, precoDoDolar);
		System.out.printf("Valor a ser pago em reais = %.2f%n", Resultado);
		
		
		sc.close();
	}

}

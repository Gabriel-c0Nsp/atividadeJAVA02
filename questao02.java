package atividade_escritorio02;

import java.util.Locale;
import java.util.Scanner;

public class questao02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número");
		double num = sc.nextDouble();
		double raiz = Math.sqrt(num);

		if (num >= 0) {
			System.out.println("A raiz quadrada do número digitado: " + raiz);
		} else {
			System.out.println("Este número é inválido");
		}

		sc.close();
	}
}

package atividade_escritorio02;

import java.util.Locale;
import java.util.Scanner;

public class questao41 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o seu peso");
		double peso = sc.nextDouble();

		System.out.println("Insira a sua altura");
		double altura = sc.nextDouble();

		double IMC = peso / (Math.pow(altura, 2));

		if (peso <= 0 || altura <= 0) {
			System.out.println("Estes não são valores válidos");
		} else if (IMC < 18.5) {
			System.out.println("Abaixo do Peso");
		} else if (IMC >= 18.5 && IMC <= 24.9) {
			System.out.println("Saudável");
		} else if (IMC >= 25 && IMC <= 29.9) {
			System.out.println("Peso em excesso");
		} else if (IMC >= 30 && IMC <= 34.9) {
			System.out.println("Obesidade Grau 1");
		} else if (IMC >= 35 && IMC <= 39.9) {
			System.out.println("Obesidade Graus 2 (severa)");
		} else {
			System.out.println("Obesidade Grau 3 (mórbida)");
		}

		sc.close();
	}

}

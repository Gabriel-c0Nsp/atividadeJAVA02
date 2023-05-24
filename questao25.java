package atividade_escritorio02;

import java.util.Locale;
import java.util.Scanner;

public class questao25 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o valor de a");
		double a = sc.nextDouble();
		System.out.println("Insira o valor de b");
		double b = sc.nextDouble();
		System.out.println("Insira o valor de c");
		double c = sc.nextDouble();

		double delta = Math.pow(b, 2) - 4 * a * c;
		double segundoGrauX1 = (-b + Math.sqrt(delta)) / (2 * a);
		double segundoGrauX2 = (-b - Math.sqrt(delta)) / (2 * a);

		if (a == 0) {
			System.out.println("Não é uma equação do segundo grau");
		} else if (delta < 0) {
			System.out.println("Não existe raiz");
		} else if (delta == 0) {
			System.out.println("Raiz única");
			System.out.println(segundoGrauX1);
			System.out.println(segundoGrauX2);
		} else {
			System.out.println("X1: " + segundoGrauX1);
			System.out.println("X2 :" + segundoGrauX2);
		}

		sc.close();
	}

}

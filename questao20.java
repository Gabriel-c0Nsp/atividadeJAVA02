package atividade_escritorio02;

import java.util.Locale;
import java.util.Scanner;

public class questao20 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os valores dos 3 lados do triângulo");
		double ladoA = sc.nextDouble();
		double ladoB = sc.nextDouble();
		double ladoC = sc.nextDouble();

		if (ladoA <= 0 || ladoB <= 0 || ladoC <= 0) {
			System.out.println("Estes não são valores válidos para um triângulo");
		} else if (ladoA + ladoB < ladoC || ladoB + ladoC < ladoA || ladoC + ladoA < ladoB) {
			System.out.println("Isto não é um triângulo");
		} else if (ladoA == ladoB && ladoB == ladoC) {
			System.out.println("Este é um triângulo equilátero");
		} else if (ladoA == ladoB || ladoB == ladoC || ladoC == ladoA) {
			System.out.println("Este é um triângulo isósceles");
		} else {
			System.out.println("Este é um triângulo escaleno");
		}

		sc.close();
	}
}

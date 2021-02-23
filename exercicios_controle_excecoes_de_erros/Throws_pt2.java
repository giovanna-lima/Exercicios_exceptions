package exercicios_controle_excecoes_de_erros;

import java.util.Scanner;

public class Throws_pt2 {

	public static void main(String[] args) {
		System.out.println("Insira um número decimal");
		try {
			double num = lenum();
			System.out.println("Voce digitou:" + num);
		} catch (Exception e) {
			System.out.println("Entrada inválida");
			e.printStackTrace();
		}

	}

	public static double lenum() throws Exception {
		Scanner cs = new Scanner (System.in);
		double num = cs.nextDouble();
		return num;
		}
}

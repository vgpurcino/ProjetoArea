package projetoArea;

import java.util.Locale;
import java.util.Scanner;

public class ProjetoArea {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double largura;
		double comprimento;
		double valorcomp;
		double area;
		double preco;
		largura = sc.nextDouble();
		sc.nextLine();
		comprimento = sc.nextDouble();
		sc.nextLine();
		valorcomp = sc.nextDouble();
		sc.nextLine();
		area = comprimento * largura;
		preco = area * valorcomp;
		System.out.printf("AREA: %.2f%n", area);
		System.out.printf("PRECO: %.2f", preco);
		sc.close();

	}

}

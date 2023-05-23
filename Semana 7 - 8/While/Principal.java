package exercicios_fixacao5;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int op = 0;
		Scanner scanner = new Scanner(System.in);
		Exercicios e = new Exercicios();

		while(op != 4) {
			System.out.println("\n1 - Contar até 300\n2 - Imprimir pares\n3 - Verificar primo");
			op = scanner.nextInt();
			switch (op) {
				case 1: 
					e.contador(scanner.nextInt());
					break;
				case 2:
					e.imprimePares(scanner.nextInt());
					break;
				case 3:
					if (e.verificaPrimo(scanner.nextInt()))
						System.out.println("É primo");
					else
						System.out.println("Não é primo");
					break;
				default:
					System.out.println("Opção inválida\nDigite novamente.");
					break;
			}		
		}
		
		scanner.close();
	}
}

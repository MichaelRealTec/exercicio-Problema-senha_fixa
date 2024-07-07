package entities;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Exercicio senha_fixa
		
		int senha;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a senha: ");
		senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.print("Senha Invalida! Tente novamente: ");
			senha = sc.nextInt();
		}
		System.out.println("Acesso permitido!");
		
		
		
		sc.close();

	}

}

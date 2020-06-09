package cad;

import java.util.Scanner;

public class Cadastrar {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		
		String nome = scan.nextLine();
		
       System.out.println("Digite sua idade: ");
		
		int idade = scan.nextInt();
		
		System.out.println("Seu nome é: " + nome + "\n" + "Você tem" + idade + "anos");
	}

}

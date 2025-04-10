package br.edu.principal;

import java.util.Scanner;

public class Principal {
//Peça a idade do usuário e diga se ele é maior de idade (18 anos ou mais) 
//ou menor de idade.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite um numero:");
		idade = sc.nextInt();
		 
		if (idade >= 18) {
		System.out.println("Voce é maior de idade");
		}
		else {
		System.out.println("Voce é menor de idade");
		}
	}

}
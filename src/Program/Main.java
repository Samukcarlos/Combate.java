package Program;

import java.util.Locale;
import java.util.Scanner;

import Entites.Champion;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Champion champion = new Champion();
		Champion A, B;
		A = new Champion();
		B = new Champion();

		System.out.println("Digite os dados do primeiro campeão ");
		System.out.print("Name: ");
		A.name = sc.nextLine();
		System.out.print("Vida inicial: ");
		A.life = sc.nextInt();
		System.out.print("Ataque: ");
		B.attack = sc.nextInt();
		System.out.print("Armadura: ");
		A.armor = sc.nextInt();
		System.out.println();
		
		System.out.println("Digite os dados do segundo campeão ");
		System.out.print("Nome: ");
		B.name = sc.next();
		System.out.print("Vida inicial: ");
		B.life = sc.nextInt();
		System.out.print("Ataque: ");
		A.attack = sc.nextInt();
		System.out.print("Armadura: ");
		B.armor = sc.nextInt();
		System.out.println();
		System.out.print("Quantos turnos serão? ");
		int turn = sc.nextInt();
		System.out.println();
		
		for (int i = 0; i < turn; i++) {
			int acc = i + 1;
			System.out.print("Resultado do turno " + acc);
			System.out.println();
			A.takeDamage();
			System.out.println();
			System.out.println(A.toString());
			
			B.takeDamage();
			System.out.println();
			System.out.println(B.toString());
			System.out.println();
			
								
		}
		
		sc.close();
	}
}

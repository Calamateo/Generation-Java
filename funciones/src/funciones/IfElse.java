package funciones;

import java.util.Scanner;

public class IfElse {

	static void access(int age) {
		if(age<18) {
			System.out.println("eres menor de edad");
		}
		else {
			System.out.println("Eres mayor de edad");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Cual es tu edad?");
		access(sc.nextInt());

	}

}

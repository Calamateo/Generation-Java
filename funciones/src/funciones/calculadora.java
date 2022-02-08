package funciones;

import java.util.Scanner;

public class calculadora {

	static double suma (double a,double b) {
		return a+b;
	}
	static double resta (double a,double b) {
		return a-b;
	}
	static double multiplicar (double a,double b) {
		return a*b;
	}
	static double dividir (double a,double b) {
		return a/b;
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int menu =1;
		double a=0;
		double b=0;
		while (menu>0) {
		System.out.println("que operación quiere realizar?");
		System.out.println("1.-Suma\n2.-Resta\n3.-dividir\n4.-Multiplicar\nPresiona 0 para salir");
		menu = sc.nextInt();
		
		switch (menu) {
		case 1:
			System.out.println("Ingrese dos numeros");
			a=sc.nextDouble();
			b=sc.nextDouble();
			System.out.println("Resultado: "+suma(a,b));
			break;
		case 2:
			System.out.println("Ingrese dos numeros");
			a=sc.nextDouble();
			b=sc.nextDouble();
			System.out.println("Resultado: "+resta(a,b));
			break;
		case 3:
			System.out.println("Ingrese dos numeros");
			a=sc.nextDouble();
			b=sc.nextDouble();
			System.out.println("Resultado: "+dividir(a,b));
			break;
		case 4:
			System.out.println("Ingrese dos numeros");
			a=sc.nextDouble();
			b=sc.nextDouble();
			System.out.println("Resultado: "+multiplicar(a,b));
			break;
		case 0:
			System.out.println("Adios");
			break;
		default:
			System.out.println("numero invalido");
			break;
		}	
		
		}
		
			
	}
}

package funciones;

import java.util.Scanner;

public class funcion {
	
	static void datos (String nombre,String ciudad ,int edad) {
		System.out.println(nombre+" tu edad es "+edad+" y vives en "+ciudad);
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Cual es tu nombre?");
		String name =sc.nextLine();
		System.out.println("Donde vives?");
		String city =sc.nextLine();
		System.out.println("Cual es tu edad?");
		int old =sc.nextInt();
		
		datos(name,city,old);
	}
	
	
}

import java.util.Scanner;

public class UserProfile {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Cual es tu nombre?");
		String  nombre= sc.nextLine();
				
		System.out.println("Cual es tu genero");
		String genero= sc.nextLine();
		
		System.out.println("Cual es tu preferencia laboral");
		String trabajo= sc.nextLine();
		
		System.out.println("Cual es tu nacionalidad");
		String nacionalidad= sc.nextLine();
		
		System.out.println("Cual es tu tipo de sangre");
		String sangre= sc.nextLine();
		
		System.out.println("Cual es tu edad");
		int edad= sc.nextInt();
		
		int cumpleaños= 2021 - edad;
		
		System.out.println("Tu naciste en el año "+cumpleaños);
		System.out.println("Nombre: "+nombre+"\nGenero: "+genero);
		System.out.println("Trabajo: "+trabajo+"\nNacionalidad: "+nacionalidad);	
		System.out.println("Sangre: "+sangre+"\nEdad: "+edad);
	}

}

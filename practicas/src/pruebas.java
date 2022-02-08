import java.util.Scanner;

public class pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingresa tu edad: ");
		int age =sc.nextInt();
		
			System.out.println( age >=18 && age <=150 ? "Eres mayor de edad":age>0&&age<18?"Eres menor edad":"Valor fuera de rango");
				
			
	}

}

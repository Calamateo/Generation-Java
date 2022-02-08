package pruebas;

import java.util.Scanner;

public class guilleprueba {

	public static void main(String[] args) {
		
		int lechePrecio = 30;
		int galletasPrecio = 20;
		int frijolesPrecio = 40;
		int kinderPrecio = 10;
		int total;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("//////////////////");
		System.out.println("// Compra 200$  //");
		System.out.println("// y es gratis! //");
		System.out.println("//////////////////");
		
		System.out.println("\nLista de productos:");
		System.out.println("Leche 30$\nCuanto pediras?");
		int leche =sc.nextInt();
		total= leche * lechePrecio;
		System.out.println("Subtotal: "+total+"$\n");
		
		System.out.println("Galletas 20$\nCuanto pediras?");
		int galletas =sc.nextInt();
		total+= galletas * galletasPrecio;
		System.out.println("Subtotal: "+total+"$\n");
		
		System.out.println("Frijoles 40$\nCuanto pediras?");
		int frijoles =sc.nextInt();
		total+= frijoles * frijolesPrecio;
		System.out.println("Subtotal: "+total+"$\n");
		
		System.out.println("kinder delice 10$\nCuanto pediras?");
		int kinder =sc.nextInt();
		total+= kinder * kinderPrecio;
		System.out.println("Fue un total de: "+total+"$\n");
		
		int gratis =200;
		
		System.out.println("Te compra fue igual a 200$?");
		System.out.println(total==gratis);
		
		String gratisS =gratis+"";
		String totalS = total+"";
		
		int var2 = totalS.compareTo (gratisS);
		System.out.println(var2+"0");
	}

}

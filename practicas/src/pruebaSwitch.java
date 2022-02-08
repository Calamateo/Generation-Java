import java.util.Scanner;

public class pruebaSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Elige una opción: ");
		String enter = sc.nextLine();
		
		switch (enter) {
		case "1":
			System.out.println("eligiste la opcion uno");
			break;
		case "2":
			System.out.println("eligiste la opcion dos");
			break;
		default:
			System.out.println("eligiste mal, ingresaste \""+enter+"\"\nElige entre el 1 y el 2");
			break;
		}
		
	}

}

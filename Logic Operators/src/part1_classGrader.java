import java.util.*;

public class part1_classGrader {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Igrese la calificacion del estudiante");
		int calificacion = sc.nextInt();
		
		if (calificacion >= 0 && calificacion <4) {
			System.out.println("Fallaste, sacaste "+calificacion);
		}
		else if (calificacion >3 && calificacion <6) {
			System.out.println("Insuficiente para vivir, sacaste "+calificacion);
		}
		else if (calificacion >5 && calificacion <10) {
			System.out.println("Bieeeeeeen, sacaste "+calificacion);
		}
		else if (calificacion == 10 ) {
			System.out.println("Excelente sacaste "+calificacion);
		}
		else {
			System.out.println("igresa un dato valido, del 0 - 10");
		}
	}

}

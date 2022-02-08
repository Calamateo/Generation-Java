import java.util.*;

public class part2_weightGuruChallenge {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Bienvenido!");
		System.out.println("Ingresa tu altura: ");
		double altura = sc.nextDouble();
		System.out.println("Ingresa tu peso: ");
		double peso = sc.nextDouble();
		
		double imc= peso/Math.pow(altura,2);
		System.out.println("tu IMC es "+imc);
		
		
	}
}

package collections;
import java.util.HashSet;
public class hashSet {

	public static void main(String[] args) {
		HashSet<Integer> numeros = new HashSet<Integer>();
		numeros.add(4);
		numeros.add(1);
		numeros.add(6);
		
		for (int i =1; i<=10;i++) {
			if(numeros.contains(i)) {
				System.out.println(i+" a sido encontrado");
			}else {
				System.out.println(i+ " no a sido encontrado");
			}
		}
			
	}
}

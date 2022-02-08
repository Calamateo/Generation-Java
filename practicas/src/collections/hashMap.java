package collections;
import java.util.HashMap;

public class hashMap {
	public static void main(String[] args) {
		HashMap<String,String> capitalCities = new HashMap<String,String>();
		
		capitalCities.put("Ingland", "London");
		capitalCities.put("Unides Estates", "Washington");
		capitalCities.put("México", "CDMX");
		capitalCities.put("Argentina", "Buenos Aires");
		System.out.println(capitalCities);
	}
}

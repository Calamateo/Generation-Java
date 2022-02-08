
public class Gatitos {
	private String nombre;
	private String color;
	private String raza;
	private String ojos;
	private int edad;
	
	public static void main(String[] args) {
		
		Gatitos gatito1 = new Gatitos("Perejil","Negro","Esfingue","Cafes",4);
		Gatitos gatito2 = new Gatitos("Cilantro","Negro","Esfingue","Azul",3);
		
		System.out.println(gatito1.getNombre());
		System.out.println(gatito2.getNombre());
		System.out.println(gatito1.getColor());
		gatito1.setColor("Verde");
		System.out.println(gatito1.getColor());

		
		
	}
	
	public Gatitos(String nombre, String color, String raza, String ojos, int edad) {
		super();
		this.nombre = nombre;
		this.color = color;
		this.raza = raza;
		this.ojos = ojos;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getOjos() {
		return ojos;
	}

	public void setOjos(String ojos) {
		this.ojos = ojos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	
	
}

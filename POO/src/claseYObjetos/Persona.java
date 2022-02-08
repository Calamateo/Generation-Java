package claseYObjetos;

public class Persona {

	private String nombre;
	private String apellido;
	private int edad;
	
	public static void main(String[] args) {
		
		Persona persona1 = new Persona("Daniel","Calamateo",27);
		System.out.println("Hola "+persona1.getNombre()+" "+persona1.getApellido()+". Tienes "+persona1.getEdad());
		Persona persona2 = new Persona("","",0);
		persona2.setNombre("Felipe");
		
		
	}

	public Persona(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}

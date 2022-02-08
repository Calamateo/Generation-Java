
public class gatito {

		//Crear atributos
		private String nombre;
		private String color;
		private String raza;
		private int edad;
		
		//constructor
		public gatito (String nom, String col, String raz, int ed) {
			this.nombre = nom;
			this.color = col;
			this.raza = raz;
			this.edad = ed;
		}
		
		// Metodos
		
		public String consultarNombre (){ //Consultamos el nombre
		    return nombre;
		}

		public String consultarColor() { //Consultamos el color
			return color;
		}

		public String consultarRaza (){ //Consultamos la raza
		    return raza;
		}

		public int consultarEdad (){ //Consultamos la edad
		    return edad;
		}
		

	
}

package ejercicio1;

public class Persona {
	private String nombre;
	private String apellido;
	private String direccion;

	public Persona() {

	}

	public String getName() {
		return nombre;
	}

	public void setName(String newName) {
		this.nombre = newName;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String newApellido) {
		this.apellido = newApellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String newDireccion) {
		this.direccion = newDireccion;
	}
}

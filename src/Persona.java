import java.sql.Date;

public class Persona {

	private String nombre;
	private String dni;
	private Date fecha_nac;
	
	public Persona(String nombre, String dni, Date fecha_nac) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.fecha_nac = fecha_nac;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Date getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(Date fecha_nac) {
		this.fecha_nac = fecha_nac;
	}
	
	

}

import java.sql.Date;

/**
 * @author Miguel Hidalgo
 * @author Adrián Zamudio - Javadoc
 * @version 1.0
 * Clase encargada de crear objetos de la misma con atributos propios como pueden ser el nombre,
 * DNI y fecha de nacimiento.
*/
public class Persona {

	/**
	 * Nombre identificativo para la persona.
	*/
	private String nombre;
	/**
	 * Identificador como persona física.
	*/
	private String dni;
	/**
	 * Fecha en la que ha nacido la persona.
	*/
	private Date fecha_nac;
	
	/**
	 *  Constructor para la los objetos de la clase persona el cuall
	 *  hace uso de tres parámetros de entrada para dar valor a los atributos
	 *  nombre, dni y fecha_nac.
	 *  @param nombre
	 *  @param dni
	 *  @param fecha_nac
	*/
	public Persona(String nombre, String dni, Date fecha_nac) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.fecha_nac = fecha_nac;
	}

	/**
	 * 	Método para obtener el nombre guardado para cada objeto de persona.
	 * @return Nombre de la persona.
	*/
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método para establecer un valor al atributo nombre.
	 * @param nombre
	*/
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método para obtener el dni guardado para cada objeto de persona.
	 * @return dni de cada persona.
	*/
	public String getDni() {
		return dni;
	}

	/**
	 * Método para establecer un valor al atributo dni.
	 * @param dni
	*/
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * Método para obtener la fecha de nacimiento guardado para cada objeto de persona.
	 * @return fecha de nacimiento de cada persona.
	*/
	public Date getFecha_nac() {
		return fecha_nac;
	}

	/**
	 * Método para establecer un valor al atributo fecha_nac.
	 * @param fecha_nac
	*/
	public void setFecha_nac(Date fecha_nac) {
		this.fecha_nac = fecha_nac;
	}
	
	

}

package IntroduccionPOO;

public class Estudiante {
	private String nombres;
	private String apellidos;
	private String correo;
	private String documento;
	private int edad;

	public Estudiante() {
		
	}

	public Estudiante ( String nombres,String apellidos,String correo,String documento, int edad ) {
		this.nombres=nombres;
		this.apellidos = apellidos;
		this.correo=correo;
		this.documento=documento;
		this.edad=edad;
	}
	public String getNombres() {
		return nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getCorreo() {
		return correo;
	}

	public String getDocumento() {
		return documento;
	}

	public int getEdad() {
		return edad;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}

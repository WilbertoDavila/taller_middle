package middleTaller;

public class Empleado {

	private String nombre;
	private String documento;
	public Cargo cargo;
	
	public Empleado(String nombre, String documento, Cargo cargo){
		super();
		this.nombre = nombre;
		this.documento = documento;
		this.cargo = cargo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public Cargo getCargo() {
		return cargo;
	}
	

}

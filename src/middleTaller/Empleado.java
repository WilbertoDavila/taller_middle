package middleTaller;

public class Empleado {

	private String nombre;
	private String documento;
	public int idCargo;
	
	public Empleado(String nombre, String documento, int idCargo){
		super();
		this.nombre = nombre;
		this.documento = documento;
		this.setIdCargo(idCargo);
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
	public int getIdCargo() {
		return idCargo;
	}
	public void setIdCargo(int idCargo) {
		this.idCargo = idCargo;
	}

}

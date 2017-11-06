package ProyectoRedSocial;

public class Notificacion {
	public String tipo ;
	public String contenido ;
	public int id ;
	public Usuario enviadoPor ;
	
	public Notificacion(String tipo, String contenido, int id, Usuario enviadoPor) {
		this.tipo = tipo;
		this.contenido = contenido;
		this.id = id;
		this.enviadoPor = enviadoPor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Usuario getEnviadoPor() {
		return enviadoPor;
	}

	public void setEnviadoPor(Usuario enviadoPor) {
		this.enviadoPor = enviadoPor;
	} 
}

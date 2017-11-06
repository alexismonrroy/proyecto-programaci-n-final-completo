package ProyectoRedSocial;

public class Mensaje {
	public String contenido ;
	public String emisor ;
	
	public Mensaje(String contenido, String emisor) {
		this.contenido = contenido;
		this.emisor = emisor;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getEmisor() {
		return emisor;
	}

	public void setEmisor(String emisor) {
		this.emisor = emisor;
	}
	public String toString (){
		return emisor+":"+"\n"+contenido+"\n";
	}
}

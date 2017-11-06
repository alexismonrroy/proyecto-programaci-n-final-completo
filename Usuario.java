package ProyectoRedSocial;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuario {
	public String mail ;
	public String contraseña ;
	public String nombre ; 
	public String apellido ;
	public int edad ;
	public String sexo ;
	public boolean estado;
	public static List <Notificacion> notificaciones = new ArrayList<Notificacion>();
	public static List <Publicacion> publicaciones = new ArrayList<Publicacion>();
	public static List <Usuario> amigos = new ArrayList <Usuario>();
	public static List <Mensaje> bandejaEntrada = new ArrayList <Mensaje>();

	public Usuario(String nombre, String apellido,String mail,String contraseña, int edad,String sexo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.contraseña = contraseña;
		this.edad = edad;
		this.sexo = sexo;
	}

	public boolean isEstado() {
		return estado;
	}

	public static List<Mensaje> getBandejaEntrada() {
		return bandejaEntrada;
	}

	public static void setBandejaEntrada(List<Mensaje> bandejaEntrada) {
		Usuario.bandejaEntrada = bandejaEntrada;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public List<Notificacion> getNotificaciones() {
		return notificaciones;
	}

	public void setNotificaciones(List<Notificacion> notificaciones) {
		this.notificaciones = notificaciones;
	}

	public List<Publicacion> getPublicaciones() {
		return publicaciones;
	}

	public void setPublicaciones(List<Publicacion> publicaciones) {
		this.publicaciones = publicaciones;
	}

	public List<Usuario> getAmigos() {
		return amigos;
	}

	public void setAmigos(List<Usuario> amigos) {
		this.amigos = amigos;
	}
	public static void enviarMensaje (){
		String mensaje;
		Scanner sc = new Scanner(System.in);
		boolean existeAmigo = false;
		while (existeAmigo == false){
			System.out.println("A quien le desea enviar este mensaje?");
			String destinatario1 = sc.nextLine();
			for(int i = 0 ; i < amigos.size(); i++){
				if(destinatario1.equals(amigos.get(i).getNombre())){
					existeAmigo = true;
					System.out.println("Escriba su mensaje: ");
					mensaje = sc.nextLine();
					String emisor = RedSocial.usuarioLoggeado.getNombre();
					Mensaje mensaje1 = new Mensaje (mensaje,emisor);
					amigos.get(i).getBandejaEntrada().add(mensaje1);
					System.out.println("Se ha enviado el mensaje con éxito.\n");
				}
			}
			if(!existeAmigo){
				System.out.println("La persona a la cual le quiere enviar este mensaje no se encuentra en su lista de amigos\nAsegurese de que el destinatario esté en su lista de amigos.\n");
			}
		}
	}
	public static void verMensaje(){
		for (int i = 0; i<bandejaEntrada.size();i++){
			System.out.println(bandejaEntrada.get(i));
		}
		System.out.println("\n");
	}
	public static void verAmigos(){
		System.out.println("Lista de amigos:\n");
		for (int i = 0; i<amigos.size();i++){
			System.out.println(amigos.get(i).getNombre());
		}
		System.out.println("\n");
	}
	public static void publicar(){

	}
	public static void cerrarSesion(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Está seguro que quiere cerrar sesión?");
		String x = sc.nextLine();
		if(x.equals("Si")||x.equals("si")){
			RedSocial.inicio = false;
		}
		if(x.equals("No")||x.equals("no")){
		}
	}
	public static void agregarAmigo (){
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el nombre de la persona que quiere agregar");
		String amigo = sc.nextLine();
		boolean existeAmigo = false;
		while (existeAmigo == false){
			for(int i = 0 ; i < RedSocial.usuarios.size(); i++){
				if(amigo.equals(RedSocial.usuarios.get(i).getNombre())){
					amigos.add(RedSocial.usuarios.get(i));
					System.out.println("Se ha agregado a "+amigo+" a su lista de amigos\n");
					existeAmigo = true;
				} 
			}if(!existeAmigo){
				System.out.println("No existe el usuario\n");
			}
		}
	}
	public static void eliminarAmigo (){
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el nombre de la persona que quiere eliminar");
		String amigo = sc.nextLine();
		boolean existeAmigo =  false;
		while (existeAmigo == false){
			for(int i = 0 ; i < amigos.size(); i++){
				if(amigo.equals(amigos.get(i).getNombre())){
					amigos.remove(amigos.get(i));
					System.out.println("Se ha eliminado a "+amigo+" de su lista de amigos\n");
					existeAmigo = true;
				} 
			}
		}
		
	}
	public static void eliminarMensajes (){
		Scanner sc = new Scanner(System.in);
		System.out.println("Se eliminaran todos los mensajes, ¿esta seguro que quiere continuar?");
		String confirmacion = sc.nextLine();
		if(confirmacion.equals("Si")||confirmacion.equals("si")){
			for (int i = 0; i < bandejaEntrada.size(); i++){
				bandejaEntrada.remove(i);
			}
		}
	}
}


package ProyectoRedSocial;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		boolean programaActivo = true;
		while (programaActivo == true){
			while(RedSocial.inicio == false){
				System.out.println("Bienvenido a nuestra Red Social!\n Menú:\n 1. Iniciar sesión \n 2. Registrarse\n 3. Cargar demo\n 4. Salir" );
				Scanner sc = new Scanner(System.in);
				String x = sc.nextLine();
				int y = Integer.parseInt(x);
				if (y == 1){
					RedSocial.iniciarSesion();
				}
				if(y == 2){ 
					RedSocial.registrarse();	
				}
				if (y == 3){
					RedSocial.cargarDemo();
				}
				if (y == 4){
					programaActivo = false;
					System.out.println("El programa ha finalizado.");
				}
			}
			while(RedSocial.inicio == true){
				System.out.println("Bienvenido \nMenú:\n 1. Agregar amigo \n 2. Enviar mensaje\n 3. Ver mensajes\n 4. Eliminar mensajes\n 5. Ver lista de amigos\n 6. Eliminar amigo\n 7. Cerrar sesión\n 8. Salir");
				Scanner sc = new Scanner(System.in);
				String x = sc.nextLine();
				int y = Integer.parseInt(x);
				if (y == 1){
					Usuario.agregarAmigo();
				}
				if (y == 2){
					Usuario.enviarMensaje();
				}
				if (y == 3){
					Usuario.verMensaje();
				}
				if (y == 4){
					Usuario.eliminarMensajes();
				}
				if (y == 5){
					Usuario.verAmigos();
				}
				if (y == 6){
					Usuario.eliminarAmigo();
				}
				if (y == 7){
					Usuario.cerrarSesion();
				}
				if (y == 8){
					System.exit(0);
				}
			}

		}
	}      
}		   


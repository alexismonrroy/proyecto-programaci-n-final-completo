package ProyectoRedSocial;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RedSocial {
	public static List <Usuario> usuarios = new ArrayList <Usuario>();
	public static boolean inicio = false ;
	public static Usuario usuarioLoggeado ;

	public static void iniciarSesion(){
		Scanner sc = new Scanner(System.in);
		int intentos = 5;

		while (intentos > 0 && inicio == false){
			System.out.println("Ingrese su Email");
			String correo = sc.nextLine();
			boolean existeUsuario = false;
			for(int i = 0 ; i < usuarios.size();i++){
				if(usuarios.get(i).getMail().equals(correo)){
					System.out.println("Ingrese su contraseña");
					String contraseña = sc.nextLine();
					existeUsuario = true;
					if(usuarios.get(i).getContraseña().equals(contraseña)){
						System.out.println("Ha ingresado exitosamente");
						inicio = true;
						usuarioLoggeado = usuarios.get(i);
						break;
					} else {
						System.out.println("Contraseña incorrecta\nInténtalo nuevamente\n");
						intentos --;
					}

				}
			}
			if (!existeUsuario){
				System.out.println("Email incorrecto\nInténtalo nuevamente\n");
				intentos --;
				if(intentos == 0){
					System.out.println("Ha excedido el número de intentos");
					System.exit(0);
				}
			}

		}

	}

	public static void registrarse (){
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su nombre");
		String nombre = sc.nextLine();
		System.out.println("Ingrese su apellido");
		String apellido = sc.nextLine();
		System.out.println("Ingrese su correo electrónico");
		String correo = sc.nextLine();
		System.out.println("Ingrese su contraseña");
		String contraseña = sc.nextLine();
		System.out.println("Ingrese su edad");
		String edad  = sc.nextLine();
		int edad2 = Integer.parseInt(edad);
		System.out.println("Ingrese su sexo");
		String sexo = sc.nextLine();
		Usuario usuario1 = new Usuario (nombre, apellido, correo, contraseña, edad2, sexo);
		usuarios.add(usuario1);
		System.out.println("Su usuario se ha creado con éxito\n");
	}
	public static void cargarDemo (){
		Usuario usuario2 = new Usuario ("Gonzalo","Manzzi","Gonzalo427@hotmail.com","hola",16,"Masculino");
		Usuario usuario3 = new Usuario ("Alexis","Monrroy","Alexismonrroy07_@hotmail.com","hola2",16,"Masculino");
		Usuario usuario4 = new Usuario ("Camila","Charlin","Camila010629@hotmail.com","hola3",16,"Femenino");
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		usuarios.add(usuario4);
		System.out.println("Se ha cargado la Demo.\n");
	}
}

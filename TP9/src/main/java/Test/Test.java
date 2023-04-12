package Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import Modelo.Acciones;
import Modelo.Persona;

public class Test {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Persona> personas = new ArrayList<Persona>();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String f1="17/04/1998";
		LocalDate fechaDeNacimiento1 = LocalDate.parse(f1, formato);
		personas.add(new Persona("Celeste","Severich",fechaDeNacimiento1));
		String f2="05/06/1995";
		LocalDate fechaDeNacimiento2 = LocalDate.parse(f2, formato);
		personas.add(new Persona("Karen","Dominguez",fechaDeNacimiento2));
		Acciones accion=new Acciones();
		presentarMenu(personas,accion);
	}
	
	public static void presentarMenu(ArrayList<Persona> personas,Acciones accion) {
		String menu="¿Que deseas hacer?\n";
		menu+="1. Ingresar Persona\n";
		menu+="2. Quitar persona\n";
		menu+="3. Ver todas las personas\n";
		menu+="4. Salir\n";
		int opcion=0;
		do {
			System.out.println(menu);
			Scanner sc = new Scanner(System.in);
			System.out.print("Ingrese una opcion: ");
			opcion = sc.nextInt();
			if(opcion==1) {
				accion.IngresarPersona(personas);
			}
			else if(opcion==2) {
				accion.eliminarPersona(personas);
			}
			else if(opcion==3) {
				accion.mostrarPersona(personas);
			}
			else if(opcion==4) {
				System.out.println("¡Hasta luego!");
			}
			else {
				System.out.println("Ingrese una opvion valida");
			}
		}while(opcion!=4);
	}

}

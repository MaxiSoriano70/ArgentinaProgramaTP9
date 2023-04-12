package Modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Acciones {
	
	public void IngresarPersona(ArrayList<Persona> personas) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese Nombre: ");
		String nombre = sc.nextLine();
		System.out.print("Ingrese Apellido: ");
		String apellido = sc.nextLine();
		System.out.print("Ingrese fecha nacimiento (en formato dd/MM/yyyy): ");
		String fechaNac = sc.nextLine();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaDeNacimiento = LocalDate.parse(fechaNac, formato);
		Persona persona=new Persona(nombre,apellido,fechaDeNacimiento);
		personas.add(persona);
	}
	
	public void eliminarPersona(ArrayList<Persona> personas) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese Nombre de la persona a eliminar: ");
		String nombreBuscado = sc.nextLine();
		boolean aux=false;
		for (int i = 0; i < personas.size(); i++) {
		    Persona p = personas.get(i);
		    if (p.getNombre().equals(nombreBuscado)) {
		        personas.remove(i);
		        aux=true;
		        break;
		    }
		}
		if(aux) {
			System.out.println("La persona fue eliminada con exito");
		}
		else {
			System.out.println("La persona ingresada no se encontro");
		}
	}
	
	public void mostrarPersona(ArrayList<Persona> personas) {
		System.out.print("PERSONAS\n");
		int i=1;
		for (Persona p : personas) {
		    System.out.println(i+". Nombre y apellido: "+p.getNombre()+" "+p.getApellido()+". Fecha de nacimiento: "+p.getFechaDeNacimiento()+"\n");
		    i+=1;
		}
	}
}

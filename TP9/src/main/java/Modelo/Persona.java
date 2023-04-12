package Modelo;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Persona {
	private String Nombre;
	private String Apellido;
	private LocalDate fechaDeNacimiento;
	
	public Persona(String nombre, String apellido, LocalDate fechaDeNacimiento) {
		Nombre = nombre;
		Apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
}

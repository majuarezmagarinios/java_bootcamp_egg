package guia6.entidades;

import java.time.LocalDate;

//Una persona tiene un nombre y una fecha de nacimiento (Tipo Date), constructor vacío,
//constructor parametrizado, get y set. 

public class DatePersona_12 {
	private String name;
	private LocalDate dateBirth;

	public DatePersona_12() {
	}

	public DatePersona_12(String name, LocalDate dateBirth) {
		this.name = name;
		this.dateBirth = dateBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(LocalDate dateBirth) {
		this.dateBirth = dateBirth;
	}

}

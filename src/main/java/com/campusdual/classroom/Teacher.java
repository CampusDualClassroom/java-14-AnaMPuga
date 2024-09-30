package com.campusdual.classroom;

public class Teacher extends Person {

	protected String area;

	public Teacher(String name, String surname, String area) {
		super(name, surname);
		this.area = area;
	}
	public void getDetails(){
		System.out.println("El nombre de esta persona es " + name + ". Su apellido es " + surname + ". Su area es " + area + ".");
	}
}

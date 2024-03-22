package dev.miprimeraclasejava.models;

public class Person {
    public String name;
    public String surnames;
    public String dni;
    public int yearOfBirth;

    public String countryOfBirth;
    public char gender; // 'M', 'H', 'O'

    public Person(String name, String surnames, String dni, int yearOfBirth, String countryOfBirth, char gender) {
        this.name = name;
        this.surnames = surnames;
        this.dni = dni;
        this.yearOfBirth = yearOfBirth;
        this.countryOfBirth = countryOfBirth;
        this.gender = gender;
    }


    public void printToScreen() {
        System.out.println("Nombre: " + name + "\nApellidos: " + surnames + "\nDni: " +
        dni + "\nAño de nacimiento: " + yearOfBirth + "\nPaís de nacimiento: " + countryOfBirth + "\nGénero: " + gender);
    
    }
}

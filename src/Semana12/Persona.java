package Semana12;

import java.util.Scanner;

public class Persona {
    //Variables globales
    String nombre;
    String cedula;
    char sexo;
    int edad;
    double altura;
    double peso;
    
    //Por defecto
    public Persona(Scanner eScanner) {
        
        System.out.print("Ingrese nombre: ");
        this.nombre = eScanner.next();
        System.out.print("Ingrese cedula: ");
        this.cedula = eScanner.next();
        System.out.print("Ingrese sexo: ");
        this.sexo = eScanner.next().toLowerCase().charAt(0);
        System.out.print("Ingrese edad: ");
        this.edad = eScanner.nextInt();
        System.out.print("Ingrese peso en kg: ");
        this.altura = eScanner.nextDouble();
        System.out.print("Ingrese estatura en metros: ");
        this.peso = eScanner.nextDouble();
        
        
    }

    //Valores dados
    public Persona(String nombre, String cedula, char sexo ,int edad,double altura, double peso){
        this.nombre = nombre;
        this.cedula = cedula;
        this.sexo = sexo;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }
    
    public String saludar(Persona p){
        return "Hola " +  p.nombre + " soy " + this.nombre;
    }

    public String datosPersona() {
        return  "\n********************************\n"+
                "Nombre: " + this.nombre +
                "\nCedula: " + this.cedula +
                "\nSexo: " + this.sexo + 
                "\nEdad: " + this.edad + 
                "\nAltura: " + this.altura + 
                "\nPeso: " + this.peso +
                "\n********************************\n";
    }
    
    public void imprimirVectorPersonas(Persona[] vPersona0){
        for (int i = 0; i < vPersona0.length; i++) {
            System.out.println("\nPersona #" + (i+1));
            System.out.println(vPersona0[i].datosPersona());
        }
    }
    
}

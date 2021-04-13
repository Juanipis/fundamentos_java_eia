package Semana12;

public class Persona {
    //Variables globales
    String nombre;
    String cedula;
    char sexo;
    int edad;
    double altura;
    double peso;

    //Por defecto
    Persona(){
        nombre = "Jhon Doe";
        cedula = "0000000000";
        sexo = 'u';
        edad = 0;
        altura = 0;
        peso = 0;
    }

    //Valores dados
    Persona(String nombre, String cedula, char sexo ,int edad,double altura, double peso){
        this.nombre = nombre;
        this.cedula = cedula;
        this.sexo = sexo;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    public String datosPersona() {
        return "Nombre: " + this.nombre +
                "\nCedula: " + this.cedula +
                "\nSexo: " + this.sexo + 
                "\nEdad: " + this.edad + 
                "\nAltura: " + this.altura + 
                "\nPeso: " + this.peso;
    }
}

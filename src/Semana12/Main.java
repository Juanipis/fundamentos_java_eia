package Semana12;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner eScanner = new Scanner(System.in);
        
        //Clase AhorroVoluntario
        AhorroVoluntario persona = new AhorroVoluntario("Juan Pablo Díaz Correa", 0);
        persona.ingresarDinero(100000);
        persona.retirarDinero(25000);
        System.out.println(persona.informacionActual());


        //Clase fruta
        /* 
        Producto fruta = new Producto(eScanner);
        fruta.imprimirTotal();
        */

        //Clase persona
        /*
        Persona persona1 = new Persona("Juan","1000871858",17,65.7,1.78);
        Persona persona2 = new Persona();
        */
        
        /*
        //Vector directo
        System.out.print("¿Cuantas personas desea ingresar?: ");
        Persona[] vPersona0 = new Persona[eScanner.nextInt()];

        for (int i = 0; i < vPersona0.length; i++) {
            System.out.printf("Persona #%s%n",(i+1));
            vPersona0[i] =  new Persona(eScanner);
        }
        vPersona0[0].imprimirVectorPersonas(vPersona0);
        System.out.print(vPersona0[0].saludar(vPersona0[vPersona0.length-1]));
        */
        
        

        /* //Vector con arraylist
        ArrayList<Persona> personaArrayList = new ArrayList<Persona>();
        int i = 0;
        while (true) {
            System.out.println("\nPersona #" +i);
            System.out.print("Ingrese nombre: ");
            String nombre = eScanner.next();
            System.out.print("Ingrese cedula: ");
            String cedula = eScanner.next();
            System.out.print("Ingrese edad: ");
            int edad = eScanner.nextInt();
            System.out.print("Ingrese peso en kg: ");
            double peso = eScanner.nextDouble();
            System.out.print("Ingrese estatura en metros: ");
            double estatura = eScanner.nextDouble();
            personaArrayList.add(new Persona(nombre, cedula, edad, peso, estatura));
            
            System.out.print("Desea agregar más personas S/n: ");
            if(eScanner.next().toLowerCase().charAt(0) == 'n' ){
                break;
            }
            else{
                i++;
            }
        }
        i = 0;
        for (Persona ePersona: personaArrayList) {
            System.out.println("Persona #" + i);
            System.out.println(ePersona.datosPersona());
            i++;
        }
        */

        //Cierra el Scanner
        eScanner.close();
    }
}

/*
	*Autor: Juan Pablo D�az Correa
	*GitHub: @Juanipis
	*Twitter: @Juanipis
	*Date: 27/03/2021
  *Link del UML https://eiaedu-my.sharepoint.com/:u:/g/personal/juan_diaz73_eia_edu_co/ESOHDa5edkZMn66W9Js9hSwBwrih1aab2KBOsOahIRwa7w?e=ABTBEm 
*/
package Semana13;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    OperarNumero operar = new OperarNumero(1);
    Scanner scanner = new Scanner(System.in);

    String instrucciones = String.format("--------- %n¿Qué deses hacer?%n 1. Obtener Numero %n 2. Establecer numero %n 3. Ver cantidad digitos %n 4. Mostrar invertido %n 5. Mostrar factores primos %n 6. Salir %n---------");
    boolean salir = false;
    System.out.println("Bienvenido a la calculadora de Juan 🤖");
    do{
      System.out.println(instrucciones);
      System.out.print(">>> ");
      switch (scanner.nextInt()) {
        case 1:
          System.out.printf("Su numero es: %d %n", operar.getNumeroEntero());
          break;
      
        case 2:
          System.out.print("Escribe tu nuevo numero: ");
          operar.setNumeroEntero(scanner.nextInt());
          System.out.printf("Su nuevo numero es: %d %n", operar.getNumeroEntero());
          break;
        
        case 3:
          System.out.printf("Tu cantidad de digitos es: %d %n", operar.numeroDigitos());
          break;
        
        case 4:
          System.out.printf("Tu numero invertido es: %n");
          operar.mostrarInvertido();
          break;
        
        case 5:
          System.out.print("Los factores primos de tu numero son: ");
          operar.mostrarFactoresPrimos();
          break;
        
        default:
          salir = true;
          System.out.println("Hasta luego 👋");
          break;
      }
      
    }while(!salir);
    scanner.close();
  }
}

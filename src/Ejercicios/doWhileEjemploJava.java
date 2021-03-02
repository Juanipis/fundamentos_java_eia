package Ejercicios;

import java.util.*;

public class doWhileEjemploJava {
    public static void main(String[] args) {
        Scanner Juanipis = new Scanner(System.in);
        String secreto = "Juanipis es bello";
        String resultado;
        do {
            System.out.print("Escribe el secreto: ");
            resultado = Juanipis.nextLine();
        } while (!secreto.equals(resultado));

        System.out.println("has descubierto el secreto");
    }
}

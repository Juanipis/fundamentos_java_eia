package semana6;

import java.util.Scanner;
import java.security.SecureRandom;

public class Clase6 {
    public static void main(String[] args) {
        PedirVector ejercicio = new PedirVector();
        /*
        System.out.println(ejercicio.VectoresNotas());
        String[] frutas = ejercicio.VectoresFrutas();
        */
        ejercicio.MenorMayorVector();
        
    }
}

/**
 * PedirVector
 */

class PedirVector {
    
    SecureRandom rand = new SecureRandom();

    public String VectoresNotas() {
        double promedio = 0;
        Scanner entrada = new Scanner(System.in);
        try {
            System.out.print("Ingrese el tamaño de las notas: ");
            int n = entrada.nextInt();
            int [] vector = new int[n];
            //Añadir valores
            for (int i = 0; i < vector.length; i++) {
                vector[i] = rand.nextInt(100);
            }
            //Calcular promedio
            for (int i = 0; i < vector.length; i++) {
                System.out.println(vector[i]);
                promedio+= vector[i];
            }
            promedio /= vector.length;
            //Encontrar el mayor
            int numeroMayor = vector[0];
            int numeroMenor = vector[0];
            for (int i = 0; i < vector.length; i++) {
                if(numeroMayor < vector[i]){
                    numeroMayor = vector[i];
                }
                if (numeroMenor > vector[i]) {
                    numeroMenor = vector[i];
                }
            }

            entrada.close();
            return "El promedio de las notas es: " + (promedio) + "\nEl numero mayor es: " + numeroMayor + "\nEl numero menor es: " + numeroMenor;


        } catch (Exception e) {
            System.out.println("Escribiste un valor erroneo");
        }
        return VectoresNotas();
        
    }

    public String[] VectoresFrutas() {
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Escribe la cantida de frutas a utilizar: ");
            String[] vector = new String[entrada.nextInt()];
            int i = 0;
            String nombreFruta;
            do {
                try {
                    System.out.print("Escriba el nombre de la fruta numero " + i);
                    nombreFruta = entrada.next();
                    vector[i] = nombreFruta.toLowerCase();
                    i++;
                } catch (Exception e) {
                    System.out.print("No escribiste un nombre, vuelve a intentarlo");
                }
            } while (i < vector.length);
            entrada.close();
            return vector;
        } catch (Exception e) {
            System.out.print("Escribiste una cantidad erronea, vuelve a intentarlo");
        }
        return VectoresFrutas();
    }
    public Boolean CompararVectorFrutas(String nombreFruta ,String[] vector) {
        for (int i = 0; i < vector.length; i++) {
            if(vector[i].equals(nombreFruta.toLowerCase())){
                return true;
            }
        }
        return false;
    }

    public void MenorMayorVector() {

            int n = 10;
            int [] vector = new int[n];
            //Añadir valores
            for (int i = 0; i < vector.length; i++) {
                vector[i] = rand.nextInt(100);
                System.out.print(" "+vector[i]);
            }
            System.out.println("\n" +  vector.length + "tamaño vector\n");
            //Ordenamiento en burbuja
            for (int i = 0; i < vector.length; i++) {
                for (int j = 0; j < vector.length-i-1; j++) {
                    int valorJ = vector[j];
                    int valorJ1 = vector[j+1];
                    System.out.println(valorJ + " : " + valorJ1);
                    if(vector[j] > vector[j+1]){
                        vector[j] = valorJ1;
                        vector[j+1] = valorJ;
                    }
                    ImprimirVector(vector);
                    
                }
            }
            
    }
    public void ImprimirVector(int [] vector) {
        System.out.println("-------------");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" " + vector[i]);
        }
        System.out.println("\n-------------");
    }
    
}

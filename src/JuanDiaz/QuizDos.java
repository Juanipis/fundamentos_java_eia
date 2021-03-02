package JuanDiaz;
import java.security.SecureRandom;
import java.util.Scanner;

public class QuizDos {
    public static void main(String[] args) {
        Pensador pensador = new Pensador();
        Adivino adivino = new Adivino();
        System.out.println("Bienvenido a adivina el número secreto");
        
        int numeroPensador = pensador.numero;
        //Si quieres probar el codigo descomenta la siguiente linea
        //System.out.println(numeroPensador);
        
        Boolean condicion = false;
        while (!condicion) {
            condicion = adivino.pedirNumero(numeroPensador, 10);
        }
        if (adivino.puntosTotales > 0) {
            System.out.println("Felicitaciones! Has adivinado el número secreto y tu puntuación es de " + adivino.puntosTotales + " puntos");
        }
        else{
            System.out.println("Lo siento no has acertado");
        }

        

    }
}

class Pensador{
    public SecureRandom rand = new SecureRandom();
    public int numero = rand.nextInt(999-100+1)+100;
    
}

class Adivino{
    public int puntosTotales;
    

    public Boolean pedirNumero(int numeroPensador, int cuenta) {
        Scanner entrada = new Scanner(System.in);
        int numeroUser;
        if(cuenta > 0)
        {
            try {
                System.out.println("Te quedan " +  cuenta + " puntos");
                System.out.print("Ingresa el numero: ");
                numeroUser = entrada.nextInt();
                if(numeroUser < 100 || numeroUser > 999){
                    System.out.println("Fuera del rango, intentalo de nuevo");
                    return pedirNumero(numeroPensador, cuenta);
                }
                else{
                    if(numeroUser == numeroPensador){
                        puntosTotales = cuenta;
                        return true;
                    }
                    else if( numeroUser > numeroPensador){
                        System.out.println("Fallaste. El número pensado es menor que el tuyo.");
                        return pedirNumero(numeroPensador, cuenta-1);
                    }
                    else if( numeroUser < numeroPensador){
                        System.out.println("Fallaste. El número pensado es mayor que el tuyo ");
                        return pedirNumero(numeroPensador, cuenta-1);
                    }
                }
                
            } catch (Exception e) {
                return pedirNumero(numeroPensador, cuenta);
            }
            return true;
        }
        else{
            return true;
        }
        
    }
}

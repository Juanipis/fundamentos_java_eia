package semana9;
import java.util.Scanner;

public class EjerciciosParcial {
    public static void main(String[] args) {
        /*
        Tailor tailor = new Tailor();
        Scanner entrada = new Scanner(System.in);
        double valorX;
        do {
            System.out.println("Ingrese un valor de x (-1,1] para calcular ln(1+x): ");
            valorX = entrada.nextDouble();
        } while ((valorX > -1 && valorX <= 1) == false);
        System.out.println("Ingrese la cantidad de terminos: ");
        int terminos = entrada.nextInt();
        System.out.println("El resultado es: " + tailor.serie(valorX, terminos));
        entrada.close();
        */
        /*
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.fibonacciFor(20);
        */

        int variable = 2;
        do {
            System.out.println("Exito");
        } while (variable > 2);
        while(variable > 2){
            System.out.println("Rocas");
        }
    }
}

class Tailor{
    public double serie(double x, int termino){
        if(termino == 0){
            return x;
        }
        else if(termino%2 == 0){
            return x - serie((Math.pow(x, termino)/termino), termino-1);
        }
        else{
            return x + serie((Math.pow(x, termino)/termino), termino-1);
        }
        
    }
}

class Fibonacci{
    public int fibonacci(int x){
        if(x == 1){
            return 1;
        }
        else if (x==0){  // caso base
            return 0;
        }
        else{
            return fibonacci(x-1) + fibonacci(x-2);
        }
    }

    public void fibonacciFor(int valorSuma){
        int primerTermino = 0;
        int segundoTermino = 1;
        int suma = 0;
        while(suma < valorSuma){
            if(primerTermino + segundoTermino > valorSuma)
            {
                break;
            }
            else{
                suma = primerTermino + segundoTermino;
                System.out.println(suma);
                primerTermino = segundoTermino;
                segundoTermino = suma;
            } 
        }
    }
}
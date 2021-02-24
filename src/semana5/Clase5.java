package semana5;
import java.util.Scanner;
import java.security.SecureRandom;
/*
	*Autor: Juan Pablo D�az Correa
	*GitHub: @Juanipis
	*Twitter: @Juanipis
	*Date: 23/02/2021
*/
class Clase5{
    public static void main(String[] args) {
        Ejercicios ejercicios = new Ejercicios();
        Scanner entrada = new Scanner(System.in);
        /*
        System.out.print("Digite el numero máximo: ");
        int maximo = entrada.nextInt();
        System.out.println(ejercicios.cicloFor(maximo));
        */
        /*
        System.out.print("Digite el numero máximo para n terminos: ");
        double maximo = entrada.nextDouble();
        //System.out.println(ejercicios.cicloFor2(maximo));
        */

        /*
        System.out.print("Digite el numero que quiere saber si es un numero primo: ");
        int primo = entrada.nextInt();
        System.out.println("El numero " + primo + ", ¿Es primo?: " + ejercicios.numeroPrimo(primo));
        entrada.close();
        */

        System.out.print("Escribe tu numero para hallar factorial: ");
        int numeroFactorial = entrada.nextInt();
        int factorial = ejercicios.factorial(numeroFactorial);
        System.out.printf("!%d = %d ",numeroFactorial, factorial);
    }
}

class Ejercicios{
    Scanner escaner = new Scanner(System.in);

    public int cicloFor (int maximo) {
        int suma = 0;
        for (int i = 0; i <= maximo; i++) {
            suma += i;
        }
        return suma;
    }

    public double cicloFor2(double maximo){
        double total = 0;
        for (int i = 1; i <= maximo; i++) {
            total += 1/(1+Math.pow(i, 2));
            System.out.println(total);
        }
        return total;
    }

    public boolean numeroPrimo(int numero){
        numero = Math.abs(numero);
        if( (numero%2 != 0 || numero == 2) && 
            (numero%3 != 0 || numero == 3) && 
            (numero%5 != 0 || numero == 5) && 
            (numero%7 != 0 || numero == 7)){
            return true;
        }
        else{
            return false;
        }
    }

    public void cuadradosEnteros(){
        // Los primeros 100 numeros enteros positivos al cuadrado
        for (int i = 1; i <= 100; i++) {
            System.out.println(Math.pow(i,2));
        }
    }

    public void cuadradosEnterosImpares() {
        //Cuadrado de los primeros 100 numeros impares
        for (int i = 1; i <= 100; i++) {
            if(i%2 != 0){
                System.out.println(Math.pow(i, 2));
            }
        }
    }

    public void notasEstudiantesRandom(){
        //Se dan 5 notas aleatorias entre 0 y 5 (con decimales) y se saca el promedio
        double total = 0;
        double promedio;
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < 5; i++) {
            total += random.nextDouble()*5.0;
        }
        promedio = total/5;
        System.out.printf("El promedio de notas es: %.2f \n", promedio);
    }

    public void notasEstudiantes(){
        double total = 0;
        double promedio;
        double nota;
        for (int i = 0; i < 5; i++) {
            do {
                System.out.printf("Escribe la nota numero: %n", i);
                nota = escaner.nextDouble();
            } while (nota > 0 || nota < 5);
            total += nota;
        }
        promedio = total/5;
        System.out.printf("El promedio de notas es: %.2f \n", promedio);
    }

    public void serieNumeros() {
        int numerador = 3;
        int denominador = 2;
        for(int i = 0; i<14; i+=2){
            System.out.printf("%d / %d \n", numerador+i,denominador+i);
        }
    }

    public void serieNumerosPedidos(){
        System.out.print("Escribe cuantas veces quieres la serie de numeros");
        int veces = escaner.nextInt();
        int numerador = 3;
        for(int i = 1; i <= veces; i++){
            System.out.printf("%d / %d \n", numerador+i+1,numerador+i-1);
        }
    }

    public int factorial(int numero){
        if(numero == 1){
            return numero;
        }
        else{
            return numero*factorial(numero-1);
        }
    }
}

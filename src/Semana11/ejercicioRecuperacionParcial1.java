/*
	*Autor: Juan Pablo Díaz Correa
	*GitHub: @Juanipis
	*Twitter: @Juanipis
	*Date: 6/04/2021
*/
package Semana11;
import java.security.SecureRandom;

public class ejercicioRecuperacionParcial1 {
    public static void main(String[] args) {
        //Objetos
        SecureRandom random = new SecureRandom();

        //Variables
        int maxN = 50;
        int minN = 2;
        
        int N = random.nextInt((maxN-minN)+1)+minN;
        double[] covidSemanas = new double[N];
        for (int t = 0; t < covidSemanas.length; t++) {
            double valor = 2/(1+3*Math.exp(-0.8*t));
            covidSemanas[t] = valor;
        }

        //Promedio expansión del virus en semanas primas
        int contadorVirusPrimo = 0;
        double sumaVirusPrimo = 0;
        for (int i = 0; i < covidSemanas.length; i++) {
            //Comprobar numero primo
            if(((i == 2 || i == 3 || i == 5 || i == 7) || (i%2 !=0 && i%3 !=0 && i%5!=0 && i%7!=0)) && i!=1){
                sumaVirusPrimo += covidSemanas[i];
                contadorVirusPrimo++;
            }
        }
        double promedioVirusPrimo = (double) sumaVirusPrimo/contadorVirusPrimo;
        System.out.println("El promedio de expansión del virus para las semanas primas es: " + promedioVirusPrimo);


        //Promedio de expansión del virus para las semanas impares
        int contadorVirusImpar = 0;
        double sumaVirusImpar = 0;
        for (int i = 1; i < covidSemanas.length; i+=2) {
            sumaVirusImpar += covidSemanas[i];
            contadorVirusImpar++;
        }
        double promedioVirusImpar = (double) sumaVirusImpar/contadorVirusImpar;
        System.out.println("El promedio de expansión del virus para las semanas impares es: " + promedioVirusImpar);


        //Promedio total de expansión del virus
        double sumaVirusTotal = 0;
        for (int i = 0; i < covidSemanas.length; i++) {
            sumaVirusTotal += covidSemanas[i];
        }
        double promedioVirusTotal = sumaVirusTotal/covidSemanas.length;
        System.out.println("El promedio de expansión del virus es: " + promedioVirusTotal);
    }
}

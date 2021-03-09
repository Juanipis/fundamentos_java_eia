  
package semana4;
/*
    *Autor: Juan Pablo Díaz Correa
    *GitHub: @Juanipis
    *Twitter: @Juanipis
    *Date: 26/02/2021
*/
import java.io.FileWriter;
import java.math.BigInteger;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        Solucion recursivo = new Solucion();
        FileWriter fichero = null;
        Scanner eScanner = new Scanner(System.in);
        
        try {
            System.out.print("Escribe un numero mayor que cero para sacar factorial: ");
            String numero = eScanner.nextLine();
            int test = Integer.parseInt(numero) + 1;
            if(test > 0){
                String numeroTotal = "" + test;
                System.out.print("Escribe el nombre de tu fichero: ");
                String nombreFichero = eScanner.nextLine() + ".txt";
                recursivo.factorial(new BigInteger(numeroTotal) , fichero, nombreFichero);
                System.out.println("¡Fichero creado!");
            }
            else{
                System.out.println("Tu numero no es mayor que 0");
            }
        } catch (Exception e) {
            System.out.println("No escribiste el numero correctamente,");
        }
        eScanner.close();
    }
}
class Solucion{
    BigInteger totalFactorial = new BigInteger("1");
    public void factorial(BigInteger numero, FileWriter fichero, String nombreFichero){
        try {
            fichero = new FileWriter(nombreFichero);
            for (BigInteger i = new BigInteger("1"); 1 == numero.compareTo(i); i = i.add(new BigInteger("1"))) {
                totalFactorial = totalFactorial.multiply(i);
                numString(i);
                fichero.write(String.format("%d! = %s = %d\n" ,i,numString(i),totalFactorial));
            }
            fichero.close();
        } catch (Exception ex) {
            System.out.println("Error : " + ex.getMessage());
        }
        
        
    }
    public String numString(BigInteger number){
        String resultado = "";
        for (BigInteger i = number; 1 == i.compareTo(new BigInteger("0")); i = i.subtract(new BigInteger("1"))) {
            if( 0 == i.compareTo(new BigInteger("1"))){
                resultado += i;
            }
            else{
                resultado += i + " * ";
            }
        }
        return resultado;
    }
}
package semana4;
/*
    *Autor: Juan Pablo Díaz Correa
    *GitHub: @Juanipis
    *Twitter: @Juanipis
    *Date: 23/02/2021
*/


public class Solution {
    public static void main(String[] arg) {
        Solucion recursivo = new Solucion();
        recursivo.factorial(10);
    }
}
class Solucion{
    public void factorial(int numero){
        int totalFactorial = 1;
        for (int i = 1; i <= numero; i++) {
            totalFactorial *= i;
            System.out.printf("%d! = %s = %d\n" ,i,recursiveString(i),totalFactorial);
        }
    }
    public String numString(int number){
        String resultado = "";
        for (int i = number; i > 0; i--) {
            if(i == 1){resultado += i;}
            else{resultado += i + " * ";}
        }
        return resultado;
    }

    public String recursiveString(int numero){
        if(numero == 1){
            return "" + numero;
        }
        else{
            return numero + " * " + recursiveString(numero-1);   
        }
    }
}
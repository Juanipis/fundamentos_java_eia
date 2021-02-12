/*
	*Autor: Juan Pablo Díaz Correa
	*GitHub: @Juanipis
	*Twitter: @Juanipis
	*Date: 12/02/2021
*/

package Ejercicios;

public class Condicionales {
    public static void main(String[] args){
        int a1, b1, c1;
        a1 = 1;
        b1 = 4;
        c1 = -5;
        MayorMedioMenor comparador = new MayorMedioMenor();
        String resultado = comparador.ordenar(a1,b1,c1);
        System.out.println(resultado);

        Raices raices = new Raices();
        double al = 1;
        double bl = 5;
        double cl = -6;
        String resultadoRaices = raices.compare(al, bl, cl);
        System.out.println(resultadoRaices);
    }
    
}

class MayorMedioMenor{
    public String ordenar(int a, int b, int c) {
        if(a > b && a > c){
            if(b > c){
                return "A: " + a + " B: " + b + " C: " + c ;
            }
            else{
                return "A: " + a + " C: " + c + " B: " + b ;
            }
        }
        else if(b > a && b > c){
            if(a > c){
                return "B: " + b + " A: " + a + " C: " + c ;
            }
            else{
                return "B: " + b + " C: " + c + " A: " + a ;
            }
        }
        else if(c > a && c > b){
            if(b > a){
                return "C: " + c + " B: " + b + " A: " + a ;
            }
            else{
                return "C: " + c + " A: " + a + " B: " + b ;
            }
        }
        return "No pude lograrlo :(";
    }
}

class Raices{
    public String compare(double a, double b, double c){
        double positivo = calculoPositivo(a, b, c);
        double negativo = calculoNegativo(a, b, c);
        if(Double.isNaN(positivo))
        {
            if(Double.isNaN(negativo)){
                return "No hay raiz positiva real ni negativa";
            }
            else{
                return "No hay raiz positiva real" + ", pero si hay raiz negativa = " + negativo;
            }
        }
        else{
            if(Double.isNaN(negativo)){
                return "La raiz positiva es = " + positivo + ", pero no hay raiz negativa";
            }
            else{
                return "La raiz positiva es = " + positivo + ", y la raiz negativa es = " + negativo;
            }
        }
    }

    public double calculoPositivo(double a, double b, double c){
        //Esta funcion determina el +- como +    
        double numerator = -b + (Math.sqrt(Math.pow(b, 2)-(4*a*c)));    
        double denominator = 2*a;
        return numerator/denominator;
    }

    public double calculoNegativo(double a, double b, double c){
        //Esta funcion determina el +- como -
        double numerator = -b - (Math.sqrt(Math.pow(b, 2)-(4*a*c)));
        double denominator = 2*a;
        return numerator/denominator;
    }
}


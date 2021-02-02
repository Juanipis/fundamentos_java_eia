/*
	*Autor: Juan Pablo D�az Correa
	*GitHub: @Juanipis
	*Twitter: @Juanipis
	*Date: 2/02/2021
*/
package semana2;

public class Clase2 {
    public static void main(String[] args) {
        TrabajoClase3 clase3 = new TrabajoClase3();
        clase3.puntoK(1f, 2f, 7f);
    }
}

class OperadorMasIgual{
    int contador = 0, acumulador = 0; //Azucar sintactico
    public void ejecucion(){
        // Declaración de las variables
        // Tipo_dato Nombre;
        System.out.println("Contador = " + contador + "\t Acumulador: " + contador);

        contador = contador +3;
        acumulador += contador;
        System.out.println("Contador = " + contador + "\t Acumulador: " + contador);

        contador += 3;
        acumulador += contador;
        System.out.println("Contador = " + contador + "\t Acumulador: " + contador);
        
        //Ejemplo en ciclo for
        for(int i = 0; i < 100; i+=3){
            contador += i;
            acumulador += contador;
            System.out.println("Contador = " + contador + "\t Acumulador: " + contador);
        }
    }
}

class OperadorMasMas{
    int contador = 0, acumulador = 0;
    public void ejecucion(){
        System.out.println("Contador = " + contador + "\t Acumulador: " + contador);

        contador = contador ++;
        acumulador += contador;
        System.out.println("Contador = " + contador + "\t Acumulador: " + contador);

        contador ++;
        acumulador += contador;
        System.out.println("Contador = " + contador + "\t Acumulador: " + contador);
    }
}

class OperadorMenosMenos{
    int contador = 0, acumulador = 0;
    public void ejecucion(){
        System.out.println("Contador = " + contador + "\t Acumulador: " + contador);

        contador = contador --;
        acumulador += contador;
        System.out.println("Contador = " + contador + "\t Acumulador: " + contador);

        contador --;
        acumulador += contador;
        System.out.println("Contador = " + contador + "\t Acumulador: " + contador);
    }
}

class OperadorDivisior{
    int contador = 0, acumulador = 0;
    public void ejecucion(){
        System.out.println("Contador = " + contador + "\t Acumulador: " + contador);

        contador = 7;
        contador /= 7;
        System.out.println("Contador = " + contador + "\t Acumulador: " + contador);
    }
}

class OperadorModulo{
    int contador = 0, acumulador = 0;
    public void ejecucion(){
        System.out.println("Contador = " + contador + "\t Acumulador: " + contador);

        contador = 7;
        contador %= 7;
        System.out.println("Contador = " + contador + "\t Acumulador: " + contador);
    }
}

class LibreriaPortencia{
    int contador = 0, acumulador = 0;
    public void ejecucion(){
        System.out.println("Contador = " + contador + "\t Acumulador: " + contador);

        contador += 3;
        double potencia = Math.pow(contador, 5);
        System.out.println("Raiz de potencia = " + potencia);
    }
}

class LibreriaRaiz{
    int contador = 0, acumulador = 0;
    public void ejecucion(){
        System.out.println("Contador = " + contador + "\t Acumulador: " + contador);

        contador += 3;
        double raiz = Math.sqrt(contador);
        System.out.println("Raiz de contador = " + raiz);
    }
}

class OperadoresLogicos{
    boolean verdadero = true;
    boolean falso = false;

    public void ejecucionConjuncion(){
        // && - conjunción
        System.out.println("Conjuncion");
        System.out.println(verdadero && verdadero);
        System.out.println(verdadero && falso);
        System.out.println(falso && falso);
        System.out.println(falso && verdadero);
    }

    public void ejecucionDisyuncion(){
        // || - Disyuncion
        System.out.println("Disyuncion");
        System.out.println(verdadero || verdadero);
        System.out.println(verdadero || falso);
        System.out.println(falso || falso);
        System.out.println(falso || verdadero);
    }

    public void ejecucionNegacion(){
         // ! - Negación
        System.out.println("Negación");
        System.out.println(!verdadero);
        System.out.println(!falso);
    }
}

class OperadoresRelacionales{
    int a = 5;
    int b = 6;
    public void ejecucion(){
        System.out.println(a > b);
        System.out.println(a >= b);

        System.out.println(a < b);
        System.out.println(a <= b);

        System.out.println(a == b);
    }
}

class LinealizacionExpresiones{
    //Convertir ecuación matematica en linea de codigo
    public double ejecucion(double a, double b, double c){
        double result;
        result = (-b + Math.sqrt(Math.pow(b, 2)-4*a*c)) / (2*a);
        return result;
    }
}

class TrabajoClase1{
    public void ejecucion() {
        int N = 0;
        System.out.println(N);
        N += 77;
        System.out.println(N);
        N -= 3;
        System.out.println(N);
        N *= 2;
        System.out.println(N);
    }
}

class TrabajoClase2{
    public void ejecucion(){
        System.out.println("*********     ***      *       * ");
        System.out.println("*       *   *     *   ***     * * ");
        System.out.println("*       *  *       * *****   *   * ");
        System.out.println("*       *  *       *   *    *     * ");
        System.out.println("*       *  *       *   *   *       * ");
        System.out.println("*       *  *       *   *    *     * ");
        System.out.println("*       *   *     *    *     *   *");
        System.out.println("*********    ****      *       * ");
    }
}

class TrabajoClase3{
    public void puntoA() {
        float resultado = (float) (3/2) + (4/3) ;
        System.out.println(resultado);
    }

    public void puntoB(float x, float y){
        float resultado = (float) (1/(x-5)) - ((3*x*y)/4);
        System.out.println(resultado);
    }

    public void puntoC()
    {
        float resultado = (float) (1/2) + 7;
        System.out.println(resultado);
    }

    public void puntoD()
    {
        float resultado = (float) 7 + (1/2) ;
        System.out.println(resultado);
    }

    public void puntoE(float a, float b, float c, float d, float e, float f,float g, float h, float i) {
        float resultado = (float) ( Math.pow(a, 2) / (b-c) ) + ( (d-e) / (f - ( (g*h) / i ) ));
        System.out.println(resultado);
    }

    public void puntoF(float m, float n, float p){
        float resultado = (m/n) + p;
        System.out.println(resultado);
    }

    public void puntoG(float m, float n, float p, float q){
        float resultado = m + (n/(p-q));
        System.out.println(resultado);
    }

    public void puntoH(float a, float b, float c, float d){
        float resultado = (float) ((float) (Math.pow(a, 2)/Math.pow(b, 2)) + (Math.pow(c, 2)/Math.pow(d, 2)));
        System.out.println(resultado);
    }

    public void puntoI(float m, float n, float p, float q, float r, float s){
        float resultado = (m+(n/p))/(q-(r/p));
        System.out.println(resultado);
    }

    public void puntoJ(float a, float b, float c, float d, float e, float f, float g, float h){
        float resultado = (float) (3*a+b)/(c-((d+5*e)/f+(g/2*h)));
        System.out.println(resultado);
    }

    public void puntoK(float a, float b, float x){
        float resultado = (float) ((float) (Math.pow(a, 2) + 2 * a * b + Math.pow(b, 2)) / (1 / Math.pow(x, 2) + 2));
        System.out.println(resultado);
    }
}
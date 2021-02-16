package semana4;

public class Repeticion {
    public static void main(String[] args) {
        int contador = 0;
        int acumulador = 0;
        /*
        while (acumulador < 500) {
            if ((acumulador + contador) < 500) {
                contador ++;
                acumulador += contador;
            }
            else{
                break;
            }
        }
        */
        while (acumulador + contador < 500) {
            contador ++;
            acumulador += contador;
        }
        System.out.println("Ultimo numero sumado: " + contador + " cantidad total: " + acumulador);
    }
}

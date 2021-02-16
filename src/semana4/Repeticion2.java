package semana4;

public class Repeticion2 {
    public static void main(String[] args) {
        double contador = 0;
        double acumulador = 0; 
        while(acumulador <= 1){
            contador = contador + 0.00000001;
            System.out.println(contador);
            acumulador += 1/(Math.pow(contador, 2)+1);
            System.out.println(acumulador);
            //System.out.println(acumulador);
        }
        System.out.println(acumulador);
    }
}

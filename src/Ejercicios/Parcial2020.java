package Ejercicios;
import java.util.Scanner;

public class Parcial2020{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numeroInfractores = 3;
        int[] valorMultas = new int[numeroInfractores];
        String[] nombresInfractores = new String[numeroInfractores];
        int valorMulta = 0;
        int infractorMayor = 0;
        int valorTotalMultas = 0;
        int valorTotalMultasSoat = 0;
        int valorTotalMultasTecno = 0;
        int valorTotalMultasEtanol = 0;
        for(int i = 0; i < numeroInfractores; i++){
            System.out.print("Escriba el nombre del infractor " + (i+1) + " ");
            nombresInfractores[i] = entrada.next();
            System.out.print("Tiene soat (s/n): ");
            if(entrada.next().toLowerCase().charAt(0) == 'n'){
                valorMulta += 535600;
                valorTotalMultasSoat += 535600;
            }

            System.out.print("Tiene tecnomecanica (s/n)");
            if(entrada.next().toLowerCase().charAt(0) == 'n'){
                valorMulta += 344727;
                valorTotalMultasTecno += 344727;
            }

            System.out.print("Escriba el nivel de etanol en la sangre (mg)");
            int etanolSangre = entrada.nextInt();
            if(etanolSangre >= 20 && etanolSangre <= 39){
                valorMulta += 1768500;
                valorTotalMultasEtanol += 1768500;
            }
            else if(etanolSangre >= 40 && etanolSangre <= 90){
                valorMulta += 3537000;
                valorTotalMultasEtanol += 3537000;
            }
            else if(etanolSangre >= 91 && etanolSangre <= 149){
                valorMulta += 7074000;
                valorTotalMultasEtanol += 7074000;
            }
            else if(etanolSangre >= 150){
                valorMulta += 14148000;
                valorTotalMultasEtanol += 14148000;
            }
            valorMultas[i] = valorMulta;
            valorTotalMultas += valorMulta;
            System.out.println("El conductor: " + nombresInfractores[i] +" Debe pagar un total de " + valorMultas[i]);
            valorMulta = 0;
        }
        for (int i = 0; i < numeroInfractores; i++) {
            if(valorMultas[infractorMayor] < valorMultas[i]){
                infractorMayor = i;
            }
        }
        System.out.println("El conductor: " + nombresInfractores[infractorMayor] + " tiene la mayor multa por un total de: " + valorMultas[infractorMayor]);
        System.out.println("El valor total de las multas es: " + valorTotalMultas + " y su promedio es de " + (valorTotalMultas/numeroInfractores));
        System.out.println("El valor todal de multas por soat es de " + valorTotalMultasSoat + " y su promedio es de " + (valorTotalMultasSoat/numeroInfractores));
        
        if(valorTotalMultasSoat > valorTotalMultasTecno && valorTotalMultasSoat > valorTotalMultasEtanol){
            System.out.println("La multa que mas recaudó dinero fue por soat: " + valorTotalMultasSoat);
        }
        else if(valorTotalMultasTecno > valorTotalMultasSoat && valorTotalMultasTecno > valorTotalMultasEtanol){
            System.out.println("La multa que mas recaudó dinero fue por Tecnomecanica: " + valorTotalMultasTecno);
        }
        else if(valorTotalMultasEtanol > valorTotalMultasSoat && valorTotalMultasEtanol > valorTotalMultasTecno){
            System.out.println("La multa que mas recaudó dinero fue por Etanol " + valorTotalMultasEtanol);
        }

        if(valorTotalMultasSoat < valorTotalMultasTecno && valorTotalMultasSoat < valorTotalMultasEtanol){
            System.out.println("La multa que menos recaudó dinero fue por soat: " + valorTotalMultasSoat);
        }
        else if(valorTotalMultasTecno < valorTotalMultasSoat && valorTotalMultasTecno < valorTotalMultasEtanol){
            System.out.println("La multa que menos recaudó dinero fue por Tecnomecanica: " + valorTotalMultasTecno);
        }
        else if(valorTotalMultasEtanol < valorTotalMultasSoat && valorTotalMultasEtanol < valorTotalMultasTecno){
            System.out.println("La multa que menos recaudó dinero fue por Etanol " + valorTotalMultasEtanol);
        }
        entrada.close();
    }
}

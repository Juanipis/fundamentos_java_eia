package Ejercicios;
import java.util.Scanner;
import java.util.ArrayList;
public class Parcial2020{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> valorMultas = new ArrayList<Integer>();
        ArrayList<String> nombresInfractores = new ArrayList<String>();
        int valorMulta = 0;
        int infractorMayor = 0;
        int valorTotalMultas = 0;
        int valorTotalMultasSoat = 0;
        int valorTotalMultasTecno = 0;
        int valorTotalMultasEtanol = 0;
        boolean condicionSeguir = true;
        int i = 1; //contador estilo for
        do{
            System.out.print("Escriba el nombre del infractor " + (i) + " ");
            nombresInfractores.add(entrada.next());
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
            valorMultas.add(valorMulta);
            valorTotalMultas += valorMulta;
            
            System.out.println("El conductor: " + nombresInfractores.get(i-1) +" Debe pagar un total de " + valorMultas.get(i-1));
            valorMulta = 0;
            i++;
            System.out.print("¿Desea seguir?: ");
            if(entrada.next().toLowerCase().charAt(0) == 'n'){
                condicionSeguir = false;
            }
        }while(condicionSeguir);

        for (int c = 0; c < i-1; c++) {
            if(valorMultas.get(infractorMayor) < valorMultas.get(c)){
                infractorMayor = c;
            }
        }
        System.out.println("El conductor: " + nombresInfractores.get(infractorMayor) + " tiene la mayor multa por un total de: " + valorMultas.get(infractorMayor));
        System.out.println("El valor total de las multas es: " + valorTotalMultas + " y su promedio es de " + (valorTotalMultas/i));
        System.out.println("El valor todal de multas por soat es de " + valorTotalMultasSoat + " y su promedio es de " + (valorTotalMultasSoat/i));
        
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

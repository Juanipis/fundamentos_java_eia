package Ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ciclos {
    public static List<Double> calificaciones = new ArrayList<Double>();
    public static Scanner entradaScanner = new Scanner(System.in);
    

    public static void main(String[] args) {
        double  promedioNotasMal = 0;
        double  promedioNotasBien = 0;

        int cantidadNotasMal = 0;
        int cantidadNotasBien = 0;

        System.out.print("Escribe la cantidad de notas a usar: ");
        int cantidadNotas = entradaScanner.nextInt();
        //Se obtienen las notas
        for (int i = 0; i < cantidadNotas; i++) {
            System.out.print("Escribe la nota " + (i+1) + ": ");
            double nota = entradaScanner.nextDouble();
            calificaciones.add(nota);
        }
        System.out.println(calificaciones);
        
        //Obtenemos el promedio de los malos
        for(int i = 0; i < calificaciones.size();i++){
            if(calificaciones.get(i) < 3.0){
                promedioNotasMal += calificaciones.get(i);
                cantidadNotasMal++;
            }
            else{
                promedioNotasBien += calificaciones.get(i);
                cantidadNotasBien++;
            }
        }
        promedioNotasMal = promedioNotasMal/cantidadNotasMal;
        promedioNotasBien = promedioNotasBien/cantidadNotasBien;
        System.out.println(promedioNotasBien + " : " + promedioNotasMal);
        entradaScanner.close();
    }
}

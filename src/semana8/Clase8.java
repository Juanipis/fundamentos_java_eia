package semana8;
import java.util.Scanner;
import java.security.SecureRandom;

public class Clase8 {
	
	public static void main(String[] args) {
		Ejercicio1 ejercicio = new Ejercicio1();
		ejercicio.main();
		
	}
}

class Ejercicio1{
	public void main(){
		int filas; 
		int columnas;
		int objetivo;
		Matrices2D matrices2D = new Matrices2D();
		
		try{
			System.out.println("Bienvenido al creador de matices aleatorias");
			System.out.print("Escribe el numero de filas: ");
			filas = matrices2D.pedirScanner();
			System.out.print("Escribe el numero de columnas: ");
			columnas = matrices2D.pedirScanner();
			int[][] matriz = matrices2D.matrizCrear(filas, columnas);
			String matrizRepresentada = matrices2D.matrizRepresentada(matriz);
			System.out.println("Tu nueva matriz es");
			System.out.println(matrizRepresentada);

			System.out.println("¿Que numero deseas buscar?: ");
			objetivo = matrices2D.pedirScanner();
			System.out.println(matrices2D.busquedaNumeros(matriz, objetivo));
			
			matriz = matrices2D.ordenarColumnasMenorMayor(matriz);
			matrizRepresentada = matrices2D.matrizRepresentada(matriz);
			System.out.println("La matriz ordenada en columnas de menor a mayor es");
			System.out.println(matrizRepresentada);

			
			matriz = matrices2D.ordenarColumnasMayorMenor(matriz);
			matrizRepresentada = matrices2D.matrizRepresentada(matriz);
			System.out.println("La matriz ordenada en columnas de mayor a menor es");
			System.out.println(matrizRepresentada);
			
			
			
			matrices2D.cerrarScanner();
		}catch(Exception e){
			System.out.println("Ups, has ingresado un valor que no es entero, vuelve a intentarlo");
			matrices2D.cerrarScanner();
			Ejercicio1 ejercicio = new Ejercicio1();
			ejercicio.main();
		}
	}
}

class Matrices2D{
	private Scanner entrada = new Scanner(System.in);
	private SecureRandom rand =  new SecureRandom();
	
	public int[][] matrizCrear(int filas, int columnas){
		int[][] matriz = new int[filas][columnas];
		for(int f = 0;f < matriz.length; f++){
			for(int c = 0; c < matriz[f].length; c++){
				matriz[f][c] = rand.nextInt(100)+1;
			}
		}
		return matriz;
	}
	
	public String matrizRepresentada(int[][] matriz){
		StringBuilder matrizBuilder = new StringBuilder();
		
		for(int f = 0;f < matriz.length; f++){
			for(int c = 0; c < matriz[f].length; c++){
				matrizBuilder.append(matriz[f][c] + "\t");
			}
			matrizBuilder.append("\n");
		}
		return matrizBuilder.toString();
	}
	
	public String busquedaNumeros(int[][] matriz,int objetivo){
		StringBuilder repetidosBuilder = new StringBuilder();
		int repetidosContador = 0;
		for(int f = 0;f < matriz.length; f++){
			for(int c = 0; c < matriz[f].length; c++){
				if(objetivo == matriz[f][c]){
					repetidosBuilder.append("["+f+"]"+"["+c+"],  ") ;
					repetidosContador++;
					
				}
			}
		}
		String repetidosMatriz = repetidosBuilder.toString();
		return "El numero " + objetivo + " esta repetido " + repetidosContador + " veces en las posiciones: " + repetidosMatriz;
	}
	
	public int[][] ordenarColumnasMenorMayor(int[][] matriz){
		int valorPos1;
		int valorPos2;
		for(int c = 0;c < matriz[0].length; c++){
			for (int f = 0; f < matriz.length-1; f++) {
				for (int j = 0; j < matriz.length-1-f; j++) {
					valorPos1 = matriz[j][c];
					valorPos2 = matriz[j+1][c];
					if( valorPos1 > valorPos2 ){
						matriz[j+1][c] = valorPos1;
						matriz[j][c] = valorPos2;
					}
				}
			}
		}
		return matriz;
	}
	public int[][] ordenarColumnasMayorMenor(int[][] matriz){
		int valorPos1;
		int valorPos2;
		for(int c = 0;c < matriz[0].length; c++){
			for (int f = 0; f < matriz.length-1; f++) {
				for (int j = 0; j < matriz.length-1-f; j++) {
					valorPos1 = matriz[j][c];
					valorPos2 = matriz[j+1][c];
					if( valorPos1 < valorPos2 ){
						matriz[j+1][c] = valorPos1;
						matriz[j][c] = valorPos2;
					}
				}
				
			}
		}
		return matriz;
	}
		
	
	
	public int pedirScanner(){
		return entrada.nextInt();
	}
	
	public void cerrarScanner(){
		entrada.close();
	}
}

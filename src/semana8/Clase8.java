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
	int filas, columnas;
	public void main(){
		Matrices2D matrices2D = new Matrices2D();
		try{
			System.out.println("Bienvenido al creador de matices aleatorias");
			System.out.print("Escribe el numero de filas: ");
			filas = matrices2D.pedirScanner();
			System.out.print("Escribe el numero de columnas: ");
			columnas = matrices2D.pedirScanner();
			int[][] matriz = matrices2D.MatrizCrear(filas, columnas);
			String matrizRepresentada = matrices2D.MatrizRepresentada(matriz);
			System.out.println(matrizRepresentada);
			System.out.println(matrices2D.BusquedaNumeros(matriz, 10));
			matriz = matrices2D.ordenarColumnasMenorMayor(matriz);
			matrizRepresentada = matrices2D.MatrizRepresentada(matriz);
			
			
			
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
	
	public int[][] MatrizCrear(int filas, int columnas){
		int[][] matriz = new int[filas][columnas];
		for(int f = 0;f < matriz.length; f++){
			for(int c = 0; c < matriz[f].length; c++){
				matriz[f][c] = rand.nextInt(100)+1;
			}
		}
		return matriz;
	}
	
	public String MatrizRepresentada(int[][] matriz){
		String matrizRepresentada = "";
		for(int f = 0;f < matriz.length; f++){
			for(int c = 0; c < matriz[f].length; c++){
				matrizRepresentada += matriz[f][c] + "\t";
			}
			matrizRepresentada += "\n";
		}
		return matrizRepresentada;
	}
	
	public String BusquedaNumeros(int[][] matriz,int objetivo){
		String repetidosMatriz = "";
		int repetidosContador = 0;
		for(int f = 0;f < matriz.length; f++){
			for(int c = 0; c < matriz[f].length; c++){
				if(objetivo == matriz[f][c]){
					repetidosMatriz += "["+f+"]"+"["+c+"],  ";
					repetidosContador++;
					
				}
			}
		}
		return "El numero " + objetivo + " esta repetido " + repetidosContador + " veces en las posiciones: " + repetidosMatriz;
	}
	
	public int[][] ordenarColumnasMenorMayor(int[][] matriz){
		int valorPos1, valorPos2;
		for(int c = 0;c < matriz[0].length; c++){
			for(int f = 0; f < matriz.length; f++){
				valorPos1 = matriz[f][c];
				valorPos2 = matriz[f+1][c+1];
				/*
				if( valorPos1 > valorPos2 ){
					matriz[f+1][c+1] = valorPos1;
					matriz[f][c] = valorPos2;
				}
				*/
			}
		}
		return matriz;
	}
	
	public int pedirScanner(){
		return entrada.nextInt();
	}
	//Ordenar matriz de menor a mayor por columnas
	
	public void cerrarScanner(){
		entrada.close();
	}
}

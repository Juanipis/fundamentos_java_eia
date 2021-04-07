package semana8;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


import java.security.SecureRandom;
public class Ejercicios {
	public static void main(String[] args){
		// Numero Capicua
		/* 
		Numeros num = new Numeros();
		int[] numero = {5,0,0,0,2,5};
		for(int i = 0; i < numero.length ; i++){
			System.out.print(numero[i] + " ");
		}
		System.out.println();
		System.out.println("¿El numero es capicua? : " + num.numeroCapicua(numero));
		*/
		
		//Cine
		Cine cine = new Cine();
		cine.main();
		
	}
}

class Numeros{
	public boolean numeroCapicua(int[] numero){
		int[] capicua = new int[numero.length];
		int c = 0;
		for (int i = capicua.length-1; i >= 0; i--) {
			capicua[c] = numero[i];
			c++;
		}
		for(int a = 0; a < numero.length; a++){
			if(capicua[a] != numero[a]){
				return false;
			}
		}
		
		return true;
	}
}

class Cine{
	private Scanner entradaScanner = new Scanner(System.in);
	private char[][] asientos = new char[20][10];
	private SecureRandom random = new SecureRandom();
	ArrayList<int[]> reservas = new ArrayList<>();
	
	public void main() {
		//Metodos predeterminados
		llenarSillasVacias(asientos);
		
		//Variables predeterminadas
		boolean seguirReservando = true;
		int seleccion;
		
		//Inicio
		System.out.println("Bienvenido al cine Juanipis, tenemos los siguientes asientos:");
		
		do {
			System.out.println(verAsientos(asientos));
			verReservas();
			System.out.print("¿Que deseas hacer? \n1. Reservar silla\n2. Cancelar reserva\n3. Salir\nEscribe tu opción: ");
			
			try {
				seleccion = entradaScanner.nextInt();
			} catch (Exception e) {
				entradaScanner = new Scanner(System.in);
				seleccion = -1;
			}

			switch (seleccion) {
				case 1: //reservar silla
					reservar();
					break;
				
				case 2: // cancelar silla
					verReservas();
					cancelarReserva();
					break;

				case 3: // salir
					System.out.println("Gracias por su reserva, lo esperamos pronto en nuestras salas");
					entradaScanner.close();
					seguirReservando = false;
					break;
				
				default:
					System.out.println("\n---------*---------\nEntrada invalida, vuelva a intentarlo\n---------*---------\n");
					break;
			}
		} while (seguirReservando);
		
	}

	private void llenarSillasVacias(char[][] sillas){
		
		for(int f = 0;f < sillas.length; f++){
			for(int c = 0; c < sillas[f].length; c++){
				if(random.nextInt(4) == 1){
					cambiarEstadoSilla(f, c, 'x');
				}
				else{
					cambiarEstadoSilla(f, c, 'o');
				}
			}
		}
	}

	public String verAsientos(char[][] matriz){
		StringBuilder matrizBuilder = new StringBuilder();
		//Cosas bonitas
		//Numero de columnas
		matrizBuilder.append("\t");
		for (int i = 1; i <= matriz[0].length; i++) {
			matrizBuilder.append(i + "\t");
		}
		matrizBuilder.append("\n");

		for(int f = 0;f < matriz.length; f++){
			matrizBuilder.append(f+1 + "\t");
			for(int c = 0; c < matriz[f].length; c++){
				matrizBuilder.append(matriz[f][c] + "\t");
			}
			matrizBuilder.append("\n");
		}
		return matrizBuilder.toString();
	}

	private void verReservas(){
		for (int i = 0; i < reservas.size(); i++) {
			System.out.println("Reserva " + (i+1) + ":   Fila:"+ (reservas.get(i)[0]+1) + " , Columna " + (reservas.get(i)[1] +1));
		}
	}

	private void cambiarEstadoSilla(int row, int col, char estado){
		asientos[row][col] = estado;
	}

	private boolean comprobarUbicacionOcupado(int row, int col) {
		return asientos[row][col] != 'x';
	}

	private void reservar() {
		System.out.println("Reserva #" + (reservas.size()+1));
		int row; 
		int col;

		try {
			System.out.print("Por favor escriba el numero de la fila: ");
			row = (entradaScanner.nextInt())-1;
			System.out.print("Por favor escriba el numero de la columna: ");
			col = (entradaScanner.nextInt())-1;
		} catch (InputMismatchException e) {
			return;
		}

		if(comprobarUbicacionOcupado(row, col)){
			reservas.add(new int[]{row, col});
			cambiarEstadoSilla(row, col, 'x');
			System.out.println("Asiento guardado correctamente");	
		}
		else{
			System.out.println("Lo sentimos, la silla esta ocupada");
		}
	}

	private void cancelarReserva(){
		if(!reservas.isEmpty()){
			System.out.print("Escriba el numero de la reserva que desea cancelar: ");
			int indexReserva; 
			try {
				indexReserva = entradaScanner.nextInt();
			} catch (InputMismatchException e) {
				return;
			}

			if((reservas.size() == 1 && indexReserva == 1) || (indexReserva <= reservas.size() && /*Si solo hay una reserva*/ indexReserva >= 1 )){ 
				cambiarEstadoSilla(reservas.get(indexReserva-1)[0], reservas.get(indexReserva-1)[1], 'o');
				reservas.remove(indexReserva-1);
				System.out.println("Reserva cancelada correctamente");
			}

			else{
				System.out.println("Numero fuera del limite, vuelva a intentarlo");
			}
		}
		else{
			System.out.println("#----No tienes reservas----#");
		}
		
	}

}
package semana8;

import java.util.Scanner;

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

	public void main() {
		//Metodos predeterminados
		llenarSillasVacias(asientos);
		int numeroReserva = 1;
		boolean seguirReservando = true;
		//Inicio
		System.out.println("Bienvenido al cine Juanipis, tenemos los siguientes asientos:");
		System.out.println(verAsientos(asientos));
		
		do {
			System.out.println("Reserva #" + numeroReserva);
			pedirUbicacion();
			System.out.println(verAsientos(asientos));
			numeroReserva++;
			seguirReservando = deseaSeguirReservando();
		} while (seguirReservando);
		System.out.println("Gracias por su reserva, lo esperamos pronto en nuestras salas");
		entradaCerrar();
	}

	private void llenarSillasVacias(char[][] sillas){
		for(int f = 0;f < sillas.length; f++){
			for(int c = 0; c < sillas[f].length; c++){
				sillas[f][c] = 'o';
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

	private void pedirUbicacion() {
		int row;
		int col;
		try {
			System.out.print("Por favor escriba el numero de la fila: ");
			row = entradaIntPedir()-1;
			System.out.print("Por favor escriba el numero de la columna: ");
			col = entradaIntPedir()-1;
			if(comprobarUbicacionOcupado(row, col)){
				asientos[row][col] = 'x';
				System.out.println("Asiento guardado correctamente");
			}
			else{
				System.out.println("Lo sentimos, la silla esta ocupada");
			}

		} catch (Exception e) {
			System.out.println("Parece que no escribiste una ubicacion valida, intentalo de nuevo");
			pedirUbicacion();
		}
	}
	private boolean comprobarUbicacionOcupado(int row, int col) {
		return asientos[row][col] != 'x';
	}
	private boolean deseaSeguirReservando(){
		String resultadoString;
		resultadoString = entradaStringPedirSeguirReservando().toLowerCase();
		return resultadoString.charAt(0) == 's';
	}

	//Scanners
	private int entradaIntPedir() {
		return entradaScanner.nextInt();
	}
	private String entradaStringPedirSeguirReservando(){
		System.out.print("¿Desea reservar más sillas? s/n : ");
		String resultado = entradaScanner.next();
		for (int i = 0; i < resultado.length(); i++) {
			if(Character.isDigit(resultado.charAt(i))){
				System.out.println("Esa opción no es valida, vuelve a intentarlo");
				return entradaStringPedirSeguirReservando();
			}
		}
		return resultado;
	}
	private void entradaCerrar() {
		entradaScanner.close();
	}

}
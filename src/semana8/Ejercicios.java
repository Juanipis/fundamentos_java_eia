package semana8;

public class Ejercicios {
	public static void main(String[] args){
		Numeros num = new Numeros();
		int[] numero = {5,2,0,2,2,5};
		for(int i = 0; i < numero.length ; i++){
			System.out.print(numero[i] + " ");
		}
		System.out.println();
		System.out.println("¿El numero es capicua? : " + num.numeroCapicua(numero));
	}
}

class Numeros{
	public boolean numeroCapicua(int[] numero){
		int[] capicua = new int[numero.length];
		for(int i = capicua.length-1; i >= 0 ; i--){
			int numeroN = numero[i];
			capicua[i] = numeroN;
			System.out.print(capicua[i] + " ");
		}
		
		
		System.out.println();
		
		
		for(int a = 0; a < numero.length; a++){
			int numeroJ = capicua[a];
			int numeroJ2 = numero[a];
			System.out.println(numeroJ + " " + numeroJ2);
			if(capicua[a] != numero[a]){
				return false;
			}
		}
		
		return true;
		
	}
}

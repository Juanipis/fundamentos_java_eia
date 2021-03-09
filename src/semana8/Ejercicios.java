package semana8;

public class Ejercicios {
	public static void main(String[] args){
		Numeros num = new Numeros();
		int[] numero = {5,0,0,0,2,5};
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

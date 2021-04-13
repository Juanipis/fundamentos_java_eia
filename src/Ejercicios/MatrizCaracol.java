package Ejercicios;

public class MatrizCaracol {
    public static void main(String[] args) {
        MatricesBonitas bonitas = new MatricesBonitas();

        int n_filas = 10;
        int n_columnas = 10;
        int[][] matrizCaracol = new int[n_filas][n_columnas];
        int numero_maximo_caracol = n_filas*n_columnas;

        

        
        boolean seguir = true;
        int x_inicial = 0;
        int y_inicial = 0;
        /*
        matrizCaracol[x_inicial][y_inicial] = numero_maximo_caracol;
        
        numero_maximo_caracol--;
        */

        for (int i = 1; i <= n_filas*n_columnas ; i++) {
            //Valor inicial
            if(i == 1){
                matrizCaracol[x_inicial][y_inicial] = i;
                continue;
            }
            //Derecha
            if ((y_inicial+1) < matrizCaracol[0].length) {
                //Es posible que la derecha vaya hacia arriba
                
                
                
                else if(matrizCaracol[x_inicial][y_inicial+1] == 0 ){
                    y_inicial++;
                    matrizCaracol[x_inicial][y_inicial] = i;
                    continue;
                }
            }
            //Abajo
            if((x_inicial+1) < matrizCaracol.length){
                if (matrizCaracol[x_inicial+1][y_inicial] == 0) {
                    x_inicial++;
                    matrizCaracol[x_inicial][y_inicial] = i;
                    continue;
                }
            }
            //izquierda
            if ((y_inicial-1) < matrizCaracol[0].length && (y_inicial-1) >= 0){
                //Izquierda
                if(matrizCaracol[x_inicial][y_inicial-1] == 0 ){
                    y_inicial--;
                    matrizCaracol[x_inicial][y_inicial] = i;
                    continue;
                }
            }
            //arriba
            if((x_inicial-1) < matrizCaracol.length && x_inicial >= 0){
                if (matrizCaracol[x_inicial-1][y_inicial] == 0) {
                    x_inicial--;
                    matrizCaracol[x_inicial][y_inicial] = i;
                    continue;
                }
                
            }
            
        }
        System.out.println(bonitas.verMatriz(matrizCaracol));
        /*
        while (seguir) {
            //Derecha
            if ((y_inicial+1) < matrizCaracol[0].length) {
                if(matrizCaracol[x_inicial][y_inicial+1] == 0 ){
                    y_inicial++;
                    matrizCaracol[x_inicial][y_inicial] = numero_maximo_caracol;
                    numero_maximo_caracol--;
                    
                }
                
            }
            //Abajo
            else if((x_inicial+1) < matrizCaracol.length){
                if (matrizCaracol[x_inicial+1][y_inicial] == 0) {
                    x_inicial++;
                    matrizCaracol[x_inicial][y_inicial] = numero_maximo_caracol;
                    numero_maximo_caracol--;
                    
                }
                
            }
            //Izquierda
            else if ((y_inicial-1) < matrizCaracol[0].length && y_inicial >=0){
                if(matrizCaracol[x_inicial][y_inicial-1] == 0 ){
                    y_inicial--;
                    matrizCaracol[x_inicial][y_inicial] = numero_maximo_caracol;
                    numero_maximo_caracol--;
                }
            }
            //Arriba
            else if((x_inicial-1) < matrizCaracol.length && x_inicial >= 0){
                if (matrizCaracol[x_inicial-1][y_inicial] == 0) {
                    x_inicial--;
                    matrizCaracol[x_inicial][y_inicial] = numero_maximo_caracol;
                    numero_maximo_caracol--;
                }
                
            }
            else{
                break;
            }
            if (numero_maximo_caracol == 0) {
                seguir = false;
                break;
            }
        }
        */
    }
}

class MatricesBonitas{
    public String verMatriz(int[][] matriz){
		StringBuilder matrizBuilder = new StringBuilder();
		

		for(int f = 0;f < matriz.length; f++){
			
			for(int c = 0; c < matriz[f].length; c++){
				matrizBuilder.append(matriz[f][c] + "\t");
			}
			matrizBuilder.append("\n");
		}
		return matrizBuilder.toString();
	}
}
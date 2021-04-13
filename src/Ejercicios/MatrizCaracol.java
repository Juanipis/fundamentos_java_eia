package Ejercicios;

public class MatrizCaracol {
    public static void main(String[] args) {
        MatricesBonitas bonitas = new MatricesBonitas();

        int n_filas = 13;
        int n_columnas = 13;
        int[][] matrizCaracol = new int[n_filas][n_columnas];

        

        
        int xInicial = 0;
        int yInicial = 0;
        for (int i = 1; i <= n_filas*n_columnas ; i++) {
            //Valor inicial
            if(i == 1){
                matrizCaracol[xInicial][yInicial] = i;
                continue;
            }
            //Derecha
            if ((yInicial+1) < matrizCaracol[0].length) {
                if(matrizCaracol[xInicial][yInicial+1] == 0 ){
                    //if adicional en caso de que tengamos valores arriba
                    if((xInicial-1) < matrizCaracol.length && (xInicial-1) >= 0){
                        if(matrizCaracol[xInicial-1][yInicial] == 0){
                            xInicial--;
                            matrizCaracol[xInicial][yInicial] = i;
                            continue;
                        }
                        //Es posible que no se cumpla la de arriba pero tengamos movimiento a la derecha
                        else{
                            yInicial++;
                            matrizCaracol[xInicial][yInicial] = i;
                            continue;
                        }
                    }
                    //movimiento en fila inicial
                    else{
                        yInicial++;
                    matrizCaracol[xInicial][yInicial] = i;
                    continue;
                    }
                    
                }
            }
            //Abajo
            if((xInicial+1) < matrizCaracol.length){
                if (matrizCaracol[xInicial+1][yInicial] == 0) {
                    xInicial++;
                    matrizCaracol[xInicial][yInicial] = i;
                    continue;
                }
            }
            //izquierda
            if ((yInicial-1) < matrizCaracol[0].length && (yInicial-1) >= 0){
                if(matrizCaracol[xInicial][yInicial-1] == 0 ){
                    yInicial--;
                    matrizCaracol[xInicial][yInicial] = i;
                    continue;
                }
            }
            //arriba
            if((xInicial-1) < matrizCaracol.length && xInicial >= 0){
                if (matrizCaracol[xInicial-1][yInicial] == 0) {
                    xInicial--;
                    matrizCaracol[xInicial][yInicial] = i;
                    continue;
                }
                
            }
            
        }
        System.out.println(bonitas.verMatriz(matrizCaracol));
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
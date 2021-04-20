package metodos;

//Para imprimir matrices bonitas
class MatricesBonitas{
    public String verMatriz(int[][] matriz){
        StringBuilder matrizBuilder = new StringBuilder();
        for(int f = 0;f < matriz.length; f++){
            for(int c = 0; c < matriz[f].length; c++){
            matrizBuilder.append(matriz[f][c] + " ");
            }
        matrizBuilder.append("\n");
        }
    return matrizBuilder.toString();
    }
}
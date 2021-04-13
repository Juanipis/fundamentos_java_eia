package JuanDiaz;
/*
	*Autor: Juan Pablo D�az Correa
	*GitHub: @Juanipis
	*Twitter: @Juanipis
	*Date: 13/04/2021
*/
import java.security.SecureRandom;

public class QuizTres {
    public static void main(String[] args) {
        //Objetos iniciales
        SecureRandom random = new SecureRandom();
        MatricesBonitas bonitas = new MatricesBonitas();

        
        //Codgio qr matriz 30x30
        int[][] codigoQR = new int[30][30];
        //Las periferias ya tienen ceros a este punto, ahora se llena
        for (int i = 0; i < codigoQR.length; i++) {
            for (int j = 0; j < codigoQR.length; j++) {
                codigoQR[i][j] = random.nextInt(2);
            }
        }
        
        //Vector verificador de tres posiciones
        int[] verificador = new int[3];

        //Condicion periferia
        boolean periferia = true; //bandera
        //Fila 1
        for (int i = 0; i < codigoQR[0].length; i++) {
            if(codigoQR[0][i] != 0){
                periferia = false;
                break;
            }
        }
        //Fila 30
        for (int i = 0; i < codigoQR[0].length; i++) {
            if(codigoQR[codigoQR.length-1][i] != 0){
                periferia = false;
                break;
            }
        }
        
        //columnaDiagonal 1
        for (int i = 0; i < codigoQR.length; i++) {
            if(codigoQR[i][0] != 0){
                periferia = false;
                break;
            }
        }
        //columnaDiagonal 30
        for (int i = 0; i < codigoQR.length; i++) {
            if(codigoQR[i][codigoQR.length-1] != 0){
                periferia = false;
                break;
            }
        }
        //comprobar periferia
        if(periferia){
            verificador[0] = 1;
        }
        else{
            verificador[0] = 0;
        }

        // Comprobar numero de producto diagonal
        int columnaDiagonal = 0; 
        int contadorPuntosNegrosProducto = 0;
        for (int i = 0; i < codigoQR.length; i++) {
            if (codigoQR[i][columnaDiagonal] == 1) {
                contadorPuntosNegrosProducto++;
            }
            columnaDiagonal++;
        }
        //Ingresar valor al vector
        verificador[1] = contadorPuntosNegrosProducto;

        //Comprobar lote de fabricacion
        int contadorPuntosNegrosLote = 0;
        for (int columnaLote = 2; columnaLote <= 17; columnaLote++) {
            if(codigoQR[27][columnaLote] == 1){
                contadorPuntosNegrosLote++;
            }
        }
        //Ingresar valor al vector
        verificador[2] = contadorPuntosNegrosLote;
        
        //Mostrar resultados
        //Matriz
        System.out.println(bonitas.verMatriz(codigoQR));
        System.out.println();
        if(verificador[0] == 0){
            System.out.print("La periferia del código QR es inválida");
        }
        else{
            System.out.print("La periferia del código QR es válida");
        }
        System.out.print(", el número del producto es " + verificador[1]);
        System.out.println(" y el lote del producto es " + verificador[2] + ".");
        
    }
}



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
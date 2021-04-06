package semana9;

/**
 * InsertionSort
 */
public class InsertionSort {
    public static void main(String[] args) {
        
    }
}

class Algoritmo{
    public void sort(int[] arreglo, int izquierda, int derecha){
        //Comprobar que el vector aún no es unitario
        if(izquierda < derecha){
            //Encontrar punto medio
            int mitad = (derecha-izquierda)/2;

            //Dividir los nuevos vectores
            sort(arreglo, izquierda, mitad);
            sort(arreglo, mitad+1, derecha);

            merge(arreglo, izquierda, mitad, derecha);
        }
    }
    public void merge(int[] arreglo, int izquierda, int mitad ,int derecha){
        

    }
}
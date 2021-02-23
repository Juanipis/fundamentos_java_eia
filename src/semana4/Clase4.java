package semana4;

public class Clase4 {
    public static void main(String[] args) {
        int a = -1;
        int b = 0;
        int c;
        // a = 1, b = 1, c = 2
        // a = 2, b = 5, c = 2
        // a = 0, b = 0, c = 0
        // a = 3, b= 2, c = 0
        // a = -1, b = 0, c = -1

        if(a >= 1){
            if(b>a){
                c=a;
            } else if(b == a){
                c = a+1;
            } else{
                c = 0;
            }
        } else{
            c = b;
            if(b!= a){
                c = a;
            }
        }
        System.out.println(c);

        
    }
}

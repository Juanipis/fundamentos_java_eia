package semana4;
import java.util.Scanner;

public class Contrasena {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Password contrasena = new Password();
        contrasena.checkear(entrada);

    }
}

class Password{
    public boolean checkear(Scanner entradaScanner) {
        int intentos = 3;
        String contrasena = "1234";
        do{
            System.out.print("Escribe tu contraseña: ");
            String entrada = entradaScanner.nextLine();
            if(contrasena.equals(entrada)){
                System.out.println("Contraseña correcta ¡Yuju!");
                return true;
            }
            else{
                intentos--;
                System.out.println("Contraseña incorrecta, intentalo de nuevo, te quedan " + intentos + " intentos");
            }
        }while(intentos != 0);
        System.out.println("Te quedaste sin intentos");
        return false;
    }
}

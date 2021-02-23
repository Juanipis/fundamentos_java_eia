package Ejercicios;
/*
	*Autor: Juan Pablo Díaz Correa
	*GitHub: @Juanipis
	*Twitter: @Juanipis
	*Date: 15/02/2021
*/

import java.util.Scanner;

public class SwichCase {
    public static void main(String[] args) {
        ConversionValores ejemplosConversion = new ConversionValores();
        ejemplosConversion.enterosString();
        ejemplosConversion.doublesString();
        ejemplosConversion.enterosDouble();
        ejemplosConversion.doubleEnteros();

        SwitchCaseUso ejemploSwitch = new SwitchCaseUso();
        ejemploSwitch.swichuso();
    }
}


/**
 * SwichCaseUso
 */
class SwitchCaseUso {
    public void swichuso() {
        Scanner entradaScanner = new Scanner(System.in);
        System.out.print("Escribe un mes: ");
        String mes = entradaScanner.nextLine();
        mes = mes.toLowerCase();
        System.out.println(mes);
        switch (mes) {
            case "enero":
                System.out.println("El 28 de enero . En 1887 en París, la capital de Francia comienza la construcción de la Torre Eiffel​");
                break;
            case "febrero":
                System.out.println("El 18 de febrero de 1930, se descubre Plutón");
                break;
            case "marzo":
                System.out.println("El 8 de marzo es el Día Internacional de la Mujer");
                break;
            case "abril":
                System.out.println("El 3 de abril de 1905, en Buenos Aires (Argentina) se funda el Club Atlético Boca Juniors");
                break;
            case "mayo":
                System.out.println("El 25 de mayo se celebra el Día de África, según la ONU");
                break;
            case "junio":
                System.out.println("El 24 de junio de 1821 tuvo lugar la batalla de Carabobo, la cual fue decisiva en la liberación de Caracas, así como la del resto del territorio venezolano");
                break;
            case "julio":
                System.out.println("El 20 de julio se celebra la Independencia de Colombia");
                break;
            case "agosto":
                System.out.println("El 6 de agosto de 1945, en Hiroshima, (Japón), Estados Unidos hace detonar la primera de las dos bombas atómicas sobre población civil de la historia");
                break;
            case "septiembre":
                System.out.println("El 11 de septiembre de 1973 en Chile se produce un golpe de Estado y comienza la dictadura militar, que duraría hasta 1990.7");
                break;
            case "octubre":
                System.out.println("El 12 de octubre de 1492, un grupo expedicionario español, comandado por Cristóbal Colón llega al continente americano, protagonizando uno de los mayores hitos de la Historia");
                break;
            case "noviembre":
                System.out.println("El 11 de noviembre se firma el armisticio que pone fin a la Primera Guerra Mundial");
                break;
            case "diciembre":
                System.out.println("El 31 de diciembre se celebra la Nochevieja y es el último día del año en el calendario gregoriano");
                break;
            default: System.out.println("Ese mes no existe o está numericamente o en otro idioma diferente del español o no es del calendario gregoriano");
                break;
            }
        }
    }

/**
 * ConversionValores
 */ 
class ConversionValores {
    public void enterosString() {
        //Strings a enteros, enteros a Strings
        String textoEntero = "12";
        System.out.println(textoEntero + " : " + textoEntero.getClass().getName());
        int entero = Integer.parseInt(textoEntero);
        System.out.println(entero + " : " + ((Object)entero).getClass().getName());
        String textoEntero2 = String.valueOf(entero);
        System.out.println(textoEntero2 + " : " + textoEntero.getClass().getName()+ "\n");
        }
    public void doublesString() {
        String textoReal = "56.123";
        System.out.println(textoReal + " : " + textoReal.getClass().getName());
        Double real = Double.parseDouble(textoReal);
        System.out.println(real + " : " + ((Object)real).getClass().getName());
        String textoReal2 = String.valueOf(real);
        System.out.println(textoReal2 + " : " + textoReal.getClass().getName()+ "\n");
        }
    public void enterosDouble(){
        int entero = 77;
        System.out.println(entero + " : " + ((Object)entero).getClass().getName());
        double real = entero;
        System.out.println(real + " : " + ((Object)real).getClass().getName());
        int entero2 = (int) real;
        System.out.println(entero2 + " : " + ((Object)entero2).getClass().getName() + "\n");
        }
    public void doubleEnteros(){
        double real = 13.254;
        System.out.println(real + " : " + ((Object)real).getClass().getName());
        int entero = (int) real;
        System.out.println(entero + " : " + ((Object)entero).getClass().getName());
        double real2 = entero;
        System.out.println(real2 + " : " + ((Object)real2).getClass().getName()+ "\n");
        }
    }

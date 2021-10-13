package Ejercicios;


public class Main {
  public static void main(String[] args) {
    Fechas fecha = new Fechas(12,4,2001);
    System.out.println(fecha.toString());
    System.out.println("--------------");
    fecha.anadirDias(100000);
    System.out.println(fecha.toString());
    System.out.println("Prueba")
  }
}

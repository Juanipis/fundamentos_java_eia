package Semana14.ejercicioHerencia;

public class Main {
  public static void main(String[] args) {
    Electrodomestico e1 = new Electrodomestico("Azul", 'B');
    System.out.println(e1.toString());
    System.out.println("Precio final: " + e1.precioFinal());

    Lavadora l1 = new Lavadora("Azul", 'B', 40);
    System.out.println(l1.toString());
    System.out.println(l1.precioFinal());

    Televisor t1 = new Televisor("Azul", 'B', 45, true);
    System.out.println(t1.toString());
    System.out.println(t1.precioFinal());
  }
}

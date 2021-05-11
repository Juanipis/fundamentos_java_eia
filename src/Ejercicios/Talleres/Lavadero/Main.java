package Ejercicios.Talleres.Lavadero;

public class Main {
  public static void main(String[] args) {
    Persona mario = new Persona("Mario Bros", 65);
    Persona luigi = new Persona("Luigi Bros", 59);

    Carro carro = new Carro("MAR001", "rojo", mario, 2);
    Moto moto = new Moto("LUI001", "verde", luigi, 2);
    
    Lavadero lavadero = new Lavadero("Reino Champiñon");
    lavadero.ingresarVehiculo(carro);
    lavadero.ingresarVehiculo(moto);
    System.out.println(lavadero.toString());
    System.out.println("Ganancia total💰: " + lavadero.calcularGanancia());
  }
}

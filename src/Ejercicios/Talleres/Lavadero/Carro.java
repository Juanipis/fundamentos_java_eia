package Ejercicios.Talleres.Lavadero;

public class Carro extends Vehiculo {
  private int numeroPuertas;

  public Carro(String placa, String color, Persona propietario, int numeroPuertas) {
    super(placa, color, propietario);
    setNumeroPuertas(numeroPuertas);
  }

  public void setNumeroPuertas(int numeroPuertasEsta) {
    if(numeroPuertasEsta <= 0){
      this.numeroPuertas = 1; // por defecto
    }
    else{
      this.numeroPuertas = numeroPuertasEsta;
    }
  }

  public int getNumeroPuertas() { 
    return this.numeroPuertas;
  }
  
  @Override
  public String toString() {
    return "{🚗" +
      " placa💿='" + this.placa + "'" +
      ", color🌈='" + this.color + "'" +
      ", propietario👤='" + getPropietario().toString() + "'" +
      ", numeroPuertas🚪='" + getNumeroPuertas() + " puertas'" +
      "}";
  }
}

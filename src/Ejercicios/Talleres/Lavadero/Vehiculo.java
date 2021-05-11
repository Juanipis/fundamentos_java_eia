package Ejercicios.Talleres.Lavadero;

public class Vehiculo {
  protected String placa;
  protected String color;
  protected Persona propietario;


  public Vehiculo(String placa, String color, Persona propietario) {
    this.placa = placa;
    this.color = color;
    this.propietario = propietario;
  }

  public Persona getPropietario() {
    return propietario;
  }

  @Override
  public String toString() {
    return "{" +
      " placa💿='" + this.placa + "'" +
      ", color🌈='" + this.color + "'" +
      ", propietario👤='" + getPropietario().toString() + "'" +
      "}";
  }
  
}

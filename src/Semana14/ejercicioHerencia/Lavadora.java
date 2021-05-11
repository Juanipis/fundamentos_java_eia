package Semana14.ejercicioHerencia;

public class Lavadora extends Electrodomestico {
  private double carga;

  public Lavadora(String color, char consumoEnergetico, double carga){
    super(color, consumoEnergetico);
    this.carga = carga;
  }

  public double getCarga() {
    return this.carga;
  }

  public void setCarga(double carga) {
    this.carga = carga;
  }

  public double precioFinal(){
    double precioF = super.precioFinal();
    if (getCarga() > 30) {
      precioF += 50000;
    }
    return precioF;
  }

  @Override
  public String toString() {
    return "{" +
      " precioBase='" + getPrecioBase() + "'" +
      ", color='" + getColor() + "'" +
      ", consumoEnergetico='" + getConsumoEnergetico() + "'" +
      ", peso='" + getPeso() + "'" +
      ", carga='" + getCarga() + "'" +
      "}";
  }
}

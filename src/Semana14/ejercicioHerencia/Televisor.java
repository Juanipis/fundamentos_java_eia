package Semana14.ejercicioHerencia;

public class Televisor extends Electrodomestico {
  private int tamPantalla;
  private boolean tdt;
  public Televisor(String color, char consumoEnergetico, int tamPantalla, boolean tdt) {
    super(color, consumoEnergetico);
    this.tamPantalla = tamPantalla;
    this.tdt = tdt;
  }


  public int getTamPantalla() {
    return this.tamPantalla;
  }

  public void setTamPantalla(int tamPantalla) {
    this.tamPantalla = tamPantalla;
  }

  public boolean getTdt() {
    return this.tdt;
  }

  public void setTdt(boolean tdt) {
    this.tdt = tdt;
  }
  

  public double precioFinal() {
      double precioFinal = super.precioFinal();
      if (tamPantalla > 40) {
        precioFinal += precioFinal*0.3;
      }
      if(tdt){
        precioFinal += 50000;
      }
      return precioFinal;
  }


  @Override
  public String toString() {
    return "{" +
      " precioBase='" + getPrecioBase() + "'" +
      ", color='" + getColor() + "'" +
      ", consumoEnergetico='" + getConsumoEnergetico() + "'" +
      ", peso='" + getPeso() + "'" +
      ", tamañoPantalla='" + getTamPantalla() + "'" +
      ", TDT='" + getTdt() + "'" +
      "}";
  }
}

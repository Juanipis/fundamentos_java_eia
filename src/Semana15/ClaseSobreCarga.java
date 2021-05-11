package Semana15;

public class ClaseSobreCarga {
  private double ancho;
  private double alto;
  private double profundo;

  public ClaseSobreCarga() {
    this.ancho = 0;
    this.alto = 0;
    this.profundo = 0;
  }
  public ClaseSobreCarga(double ancho) {
    this.ancho = ancho;
    this.alto = ancho;
    this.profundo = ancho;
  }
  public ClaseSobreCarga(double ancho, double alto) {
    this.ancho = ancho;
    this.alto = alto;
    this.profundo = ancho;
  }

  public ClaseSobreCarga(double ancho, double alto, double profundo) {
    this.ancho = ancho;
    this.alto = alto;
    this.profundo = profundo;
  }

  @Override
  public String toString() {
    return "{" +
      " ancho='" + getAncho() + "'" +
      ", alto='" + getAlto() + "'" +
      ", profundo='" + getProfundo() + "'" +
      "}";
  }


  public double getAncho() {
    return this.ancho;
  }

  public double getAlto() {
    return this.alto;
  }

  public double getProfundo() {
    return this.profundo;
  }


}

package Semana13;

public class Linea {
  private double puntoAX;
  private double puntoAY;
  private double puntoBX;
  private double puntoBY;

  public Linea() {
  }

  public Linea(double puntoAX, double puntoAY, double puntoBX, double puntoBY) {
    this.puntoAX = puntoAX;
    this.puntoAY = puntoAY;
    this.puntoBX = puntoBX;
    this.puntoBY = puntoBY;
  }

  public double getPuntoAX() {
    return this.puntoAX;
  }

  public void setPuntoAX(double puntoAX) {
    this.puntoAX = puntoAX;
  }

  public double getPuntoAY() {
    return this.puntoAY;
  }

  public void setPuntoAY(double puntoAY) {
    this.puntoAY = puntoAY;
  }

  public double getPuntoBX() {
    return this.puntoBX;
  }

  public void setPuntoBX(double puntoBX) {
    this.puntoBX = puntoBX;
  }

  public double getPuntoBY() {
    return this.puntoBY;
  }

  public void setPuntoBY(double puntoBY) {
    this.puntoBY = puntoBY;
  }

  public Linea puntoAX(double puntoAX) {
    setPuntoAX(puntoAX);
    return this;
  }

  public Linea puntoAY(double puntoAY) {
    setPuntoAY(puntoAY);
    return this;
  }

  public Linea puntoBX(double puntoBX) {
    setPuntoBX(puntoBX);
    return this;
  }

  public Linea puntoBY(double puntoBY) {
    setPuntoBY(puntoBY);
    return this;
  }

  @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Linea)) {
            return false;
        }
        Linea linea = (Linea) o;
        return puntoAX == linea.puntoAX && puntoAY == linea.puntoAY && puntoBX == linea.puntoBX && puntoBY == linea.puntoBY;
  }


  @Override
  public String toString() {
    return "{" +
      " puntoAX='" + getPuntoAX() + "'" +
      ", puntoAY='" + getPuntoAY() + "'" +
      ", puntoBX='" + getPuntoBX() + "'" +
      ", puntoBY='" + getPuntoBY() + "'" +
      "} ";
  }


}

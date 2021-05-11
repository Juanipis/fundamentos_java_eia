package Semana14;

public class Estudiante extends Persona {
  private int semestreActual;

  public Estudiante(String nombre, int edad, int semestreActual){
    super(nombre, edad);
    this.semestreActual = semestreActual;
  }

  public int getSemestreActual() {
    return this.semestreActual;
  }

  public void setSemestreActual(int semestreActual) {
    this.semestreActual = semestreActual;
  }

  @Override
  public String toString() {
    return "{" +
      " semestreActual='" + getSemestreActual() + "' Nombre='" + getNombre() + "' edad='" + getEdad() + "'" +
      "}";
  }
}

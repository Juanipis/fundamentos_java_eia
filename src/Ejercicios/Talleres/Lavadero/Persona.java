package Ejercicios.Talleres.Lavadero;

public class Persona {
  private String name;
  private int edad;

  public Persona(String name, int edad) {
    this.name = name;
    setEdad(edad);
  }


  public String getName() {
    return this.name;
  }

  public int getEdad() {
    return this.edad;
  }

  public void setEdad(int edad) {
    if(edad <= 0){
      this.edad = 1;
    }
    else{
      this.edad = edad;
    }
  }

  @Override
  public String toString() {
    return "{" +
      " nombre👥='" + getName() + "'" +
      ", edad⌛='" + getEdad() + "'" +
      "}";
  }

}

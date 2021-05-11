package Semana14.ejercicioHerencia;

public class Electrodomestico {
  protected double precioBase;
  protected String color;
  protected char consumoEnergetico;
  protected double peso = 5;
  
  

  public Electrodomestico(String color, char consumoEnergetico) {
    this.precioBase = 100000;
    this.peso = 5;
    comprobarColor(color);
    comprobarConsumoEnergetico(consumoEnergetico);

  }

  public double getPrecioBase() {
    return this.precioBase;
  }

  public void setPrecioBase(double precioBase) {
    this.precioBase = precioBase;
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public char getConsumoEnergetico() {
    return this.consumoEnergetico;
  }

  public void setConsumoEnergetico(char consumoEnergetico) {
    this.consumoEnergetico = consumoEnergetico;
  }

  public double getPeso() {
    return this.peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  //Metodos creados por el programador
  private void comprobarConsumoEnergetico(char letra){
    if(letra >= 65 && letra <= 70){
      setConsumoEnergetico(letra);
      
      
    }
    else{
      setConsumoEnergetico('F');
      System.out.println("Consumo energetico incorrecto, por defecto F");
    }
  }

  private void comprobarColor(String color){
    String[] coloresDisponibles = {"blanco", "negro", "rojo", "azul", "gris"};
    
    for (int i = 0; i < coloresDisponibles.length; i++) {
      String tempColor = coloresDisponibles[i];
      if(tempColor.equalsIgnoreCase(color)){
        System.out.println("Color correcto");
        setColor(color.toLowerCase());
        return;
      }
    }
    System.out.println("Color incorrecto, se configura por defecto blanco");
    setColor("blanco");
  }

  public double precioFinal(){
    double valorAdicional = 0;
    //Valor adicional consumo
    if(getConsumoEnergetico() == 'A'){
      valorAdicional += 100000;
    }
    else if(getConsumoEnergetico() == 'B'){
      valorAdicional += 80000;
    }
    else if(getConsumoEnergetico() == 'C'){
      valorAdicional += 60000;
    }
    else if(getConsumoEnergetico() == 'D'){
      valorAdicional += 60000;
    }
    else if(getConsumoEnergetico() == 'E'){
      valorAdicional += 30000;
    }
    else if(getConsumoEnergetico() == 'F'){
      valorAdicional += 10000;
    }

    //Valor adicional segun el peso
    if( getPeso() >= 0 && getPeso() <= 19 ){
      valorAdicional += 10000;
    }
    else if( getPeso() >= 20 && getPeso() <= 49 ){
      valorAdicional += 50000;
    }
    else if( getPeso() >= 50 && getPeso() <= 79 ){
      valorAdicional += 80000;
    }
    else if( getPeso() >= 80 ){
      valorAdicional += 100000;
    }
    return precioBase + valorAdicional;

  }

  @Override
  public String toString() {
    return "{" +
      " precioBase='" + getPrecioBase() + "'" +
      ", color='" + getColor() + "'" +
      ", consumoEnergetico='" + getConsumoEnergetico() + "'" +
      ", peso='" + getPeso() + "'" +
      "}";
  }

}

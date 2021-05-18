package Ejercicios.Talleres.Lavadero;

public class Lavadero {
  private String nombre;
  private int cantidadVehiculos;
  private Vehiculo[] vehiculos;

  public Lavadero(String nombre){
    this.nombre = nombre;
    this.cantidadVehiculos = 0;
    this.vehiculos = new Vehiculo[10];
    
  }
  public void ingresarVehiculo(Vehiculo vehiculo){
    if(this.cantidadVehiculos == 10){
      System.out.println("No se pueden añadir mas vehiculos");
    }
    else{
      vehiculos[cantidadVehiculos] = vehiculo;
      cantidadVehiculos++;
    }
  }

  public double calcularGanancia(){
    double total = 0;
    for (int i = 0; i < vehiculos.length; i++) {
      if(vehiculos[i] == null){
        continue;
      }
      else if(vehiculos[i].getClass() == Moto.class){ // vehiculos[i] instanceof Moto
        
        if(vehiculos[i].getPropietario().getEdad() >= 60 ){
          total += 7000-(7000*0.2);
        }
        else{
          
          total += 7000;
        }
      }
      else if(vehiculos[i].getClass() == Carro.class){
        if(vehiculos[i].getPropietario().getEdad() >= 60 ){
          total += 12000-(12000*0.2);
        }
        else{
          total += 12000;
        }
      }
    }
    return total;
  }

  public String getVehiculos() {
    String listaVehiculos = "";
    for (int i = 0; i < vehiculos.length; i++) {
      if(vehiculos[i] == null ){
        continue;
      }
      listaVehiculos += vehiculos[i].toString() + "\n";
    }
    
    return listaVehiculos;
  }

  @Override
  public String toString() {
    return "{" +
      " nombre='" + this.nombre + "'" +
      ", cantidadVehiculos='" + this.cantidadVehiculos + "'\n" +
      "vehiculos=\n'" + this.getVehiculos() + "'" +
      "}";
  }

}

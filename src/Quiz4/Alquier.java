package Quiz4;

public class Alquier {
  private int tipoVehiculo;
  private int diasAlquiler;
  private double precioAlquiler;
  

  public Alquier(int tipoVehiculo, int diasAlquiler) {
    this.tipoVehiculo = tipoVehiculo; // carro = 1  camioneta = 2  camion =3
    this.diasAlquiler = diasAlquiler;
    if(this.tipoVehiculo ==  1){
      this.precioAlquiler = 50;
    }
    else if(this.tipoVehiculo == 2){
      this.precioAlquiler = 150;
    }
    else if(this.tipoVehiculo == 3){
      this.precioAlquiler = 300;
    }
    
  }

  public int getTipoVehiculo() {
    return this.tipoVehiculo;
  }

  public void setTipoVehiculo(int tipoVehiculo) {
    this.tipoVehiculo = tipoVehiculo;
  }

  public int getDiasAlquiler() {
    return this.diasAlquiler;
  }

  public void setDiasAlquiler(int diasAlquiler) {
    this.diasAlquiler = diasAlquiler;
  }

  public double getPrecioAlquiler() {
    return this.precioAlquiler;
  }

  public void setPrecioAlquiler(double precioAlquiler) {
    this.precioAlquiler = precioAlquiler;
  }

  //Metodos creados por programadores
  public double totalAlquiler() {
    return (this.diasAlquiler * this.precioAlquiler)+(((this.diasAlquiler * this.precioAlquiler)*19)/100);
  }

  public String convertirTipoVehiculo() {
    if(tipoVehiculo == 1) {
    return "🚗Carro";
    }else if(tipoVehiculo == 2) {
    return "🚙Camioneta";
    }else if(tipoVehiculo == 3) {
    return "🚚Camión";
    }
    return "";
  }

  public void mostrarInformacion(){
    String resultado = "Tipo de vehiculo: " + convertirTipoVehiculo() + "\nAlquilado durante: " + getDiasAlquiler() + " 🌄días\nEl total del alquiler es: 💲 " + totalAlquiler();
    System.out.println(resultado);
  }
}

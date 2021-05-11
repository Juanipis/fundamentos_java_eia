package Ejercicios.Talleres.Lavadero;

public class Moto extends Vehiculo{
  private int tipoMoto;

  public Moto(String placa, String color, Persona propietario, int tipoMoto){
    super(placa, color, propietario);
    setTipoMoto(tipoMoto);
  }

  public void setTipoMoto(int tipoMotoTiempo){
    if(tipoMotoTiempo == 2 || tipoMotoTiempo == 4){
      this.tipoMoto = tipoMotoTiempo;
    }
    else{
      this.tipoMoto = 2; //Por defecto
    }
  }

  public int getTipoMoto(){
    return tipoMoto;
  }
  
  @Override
  public String toString() {
    return "{🛵" +
      " placa💿='" + this.placa + "'" +
      ", color🌈='" + this.color + "'" +
      ", propietario👤='" + getPropietario().toString() + "'" +
      ", tipoMoto🛵='" + getTipoMoto() + " tiempos'" +
      "}";
  }
}

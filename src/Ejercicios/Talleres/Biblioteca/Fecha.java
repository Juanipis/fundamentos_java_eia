package Ejercicios.Talleres.Biblioteca;

public class Fecha {
  private int anio;
  private int mes;
  private int dia;

  public Fecha(){
    this.anio = 0;
    this.mes = 0;
    this.dia = 0;
  }
  
  public Fecha(int anio, int mes, int dia){
    this.anio = anio;
    setMes(mes);
    setDia(dia);
  }


  public int getAnio() {
    return this.anio;
  }

  public void setAnio(int anio) {
    this.anio = anio;
  }

  public int getMes() {
    return this.mes;
  }

  public void setMes(int mes) {
    if(mes <= 0 || mes > 12){
      this.mes = 1;
    }
    else{
      this.mes = mes;
    }
  }

  public int getDia() {
    return this.dia;
  }

  public void setDia(int dia) {
    if(dia <= 0 || dia > 30){
      this.dia = 1;
    }
    else{
      this.dia = dia;
    }
  }
  //Solo funciona si los meses tienen 30 días, lo cual dice el ejercicio
  public int calcularDiferenciaEnDias(Fecha fechaFinal){
    int diasFinal = (fechaFinal.getAnio()*365) + (fechaFinal.getMes()*30) + fechaFinal.getDia();
    int diasInicial = (anio*365) + (mes*30) + dia;
    return diasFinal-diasInicial;
  }
}

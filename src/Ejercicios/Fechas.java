package Ejercicios;

public class Fechas {
  private int dia;
  private int mes;
  private int año;


  public Fechas(int dia, int mes, int año) {
    this.dia = dia;
    this.mes = mes;
    this.año = año;
  }

  public int getDia() {
    return this.dia;
  }

  public void setDia(int dia) {
    if(dia <= 0 || dia >30){
      this.dia = 1;
    }
    else{
      this.dia = dia;
    }
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

  public int getaño() {
    return this.año;
  }

  public void setaño(int año) {
    this.año = año;
  }
  public void anadirDias(int diasSuma){
    int sumandoDias = this.dia + Math.abs(diasSuma);
    if(sumandoDias>30){
      anadirMes(1);
      this.dia = 1;
      anadirDias(sumandoDias-30);
    }
    else{
      this.dia = sumandoDias;
    }
  }

  public void restarDias(int diasResta){
    int restandoDias = this.dia - Math.abs(diasResta);
    if(restandoDias<=0){
      restarMes(1);
      this.dia = 30;
      restarDias(restandoDias);
    }
    else{
      this.dia = restandoDias;
    }

  }

  public void anadirMes(int mesSuma){
    int sumandoMes = this.mes + mesSuma;
    if(sumandoMes>12){
      this.año = this.año + 1;
      this.mes = 1;
      anadirMes(sumandoMes-12);
    }
    else{
      this.mes = sumandoMes;
    }
  }

  public void restarMes(int mesResta){
    int restandoMes = this.mes - Math.abs(mesResta);
    if(restandoMes<=0){
      this.año--;
      this.mes = 12;
      restarMes(restandoMes);
    }
    else{
      this.mes = restandoMes;
    }
  }

  @Override
  public String toString() {
    return "{" +
      " dia='" + getDia() + "'" +
      ", mes='" + getMes() + "'" +
      ", año='" + getaño() + "'" +
      "}";
  }

  
}

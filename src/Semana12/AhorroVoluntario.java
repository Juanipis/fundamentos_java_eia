package Semana12;


import java.util.logging.Logger;

public class AhorroVoluntario {
  String nombreCliente;
  double cantidadDineroActual;
  Logger logger = Logger.getLogger(AhorroVoluntario.class.getName());
  //Constructor
  AhorroVoluntario(String nombreCliente, double cantidadDineroActual){
    this.nombreCliente = nombreCliente;
    this.cantidadDineroActual = cantidadDineroActual;
    logger.info("Cliente creado con exito");
  }

  //Metodo ingresar dinero
  public void ingresarDinero(double dineroIngresado){
    this.cantidadDineroActual += dineroIngresado;
    logger.info(String.format("Se ha ingresado: %f, dinero actual: %f", dineroIngresado,this.cantidadDineroActual));
  }

  //Metodo retirar dinero
  public void retirarDinero(double dineroRetirado){
    this.cantidadDineroActual -= dineroRetirado;
    logger.info(String.format("Se ha retirado: %f, dinero actual: %f", dineroRetirado,this.cantidadDineroActual));
  }

  //Metodo informativo cliente
  public String informacionActual() {
    return String.format("*---------*%n👤%s tiene actualmente : %f💰%n*---------*", this.nombreCliente, this.cantidadDineroActual);
  }
}

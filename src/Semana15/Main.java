package Semana15;

public class Main {
  public static void main(String[] args) {
    ClaseSobreCarga cubo1 =  new ClaseSobreCarga();
    System.out.println(cubo1);

    ClaseSobreCarga cubo2 =  new ClaseSobreCarga(12);
    System.out.println(cubo2);

    ClaseSobreCarga cubo3 =  new ClaseSobreCarga(16, 20);
    System.out.println(cubo3);

    ClaseSobreCarga cubo4 =  new ClaseSobreCarga(89,30,12);
    System.out.println(cubo4);
  }
  

}

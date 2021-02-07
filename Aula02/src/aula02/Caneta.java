package aula02;
public class Caneta {
    String color;
    String model;
    float tip;
    int charge;
    boolean tampada;
    
    void status() {
        System.out.println("MODELO: "+this.model);
        System.out.println("COR: "+ this.color);
        System.out.println("PONTA: "+this.tip);
        System.out.println("CARGA "+ this.charge);
         System.out.println("ESTÁ TAMPADA? "+ this.tampada);
    }
    void white(){
        if (this.tampada == true) {
            System.out.println("Destampa essa bosta");
        } else {
            System.out.println("To rabiscando");
        }
    }
  
    void destampar() {
        this.tampada = false;
    }

    void tampar() {
        this.tampada = true;
    }
}

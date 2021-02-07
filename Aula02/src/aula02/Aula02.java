package aula02;

public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.color = "Azul";
        c1.tip = 0.5f;
        c1.destampar();
        c1.status();
        c1.white();
        c1.tampar();
        System.out.println("===================");
        c1.status();
        c1.white();
     
        System.out.println("INICIANDO A CANETA2");
        System.out.println("-----------------------");
        Caneta c2 = new Caneta();
        c2.color = "Vermelha";
        c2.tip = 1.0f;
        c2.tampar();
        c2.status();
    }
    
}

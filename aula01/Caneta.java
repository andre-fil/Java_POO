package  aula01;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void rabiscar() {
        if(this.tampada){
            System.out.println("Impossível rabiscar");
        } else{
            System.out.println("Rabiscando..");
        }

    }

    void tampar() {
        this.tampada = true;
    }

        void destampar () {
            this.tampada = false;
        }

        void status () {
            System.out.println("A cor da caneta é  " + this.cor);
            System.out.println("A ponta é " + this.ponta);
            if(this.tampada){
                System.out.println("A caneta está tampada");
            } else{
                System.out.println("A caneta está destampada");
            }

        }

    }




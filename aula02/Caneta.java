package  aula02;

public class Caneta {
    public String modelo;
   public String cor;
   private float ponta;
   protected int carga;
   protected boolean tampada;

    public void rabiscar() {
        if(this.tampada){
            System.out.println("Impossível rabiscar");
        } else{
            System.out.println("Rabiscando..");
        }

    }

    private void escrever(){
        System.out.println("Escrevendo...");
    }

    protected void tampar() {
        this.tampada = true;
    }

    protected void destampar () {
        this.tampada = false;
    }

    public void status () {
        System.out.println("A cor da caneta é  " + this.cor);
        System.out.println("A ponta é " + this.ponta);
        if(this.tampada){
            System.out.println("A caneta está tampada");
        } else{
            System.out.println("A caneta está destampada");
        }

    }

}




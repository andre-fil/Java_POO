package aula03;

public class Caneta {

    public String modelo;
    private float ponta;

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String m){
        this.modelo = m;
    }

    public float getPonta(){
        return this.ponta;
    }

    public void setPonta(float p){
        this.ponta = p;
    }
    public Caneta(String m ){ //método construtor
        this.modelo = m;
        this.ponta = 0.3f;
    }

    public void status(){
        System.out.println("Informações");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
    }
}

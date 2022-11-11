package aula07;

public class Peixe extends Animal{
    private String corEscama;

    //Métodos
    public void soltarBolha(){
        System.out.println("Soltando bolhas");
    }

    //Métodos herdados
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo algas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }

    //Métodos especiais

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}

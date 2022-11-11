package aula07;

public class Ave extends Animal{
    private String corPena;

    //Métodos
    public void fazerNinho(){
        System.out.println("Fazendo ninho...");
    }

    //Métodos herdados
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");

    }

    //Métodos especiais

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}

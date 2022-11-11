package aula07;

public class Main {
    public static void main(String[] args){
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setPeso(76.6f);
        m.setCorPelo("Dourado");
        m.alimentar();
        m.locomover();

        a.locomover();
        a.alimentar();

        Canguru c = new Canguru();
        c.locomover();
    }
}

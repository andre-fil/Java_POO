package aula07.sobrecarga;

public class Main {
    public static void main(String[] args){
        Mamifero m = new Mamifero();
        m.emitirSom();
        Lobo l = new Lobo();
        l.emitirSom();
        Cachorro c = new Cachorro();
        c.emitirSom();

        c.reagir(true);
        c.reagir("Que é");
        c.reagir(15,20);
        c.reagir(10,15.4f);
    }
}

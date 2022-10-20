package projetinho02;

// Relacionamento entre classes

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Pretty Boy", "EUA",31,1.75f,68.9f,11,2,1);
        l[1] = new Lutador("Putscript", "Brasil",29,1.68f,57.8f,14, 2,3);
        l[2] = new Lutador("Snapshadow","Holandês",28,1.93f,81.6f,13,0,2);
        l[3] = new Lutador("José","brasil",37,1.70f,119.3f,5,4,3);
        l[4] = new Lutador("Dear code","Inglaterra",35,1.65f,80.9f,12,2,1);
        l[5] = new Lutador("nerdaart","França",30,1.81f,105.7f,12,2,4);

        /*
        l[3].status();
        l[3].ganharLuta();
        l[3].status();
        */

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[3],l[5]);
        UEC01.lutar();




    }
}

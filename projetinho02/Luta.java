package projetinho02;
import java.util.Random;
import java.lang.Thread;


public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //Métodos especiais


    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
     };
     public void lutar() throws InterruptedException {
         if(this.isAprovada()){
             System.out.println("### DESAFIADO ###");
             this.getDesafiado().apresentar();
             System.out.println("------------------------");
             System.out.println();
             Thread.sleep(2000);
             System.out.println("### DESAFIANTE ###");
             this.getDesafiante().apresentar();
             System.out.println("------------------------");
             System.out.println();
             Thread.sleep(2000);

             Random aleatorio = new Random();


             System.out.println("---- RESULTADO DA LUTA -----");
             int vencedor = aleatorio.nextInt(3);
             switch(vencedor) {
                 case(0):
                     System.out.println("EMPATE");
                     this.getDesafiado().empatarLuta();
                     this.getDesafiante().empatarLuta();
                     break;
                 case(1):
                     System.out.println("VENCE " + this.getDesafiado().getNome());
                     this.getDesafiado().ganharLuta();
                     this.getDesafiante().perderLuta();
                     break;
                 case(2):
                     System.out.println("VENCE " + this.getDesafiante().getNome());
                     this.getDesafiado().perderLuta();
                     this.getDesafiante().ganharLuta();
                     break;

             }

             System.out.println("-----------------------");
             Thread.sleep(2000);
           this.getDesafiado().status();
             this.getDesafiante().status();


         } else{
             System.out.println("A luta não pode ocorrer!");
         }






     };

}

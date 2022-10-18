package projetinho01;

public class Main {
    public static void main(String[] args){
        ContaBanco c1 = new ContaBanco();
        c1.setNumConta(80101);
        c1.setDono("André Barreto");
        c1.abrirConta("cc");
        c1.depositar(200);
        c1.sacar(100);
        c1.sacar(150);
        c1.pagarMensal();
        c1.fecharConta();

        ContaBanco c2 = new ContaBanco();
        c2.setNumConta(70029);
        c2.setDono("Lays Eloi");
        c2.abrirConta("cp");
        c2.depositar(300);
        c2.pagarMensal();
        c2.sacar(430);
        c2.fecharConta();


        c1.Estado();
        c2.Estado();
    }
}

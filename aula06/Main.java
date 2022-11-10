package aula06;

public class Main {
    public static void main(String[] args){
        Visitante v1 = new Visitante();
        v1.setNome("Harry Potter");
        v1.setIdade(25);
        v1.setSexo("M");
        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("André Barreto");
        a1.setMatricula(111);
        a1.setCurso("Ciência da computação");
        a1.setIdade(20);
        a1.setSexo("M");
        a1.pagarMensalidade();
        System.out.println(a1.toString());

        Bolsista b1 = new Bolsista();
        b1.setMatricula(2222);
        b1.setBolsa(12.5f);
        b1.setCurso("Ciência da Computação");
        b1.setNome("John");
        b1.pagarMensalidade();


    }
}

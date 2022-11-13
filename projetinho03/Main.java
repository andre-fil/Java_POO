package projetinho03;

public class Main {
    public static void main(String[] args){
        Video v[] = new Video[3];

        v[0] = new Video("A Teoria de Tudo");
        v[1] = new Video("O Último Teorema de Fermat");
        v[2] = new Video("A História do Número um");

        //System.out.println( v[0].toString());

        Aluno alunos[] = new Aluno[3];
        alunos[0] = new Aluno("André",20,"M","barreto.andre");
        alunos[1] = new Aluno("John",19,"M","joao.victor");
        alunos[2] = new Aluno("Iago",21,"M","iago.victor");


        Visualizacao visualizacao1 = new Visualizacao(alunos[0],v[1]);
        Visualizacao visualizacao2 = new Visualizacao(alunos[0],v[2]);
        visualizacao1.avaliar(30);
        System.out.println(visualizacao1.toString());



    }
}

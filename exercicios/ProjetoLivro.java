package exercicios;

import java.sql.SQLOutput;

public class ProjetoLivro {
    public static void main(String[] args){
        Pessoa[] pessoa = new Pessoa[2];
        Livro[] livro = new Livro[3];

        pessoa[0] = new Pessoa("André",20,"M");
        pessoa[1] = new Pessoa("Lays",21,"F");

        livro[0] = new Livro("Código da Vinci","Dan brown",320,pessoa[1]);
        livro[1] = new Livro("Matemática","Deitel",452,pessoa[1]);
        livro[2] = new Livro("Estrutura de Dados","Jason",526,pessoa[0]);

        livro[0].abrir();
        livro[0].folhear(600);


        System.out.println(livro[0].detalhes());

    }




}

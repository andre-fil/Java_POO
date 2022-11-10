package aula05;

public class Main {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Geraldo");
        p2.setNome("John");
        p3.setNome("Salles");
        p4.setNome("Simara");

        p1.setSexo("M");
        p4.setSexo("F");
        p3.setIdade(23);
        p2.setCurso("Informática");
        p4.setSetor("Banco de Dados");
        p3.setEspecialidade("Mídias");
        //poderíamos setar mais coisa

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}

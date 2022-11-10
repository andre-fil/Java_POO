package aula06;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    //Métodos
    public void pagarMensalidade(){
        System.out.println("Pagamndo  mensalidade");
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", curso='" + curso + '\'' +
                '}';
    }

    //Métodos especiais

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}

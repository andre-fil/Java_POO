package aula05;

public class Aluno extends Pessoa {
    private int mat;
    private String curso;

    //Métodos
    public void cancelaMat(){
        System.out.println("Matrícula cancelada");
    }

    //Métodos especiais

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}

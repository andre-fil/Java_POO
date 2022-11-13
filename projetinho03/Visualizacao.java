package projetinho03;

public class Visualizacao {
    private Aluno espectador;
    private Video filme;

    public Visualizacao(Aluno espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
        this.filme.setReproduzindo(true);
    }

    //Métodos
    public void avaliar(){
        this.filme.setAvaliacao(5);

    }

    public void avaliar(float nota){
        this.filme.setAvaliacao(nota);

    }

    public void avaliar(int porcentagem){
        int tot = 0;
        if(porcentagem <= 20){
            tot = 3;
        } else if(porcentagem <= 70){
            tot = 6;
        } else{
            tot = 9;
        }

        this.filme.setAvaliacao(tot);

    }

    //Métodos especiais

    public Aluno getEspectador() {
        return espectador;
    }

    public void setEspectador(Aluno espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return
                "espectador=" + espectador + "\n" +
                " filme=" + filme +
                '}';
    }
}

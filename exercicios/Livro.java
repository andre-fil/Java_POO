package exercicios;

public class Livro implements Publicacao{
    private String titulo;
    private String ator;
    private int totpag;
    private int pagatual;
    private boolean aberto;
    private Pessoa leitor;

    //usando método tostring como detalhes

    public String detalhes() {
        return "\nLivro{" +
                "\ntitulo='" + titulo + '\'' +
                ", \nator='" + ator + '\'' +
                ", \ntotpag=" + totpag +
                ", \npagatual=" + pagatual +
                ", \naberto=" + aberto +
                ", \nleitor=" + leitor.getNome() +
                '}';
    }

    // construtor
    public Livro(String titulo, String ator, int totpag, Pessoa leitor) {
        this.titulo = titulo;
        this.ator = ator;
        this.totpag = totpag;
        this.pagatual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAtor() {
        return ator;
    }

    public void setAtor(String ator) {
        this.ator = ator;
    }

    public int getTotpag() {
        return totpag;
    }

    public void setTotpag(int totpag) {
        this.totpag = totpag;
    }

    public int getPagatual() {
        return pagatual;
    }

    public void setPagatual(int pagatual) {
        this.pagatual = pagatual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int pag) {
        if (pag > this.getTotpag()){
            System.out.println("Não foi possível abrir nessa página");
            setPagatual(0);
        } else{
            setPagatual(pag);
        }
    }

    @Override
    public void avancarPag() {
        this.setPagatual(this.getPagatual() + 1);
    }

    @Override
    public void voltarPag() {
        this.setPagatual(this.getPagatual() -1);
    }
}

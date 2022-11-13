package projetinho03;

public class Video implements Multimidia {
    private String titulo;
    private float avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    //Métodos implementados
    @Override
    public void play() {
        this.setReproduzindo(true);
    }

    @Override
    public void pause() {
        this.setReproduzindo(false);

    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);

    }

    //Métodos especiais

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(float avaliacao) {
        int nova;
        nova = (int) (this.getAvaliacao() + avaliacao) / this.getViews();
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    //toString

    @Override
    public String toString() {
        return "" +
                "titulo='" + titulo + '\''+
                "\n" +" avaliacao=" + avaliacao +
                "\n" +" views=" + views +
                "\n" +" curtidas=" + curtidas +
                "\n" +" reproduzindo=" + reproduzindo;
    }
}

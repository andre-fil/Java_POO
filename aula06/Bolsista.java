package aula06;

public final  class Bolsista extends Aluno{
    private float bolsa;

    //Métodos
    public void renovarBolsa(){
        System.out.println("Renovando bolsa");
    }
    @Override
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade automática - Bolsista");

    }

    //Métodos especias

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}

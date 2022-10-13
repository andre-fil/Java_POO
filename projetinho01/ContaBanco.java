package projetinho01;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;

    private float saldo;
    private boolean status;

    public void abrirConta() {

    }

    public void fecharConta(){

    }

    public void depositar(){

    }

    public void sacar(){

    }

    public void pagarMensal(){

    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public ContaBanco(float saldo, boolean status) {
        this.saldo = 0;
        this.status = false;
    }
}

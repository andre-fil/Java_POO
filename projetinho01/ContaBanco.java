package projetinho01;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;

    private float saldo;
    private boolean status;

    public void Estado(){
        System.out.println("----------------------------------------");
        System.out.println("Número de conta: " + this.getNumConta());
        System.out.println("Tipo de conta: " + this.getTipo());
        System.out.println("Proprietário da conta: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
        System.out.println("----------------------------------------");
    }

    public void abrirConta(String tipo_conta){
        this.setTipo(tipo_conta);
        this.setStatus(true);
        if(this.getTipo().equals("cc")){
            this.setSaldo(50);
        } else if(this.getTipo().equals("cp")){
            this.setSaldo(150);

        }
    }

    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Impossível fechar conta! Conta com saldo");
        } else if (this.getSaldo() < 0){
            System.out.println("Impossível fechar conta! Conta em débito");
        } else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }

    }

    public void depositar(float v){
        if(this.isStatus()){
            this.setSaldo(this.getSaldo() + v);
        } else{
            System.out.println("Impossível depositar valor");
        }

    }

    public void sacar(float v){
        if(this.isStatus() && this.getSaldo() >= v){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Saque realizado com sucesso");
        } else{
            System.out.println("Operação de saque indisponível");
        }

    }

    public void pagarMensal(){
       float v;
        if (this.getTipo().equals("cc")) {
            v = 12;
        } else{
            v = 20;
        }
        if(this.isStatus() && this.getSaldo() >= v){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade descontada de saldo!");
        } else{
            System.out.println("Não foi possível descontar mensalidade");
        }


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

    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }








}

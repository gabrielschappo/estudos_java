package Ex3;

public class Conta {
    int numero;
    String agencia;
    String nomeTitular;
    double saldoAtual;
    double limite;

    public Conta(int numero, String agencia, String nomeTitular, double saldoAtual, double limite) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeTitular = nomeTitular;
        this.saldoAtual = saldoAtual;
        this.limite = limite;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getNomeTitular() {
        return nomeTitular;
    }
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    public double getSaldoAtual() {
        return saldoAtual;
    }
    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }
    public double getLimite() {
        return limite;
    }
    
    public double consultarSaldo(){
        return saldoAtual;
    }

    public void realizarSaque(double valor){
        if ((saldoAtual - valor) >= (limite * -1)){
            setSaldoAtual(saldoAtual - valor);
        }else{
            System.out.println("Transação falhou, limite da conta atingido.");
        }
    }

    public void realizarDeposito(double valor){
        setSaldoAtual(saldoAtual + valor);
    }
}

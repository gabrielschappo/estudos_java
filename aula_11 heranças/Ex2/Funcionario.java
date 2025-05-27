package Ex2;

public class Funcionario {
    String nome;
    double valorHora;
    double horasTrabalhadas;

    public double calcularSalario(){
        return valorHora * horasTrabalhadas;
    }
}

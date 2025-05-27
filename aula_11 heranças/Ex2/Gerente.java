package Ex2;

public class Gerente extends Funcionario{
    @Override
    public double calcularSalario() {
        return super.calcularSalario() * 1.05;
    }
}

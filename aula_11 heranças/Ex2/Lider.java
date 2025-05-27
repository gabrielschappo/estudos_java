package Ex2;

public class Lider extends Funcionario {
    @Override
    public double calcularSalario() {
        return super.calcularSalario() * 1.02;
    }
}

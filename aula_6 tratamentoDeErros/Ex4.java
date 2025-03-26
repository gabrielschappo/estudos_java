/* Crie um método estático que receba um parâmetro inteiro entre 1 e 10.
Caso receber um valor diferente, o método deve lançar a Exceção
IllegalArgumentException. */

public class Ex4 {
    public static void validar(int num) {
        if (num > 10 || num < 1){
            throw new IllegalArgumentException("O número deve estar entre 1 e 10.");
        }
        System.out.println("Número válido: " + num);
    }
    public static void main(String[] args) {
        try{
            validar(5);
            validar(20);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

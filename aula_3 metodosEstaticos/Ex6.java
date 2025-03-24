/* Crie um método estático para verificar se uma equação do 2 grau possui
soluções reais. O método deve receber por parâmetro os valores de a,b e c
e retornar verdadeiro ou falso. */

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();
        System.out.print("Digite o valor de c: ");
        double c = scanner.nextDouble();
        if (verificarSolucao(a, b, c) == true){
            System.out.println("A equação possui soluções reais");
        }else{
            System.out.println("A equação não possui soluções reais");
        }
    }
    public static boolean verificarSolucao(double a, double b, double c) {
        if ((b * b) - (4 * a * c) >= 0){
            return true;
        }else{
            return false;
        }
    }
}

/* Crie um método estático para calcular a potência de um número inteiro. O
método deve retornar o valor calculado. Não utilize as funções prontas da
linguagem. */

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Digite um número para calcular a potência: ");
        int num = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Digite o número da potência: ");
        int pot = scanner2.nextInt();
        System.out.println(calcularPot(num, pot));

    }
    public static int calcularPot(int num, int pot){
        int calculo = num;
        for (int x = 1; x < pot; x++){
            num = num * calculo;
        }
        return num;
    }
}

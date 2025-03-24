/* Crie um método estático para calcular o dobro de um número. O método
deve retornar o valor calculado. */

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Digite um número para ser dobrado: ");
        double num = scanner1.nextDouble();
        System.out.println(dobrar(num));

    }
    public static double dobrar(double num){
        return num * 2;
    }
}

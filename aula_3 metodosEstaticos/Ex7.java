/* Crie um método estático para comparar dois números e retonar o menor
valor. */

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.println("O menor número entre " + num1 + " e " + num2 + " é: " + verificarMenor(num1, num2));
    }
    public static double verificarMenor(double num1, double num2){
        if (num1 < num2){
            return num1;
        }else{
            return num2;
        }
    }
}

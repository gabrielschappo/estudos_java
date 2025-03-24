/* Crie um método estático para calcular o número fibonacci. O método deve
retornar o valor calculado. Faça um método que calcule de maneira
iterativa e outro método que calcule de maneira recursiva. */

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Digite uma posição na sequência de fibonacci: ");
        int pos = scanner1.nextInt();
        System.out.println("Calculado de forma Iterativa\nO número de fibonacci na posição " + pos + " é: " + calculoIterativo(pos));
        System.out.println("Calculado de forma Responsiva\nO número de fibonacci na posição " + pos + " é: " + calculoResponsivo(pos));
    }
    public static int calculoIterativo(int pos){
        if (pos <= 0){
            return 0;
        }else if (pos == 1){
            return 1;
        }
        int num1 = 1;
        int num2 = 1;
        int prox = 0;
        for (int x = 0; x < pos; x++){
            prox = num1 + num2;
            num1 = num2;
            num2 = prox;
        }
        return num2 - num1;
    }
    public static int calculoResponsivo(int pos){
        if (pos <= 0){
            return 0;
        }
        else if (pos == 1){
            return 1;
        }
        return calculoResponsivo(pos - 1) + calculoResponsivo(pos - 2);
    }
}

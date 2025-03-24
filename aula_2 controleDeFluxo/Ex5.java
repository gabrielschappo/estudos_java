/*Escreva um programa que imprima em tela a tabuada do número
informado pelo usuário. */

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Digite um número da tabuadaa de 1 a 10: ");
        int num = scanner1.nextInt();
        System.out.print("Tabuada do " + num);
        for (int y = 0; y <= 10; y++){
            System.out.println(y + "x" + num + " = " + num * y);
        }
    }
}

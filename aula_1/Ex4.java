//Escreva um programa em java que receba dois textos. Verifique se os dois
//textos são iguais e apresente o resultado em tela.

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Informe o primeiro texto: ");
        String text1 = scanner1.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Informe o segundo texto: ");
        String text2 = scanner2.nextLine();
        if (text1.equals(text2)){
            System.out.println("Os textos são iguais.");
        }
        else{
            System.out.println("Os textos são diferentes.");
        }
    }
}

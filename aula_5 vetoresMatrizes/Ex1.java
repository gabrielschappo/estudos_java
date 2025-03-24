/* Escreva um programa em java que realize a busca de um número em um
vetor. O vetor deve ser preenchido com valores aleatórios. Caso o valor
existir no vetor, apresente a sua posição. Caso contrário, informe que o
valor não existe no vetor */

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int vetor[] = {4,2,5,7,1,8};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();
        for (int x = 0; x < vetor.length; x++){
            if (vetor[x] == num){
                System.out.println(num + " está na posição " + x);
                break;
            }else if (x == vetor.length - 1){
                System.out.println(num + " não existe no vetor");
            }
        }
    }
}
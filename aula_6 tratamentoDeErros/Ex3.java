/* Escreva um programa que contenha um vetor de Strings. Esse vetor pode
ter algumas posições preenchidas. O usuário irá digitar a posição que
deseja visualizar em tela. Caso for informado uma posição inválida, realize
o tratamento de erros. */

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vetor[] = {"domingo","segunda","terça","quarta","quinta","sexta","sábado"};
        try{
            System.out.print("Digite uma posição do vetor: ");
            int pos = scanner.nextInt();
            if (pos < 0 || pos > 6){
                throw new ArrayIndexOutOfBoundsException("Posição inválida!");
            } else {
                System.out.println(vetor[pos]);
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

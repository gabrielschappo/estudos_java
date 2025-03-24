/* Crie um método estático que receba uma matriz com 2 dimensões e
calcule:
A soma dos elementos da primeira coluna;
O produto dos elementos da primeira linha;
A soma de todos os elementos;
O produto da diagonal principal. */

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = scanner.nextInt();
        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = scanner.nextInt();
        int matriz[][] = new int[linhas][colunas];
        int somaGeral = 0;
        int prodDiag = 1;
        int somaCol1 = 0;
        int prodLin1 = 1;
        for (int x = 0; x < matriz.length; x++){
            for (int y = 0; y < matriz[x].length; y++){
                System.out.print("Digite um valor para a posição " + "["+x+"]"+"["+y+"]: ");
                matriz[x][y] = scanner.nextInt();
                somaGeral = matriz[x][y] + somaGeral;
                if (x == y){
                    prodDiag = matriz[x][y] * prodDiag;
                }
                if (y == 0){
                    somaCol1 = matriz[x][0] + somaCol1;
                }
                if (x == 0){
                    prodLin1 = matriz[0][y] * prodLin1;
                }
            }
        }
        System.out.println("Soma dos elementos da primeira coluna: " + somaCol1);
        System.out.println("Produto dos elementos da primeira linha: " + prodLin1);
        System.out.println("Soma de todos os elementos: " + somaGeral);
        System.out.println("Produto da diagonal principal: " + prodDiag);
    }
}

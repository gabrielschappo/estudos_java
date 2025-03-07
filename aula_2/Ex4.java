/*Escreva um programa que calcule a média final em um bimestre. O
usuário deve informar quantas atividades teve no bimestre. Em seguida, o
programa deve solicitar as notas de cada atividade e calcular a média
aritmética. Apresente o resultado em tela. */

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scannerQuant = new Scanner(System.in);
        System.out.print("Digite o número de atividades do bimestre: ");
        int quant = scannerQuant.nextInt();
        double soma = 0;
        Scanner scannerNotas = new Scanner(System.in);
        for (int x = 1; x <= quant; x++){
            System.out.print("Digite a nota da atividade " + x + ": ");
            double nota = scannerNotas.nextDouble();
            soma = nota + soma;
        }
        double media = soma / quant;
        System.out.println("A média final do bimestre é: " + media);
    }
}

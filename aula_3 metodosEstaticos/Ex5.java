/* Crie um método estático para calcular a área de um círculo. O método
deve retornar o valor calculado. */

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Digite o raio do círculo: ");
        double raio = scanner1.nextDouble();
        System.out.println("A área do círculo é: " + areaCirculo(raio));

    }
    public static double areaCirculo(double raio){
        return (raio * raio) * Math.PI;
    }
}

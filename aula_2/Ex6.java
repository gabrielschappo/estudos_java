/*Escreva um programa que imprima em tela as tabuadas de 1 até 10.
 */

public class Ex6 {
    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++){
            System.out.println("Tabuada do: " + x);
            for (int y = 1; y <= 10; y++){
                System.out.println(y + "x" + x + " = " + y * x);
            }
        }
    }
}

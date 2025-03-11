/* Crie um método estático que receba um número inteiro positivo e retorne
true se ele for primo e false caso contrário. */

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um inteiro positivo: ");
        int num = scanner.nextInt();
        if (verificarPrimo(num) == true){
            System.out.println(num + " é primo");
        }else{
            System.out.println(num + " não é primo");
        }
    }
    public static boolean verificarPrimo(int num){
        int cont = 0;
        for (int x = 1; x <= num; x++){
            if (num % x == 0){
                cont += 1;
            }
        }
        if (cont == 2){
            return true;
        }else{
            return false;
        }
    }
}

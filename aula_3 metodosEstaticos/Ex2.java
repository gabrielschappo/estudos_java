/* Crie um método estático para imprimir um texto na cor vermelha */

public class Ex2 {
    public static void main(String[] args) {
        String texto = "Texto transformado na cor vermelha";
        corVermelha(texto);
             
    }
    public static void corVermelha(String texto){
        System.out.print("\u001B[31m");
        System.out.println(texto);
    }
}

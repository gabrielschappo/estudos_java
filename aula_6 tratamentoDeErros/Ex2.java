/* Escreva um método estático com um bloco de tratamento de erro com
finally. Realize o retorno do método dentro do bloco try e verifica se o
bloco finally é executado. */

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Resultado: " + metodoComFinally());
    }
    public static int metodoComFinally(){
        try{
            System.out.println("Dentro do try");
            return 10;
        }catch (Exception e){
            System.out.println("Dentro do catch");
            return 20;
        }finally{
            System.out.println("Dentro do finally");
            //finally sempre é executado
        }
    }
}

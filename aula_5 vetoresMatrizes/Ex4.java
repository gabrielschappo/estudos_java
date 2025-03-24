/* Crie um método estático que receba um vetor de caracteres e determine se
contém um palíndromo. Crie uma versão do método que recebe uma
String. */

public class Ex4 {
    public static boolean verifChar(char[] array){
        int test1 = 0;
        int test2 = array.length - 1;
        while (test1 < test2){
            if (array[test1] != array[test2]){
                return false;
            }
            test1 ++;
            test2 --;
        }
        return true;
    }
    public static boolean verifString(String str){
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int test1 = 0;
        int test2 = str.length() - 1;
        while (test1 < test2){
            if (str.charAt(test1) != str.charAt(test2)){
                return false;
            }
            test1 ++;
            test2 --;
        }
        return true;
    }
    public static void main(String[] args) {
         char[] array = {'r','a','d','a','r'};
         System.out.println("Vetor é palíndromo: " + verifChar(array));

         String text = "ovo";
         System.out.println("String é palíndromo: " + verifString(text));
    }
}

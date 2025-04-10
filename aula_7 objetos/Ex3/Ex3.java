/* Modele uma classe que represente um dado de 6 faces. A classe deve ter
um metodo que simule a acao de rolar um dado. Crie o diagrama de classe
da UML e o codigo java correspondente. Crie alguns objetos da classe e
execute a acao de rolar o dado.
 */

package Ex3;
public class Ex3 {
    public static void main(String[] args) {
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();
        System.out.println("Lado sorteado no dado1: " + dado1.rolar());
        System.out.println("Lado sorteado no dado2: " + dado2.rolar());
    }
}

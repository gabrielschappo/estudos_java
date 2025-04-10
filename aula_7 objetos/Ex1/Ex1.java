/* Modele uma classe que represente uma lampada. A classe deve ter um
atributo indicando se a lampada esta ligada ou desligada e metodos para
poder ligar ou desligar. Crie o diagrama de classe da UML e o codigo java
correspondente. Crie alguns objetos da classe e execute a acao de
ligar/desligar. */

package Ex1;
public class Ex1{
    public static void main(String[] args) {
        Lampada lampada1 = new Lampada();
        lampada1.ligada = lampada1.ligar();
        System.out.println(lampada1.ligada);
        lampada1.ligada = lampada1.desligar();
        System.out.println(lampada1.ligada);
    }
}

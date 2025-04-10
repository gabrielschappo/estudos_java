/* Modele uma classe que represente um ciırculo. A classe deve ter um
atributo indicando o seu raio e um metodo para calcular a sua area. Crie o
diagrama de classe da UML e o codigo java correspondente. Crie alguns
objetos da classe e calcule a sua area.
 */

package Ex2;
public class Ex2 {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo();
        circulo1.raio = 5;
        System.out.print(circulo1.area());
        Circulo circulo2 = new Circulo();
        circulo2.raio = 3;
        System.out.println(circulo2.area());
    }
}

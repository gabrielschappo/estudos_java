package Ex2;

/* Modele uma classe que represente um retângulo. A classe deve permitir o
cálculo da sua área e perímetro. O retângulo não pode ter uma dimensão
negativa.
 */

public class Ex2 {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.setAltura(-1);
        retangulo.setBase(-10);
        retangulo.setAltura(10);
        retangulo.setBase(20);
        System.out.println(retangulo.area());
        System.out.println(retangulo.perimetro());
    }
}

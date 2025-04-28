package Ex1;

/* Modele uma classe que represente uma pessoa. A pessoa deve ter nome,
sobrenome e idade. A pessoa não pode ter uma idade negativa.
 */

public class Ex1{
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setIdade(-5);
        System.out.println(p1.idade);
        p1.setIdade(10);
        System.out.println(p1.idade);
    }
}
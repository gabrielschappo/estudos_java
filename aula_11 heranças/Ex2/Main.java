package Ex2;

/* Crie um programa para calcular o salário dos funcionários de uma
empresa. O salário é baseado no valor hora e quantidade de horas
trabalhadas no mês. Porém, para algumas funções existe uma bonificação.
Para os líderes, o salário é incrementado em 2% e para os gerentes em 5%.
Desenvolva o diagrama de classe da UML.
*/

public class Main {
    public static void main(String[] args) {
        Lider lider1 = new Lider();
        lider1.horasTrabalhadas = 240;
        lider1.valorHora = 50;

        Gerente gerente1 = new Gerente();
        gerente1.horasTrabalhadas = 240;
        gerente1.valorHora = 50;

        Funcionario funcionario1 = new Funcionario();
        funcionario1.horasTrabalhadas = 240;
        funcionario1.valorHora = 50;

        System.out.println("Salario lider: "+lider1.calcularSalario());
        System.out.println("Salario gerente: "+gerente1.calcularSalario());
        System.out.println("Salario funcionario comum: "+funcionario1.calcularSalario());
    }
}

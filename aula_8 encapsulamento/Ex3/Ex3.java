package Ex3;

/* Modele uma classe que represente uma conta bancária. A conta bancária
deve possuir o número, agência, nome do titular, saldo atual e limite . A
classe deve permitir consultar o saldo, realizar saques e depósito. A conta
não pode ficar com um saldo negativo inferior que o limite. Por exemplo, a
conta possui limite de R$100, a conta pode ter um saldo negativo máximo
de R$100. O limite da conta deve ser informado na sua criação e não
poderá ser modificada.
 */

public class Ex3 {
    public static void main(String[] args) {
        Conta c1 = new Conta(1, null, null, 0, 100);
        c1.setNomeTitular("Ricardo da Rocha");
        c1.setAgencia("01-1");
        System.out.println(c1.consultarSaldo());
        c1.realizarDeposito(200);
        System.out.println(c1.consultarSaldo());
        c1.realizarSaque(400);
        c1.realizarSaque(250);
        System.out.println(c1.consultarSaldo());
    }
}

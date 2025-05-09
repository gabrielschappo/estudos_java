package Ex1;

public class Main {
    public static void main(String[] args) {
        Telefone telefone1 = new Telefone("55", "47", "99999-1234");
        Telefone telefone2 = new Telefone("55", "47", "99999-1234");
        Telefone telefone3 = new Telefone("55", "11", "88888-5678");

        System.out.println("telefone1 é igual a telefone2? " + telefone1.equals(telefone2)); // true
        System.out.println("telefone1 é igual a telefone3? " + telefone1.equals(telefone3)); // false

        Contato contato1 = new Contato();
        contato1.setNome("Maria Silva");
        contato1.setEmail("maria@email.com");
        contato1.setTelefone(telefone1);

        Contato contato2 = new Contato();
        contato2.setNome("Maria Silva");
        contato2.setEmail("maria@email.com");
        contato2.setTelefone(telefone2);

        Contato contato3 = new Contato();
        contato3.setNome("João Souza");
        contato3.setEmail("joao@email.com");
        contato3.setTelefone(telefone3);

        System.out.println("contato1 é igual a contato2? " + contato1.equals(contato2)); // true
        System.out.println("contato1 é igual a contato3? " + contato1.equals(contato3)); // false

        System.out.println("Número completo do telefone1: " + telefone1.numeroCompleto());
        System.out.println("Número completo do telefone3: " + telefone3.numeroCompleto());
    }
}


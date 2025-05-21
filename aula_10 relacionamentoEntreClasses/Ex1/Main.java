package Ex1;

/* Um sistema precisa enviar mensagens por e-mail para os usuários. Cada
mensagem contém um destinatário, um assunto e um texto. Crie um
pequeno programa orientado a objetos que:
Represente uma mensagem de e-mail.
Tenha uma classe responsável por enviar essa mensagem.
Simule o envio com System.out.println.
Use relacionamento por dependência entre as classes
Separe bem as responsabilidades de cada classe e o envio deve ser feito a
partir do método main. Crie o diagrama de classes da UML.
 */

public class Main {
    public static void main(String[] args) {
        Email email = new Email("usuario@gmail.com", "Boas vindas!", "Olá, seja bem-vindo ao sistema!");
        EmailSender sender = new EmailSender();
        sender.enviar(email);
    }
}

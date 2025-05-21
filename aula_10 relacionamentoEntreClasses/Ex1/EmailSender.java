package Ex1;

public class EmailSender {
    public void enviar(Email email){
        System.out.println("Enviando e-mail para " + email.getDestinatario());
        System.out.println("Assunto: " + email.getAssunto());
        System.out.println("Corpo: " + email.getCorpo());
        System.out.println("E-mail enviado com sucesso!\n");
    }
}

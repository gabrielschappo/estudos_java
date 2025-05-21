package Ex1;

public class Email{
    private String destinatario;
    private String assunto;
    private String corpo;

    public Email(String destinatario, String assunto, String corpo){
        this.destinatario = destinatario;
        this.assunto = assunto;
        this.corpo = corpo;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getAssunto() {
        return assunto;
    }

    public String getCorpo() {
        return corpo;
    }
}
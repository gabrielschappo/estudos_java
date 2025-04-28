package Ex1;

public class Pessoa{
    String nome;
    String sobrenome;
    int idade;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        if (idade > 0){
            this.idade = idade;
        }else{
            System.out.println("Idade deve ser positiva.");
        }    
    }
}

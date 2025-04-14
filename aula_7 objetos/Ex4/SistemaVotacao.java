/* Como um coordenador de eleiçõoes escolares, Quero um sistema onde os alunos possam
votar em seus candidatos preferidos, Para que eu possa apurar os votos automaticamente,
identificar votos nulos e saber quem foi eleito.
Critérios de aceitação:
• Os candidatos são definidos no início da votação.
• Cada voto é registrado indicando o número do candidato.
• O sistema contabiliza os votos corretamente.
• Votos inválidos (número incorreto) são tratados como nulos.
• Ao final, o sistema mostra o número de votos de cada candidato, os votos nulos e
quem venceu.
Requisito adicional: Criar o diagrama de classes UML representando a estrutura da
classe SistemaDeVotacao, incluindo atributos e m´etodos. */

package Ex4;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaVotacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe quantos candidatos serão cadastrados: ");
        int quantCandidatos = scanner.nextInt();
        ArrayList<Candidato> candidatos = new ArrayList<>();
        int votosNulos = 0;
        scanner.nextLine();

        for (int x = 0; x < quantCandidatos; x++){
            System.out.print("Digite o nome do candidato " + (x+1) + ": ");
            String nome = scanner.nextLine();
            System.out.print("Digite o número do candidato " + (x+1) + ": ");
            int numero = scanner.nextInt();
            scanner.nextLine();
            candidatos.add(new Candidato(numero, nome));
        }

        System.out.print("Informe quantos votos serão realizados: ");
        int quantVotantes = scanner.nextInt();

        for (int y = 0; y < quantVotantes; y++){
            System.out.print("Digite o número do canditado que receberá o voto "+ (y+1) + ": ");
            int voto = scanner.nextInt();
            
            boolean existe = false;
            for (Candidato c: candidatos){
                if(c.numero == voto){
                    c.votos++;
                    existe = true;
                    break;
                }
            }
            if (existe == false){
                votosNulos++;
            }
        }
        int maisVotado = 0;
        boolean empate = false;
        Candidato vencedor = null;    
        for (Candidato c : candidatos){
            System.out.println(c.nome + " (" + c.numero + "): " + c.votos + " voto(s)");

            if(c.votos > maisVotado){
                maisVotado = c.votos;
                vencedor = c;
                empate = false;
            }else if(c.votos == maisVotado && vencedor != null && c != vencedor){
                empate = true;
            }
        }
        System.out.println("Votos nulos: " + votosNulos);
        if (empate == true){
            System.out.println("Empate na eleição!");
        }else {
            System.out.println("Vencedor: " + vencedor.nome + " com " + vencedor.votos + " voto(s).");
        }
    }
}

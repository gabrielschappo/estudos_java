/* Crie um método estático que receba uma matriz 3x3 que representa o
tabuleiro do jogo da velha. Determine se o jogador X ou o jogador O
venceu, se houve empate ou nenhum dos anteriores. */

public class Ex5 {
    public static String verificarResultado(char[][] matriz){
        for (int x = 0; x < 3; x++){
            if (matriz[x][0] == matriz[x][1] && matriz[x][1] == matriz[x][2] && matriz[x][0] != ' '){
                return "Vencedor: " + matriz[x][0];
            }
            if (matriz[0][x] == matriz[1][x] && matriz[1][x] == matriz[2][x] && matriz[0][x] != ' '){
                return "Vencedor: " + matriz[0][x];
            }
        }
        if (matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2] && matriz[0][0] != ' '){
            return "Vencedor: " + matriz[0][0];
        }
        if (matriz[0][2] == matriz[1][1] && matriz[1][1] == matriz[2][0] && matriz[1][1] != ' '){
            return "Vencedor: " + matriz[1][1];
        }
        for (int x = 0; x < 3; x++){
            for (int y = 0; y < 3; y++){
                if (matriz[x][y] == ' '){
                    return "Jogo em andamento";
                }
            }
        }
        return "Empate";
    }
    public static void main(String[] args) {
        char[][] matriz = {
            {'x',' ','o'},
            {' ','x','o'},
            {' ',' ','x'}
        };

        System.out.println(verificarResultado(matriz));
    }
}

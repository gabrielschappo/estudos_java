/*  método main que inicia a execução de um programa java possui um
parâmetro do tipo vetor de String. Crie um programa que apresente em
tela o tamanho do vetor e o seu conteúdo.
Na linha de comando, execute o seu programa da seguinte maneira:
java Main
java Main ola
java Main ola mundo */

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Tamanho do vetor de argumentos: " + args.length);
        System.out.println("Conteúdo do vetor:");
        for (int x = 0; x < args.length; x++){
            System.out.println("args[" + x + "]: " + args[x]);
        }
    }
}

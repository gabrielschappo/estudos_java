/* Crie um metodo estatico para verificar se tres valores inteiros formam um
triangulo. O metodo deve retornar o tipo de triangulo conforme a tabela
abaixo. Crie os testes unitarios para garantir a corretude do metodo.
Tipo de Triangulo Retorno
Equilatero 0
Isosceles 1
Escaleno 2
Invalido -1
 */

public class Ex1 {
    public static int triangulo(int a, int b, int c){
        if ((a == b && a != c) || (b == c && a != b) || (a == c && a != b)){
            return 1;
        } else if (a == b && b == c){
            return 0;
        } else {
            if (a+b < c || a+c < b || b+c < a){
                return -1;
            }else{
                return 2;
            }
        }
    }
}
/* Crie um metodo estatico que retorna a categoria do Indice de Massa
Corporea(IMC). O metodo deve receber o peso e altura. O metodo deve
retornar a categoria do IMC, conforme a tabela abaixo. Crie os testes
unitarios para garantir a corretude do metodo.
Valor do IMC | Categoria
< 18.5 | Abaixo do Peso
18.5 - 24.9 | Peso normal
25 - 29.9 | Sobrepeso
>= 30 | Obesidade
*/

public class Ex3 {
    public static String verificarCategoria(double peso, double altura){
        double imc = peso / (altura * altura);
        System.out.println(imc);
        if (imc < 18.5){
            return "Abaixo do peso";
        }else if (imc >= 18.5 && imc <= 24.9){
            return "Peso normal";
        }else if (imc > 24.9 && imc < 30){
            return "Sobrepeso";
        }else {
            return "Obesidade";
        }
    }
}

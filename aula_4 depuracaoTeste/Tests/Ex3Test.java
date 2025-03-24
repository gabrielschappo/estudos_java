import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ex3Test {

    @Test
    public void abaixoDoPeso(){
        String esperado = "Abaixo do peso";
        String resultado = Ex3.verificarCategoria(50,1.75);
        Assertions.assertEquals(esperado,resultado,"A categoria deveria ser Abaixo do peso");
    }

    @Test
    public void pesoNormal(){
        String esperado = "Peso normal";
        String resultado = Ex3.verificarCategoria(65, 1.75);
        Assertions.assertEquals(esperado,resultado,"A categoria deveria ser Peso normal");
    }

    @Test
    public void sobrepeso(){
        String esperado = "Sobrepeso";
        String resultado = Ex3.verificarCategoria(80, 1.75);
        Assertions.assertEquals(esperado,resultado,"A categoria deveria ser Sobrepeso");
    }

    @Test
    public void obesidade(){
        String esperado = "Obesidade";
        String resultado = Ex3.verificarCategoria(100,1.75);
        Assertions.assertEquals(esperado,resultado,"A categoria deveria ser Obesidade");
    }
}

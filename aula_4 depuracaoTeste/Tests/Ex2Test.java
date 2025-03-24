import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ex2Test {

    @Test
    public void desconto5(){
        double esperado = 95;
        double resultado = Ex2.calcularDesconto(100,1);
        Assertions.assertEquals(esperado, resultado, "O valor total após desconto deve ser de 95");
        esperado = 380;
        resultado = Ex2.calcularDesconto(100, 4);
        Assertions.assertEquals(esperado,resultado,"O valor total após desconto deve ser de 380");
    }

    @Test
    public void desconto10(){
        double esperado = 90;
        double resultado = Ex2.calcularDesconto(100,1);
        Assertions.assertEquals(esperado,resultado,"O valor após desconto deve ser de 90");
        esperado = 360;
        resultado = Ex2.calcularDesconto(100,4);
        Assertions.assertEquals(esperado,resultado,"O valor após desconto deve ser de 360");
    }

    @Test
    public void desconto15(){
        double esperado = 85;
        double resultado = Ex2.calcularDesconto(100,1);
        Assertions.assertEquals(esperado,resultado,"O valor após desconto deve ser de 85");
        esperado = 340;
        resultado = Ex2.calcularDesconto(100,4);
        Assertions.assertEquals(esperado,resultado,"O valor após desconto deve ser de 340");
    }
}

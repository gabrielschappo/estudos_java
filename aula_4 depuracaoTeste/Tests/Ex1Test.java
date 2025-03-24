import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ex1Test {

    @Test
    public void naoTriangulo(){
        int esperado = -1;
        int resultado = Ex1.triangulo(1,2,5);
        Assertions.assertEquals(esperado,resultado, "a,b e c não formam um triângulo");
    }

    @Test
    public void trianguloEquilatero(){
        int esperado = 0;
        int resultado = Ex1.triangulo(5,5,5);
        Assertions.assertEquals(esperado,resultado,"a,b e c formam um triangulo equilatero");
    }

    @Test
    public void trianguloIsosceles(){
        int esperado = 1;
        int resultado = Ex1.triangulo(6,6,4);
        Assertions.assertEquals(esperado,resultado, "a,b e c formam um triângulo isosceles");
    }

    @Test
    public void trianguloEscaleno(){
        int esperado = 2;
        int resultado = Ex1.triangulo(7,5,4);
        Assertions.assertEquals(esperado,resultado,"a,b e c formam um triângulo escaleno");
    }
}



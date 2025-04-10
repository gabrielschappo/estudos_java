package Ex3;
import java.util.Random;

public class Dado {
    Random lado = new Random();
    public int rolar(){
        return lado.nextInt(6) + 1;
    }
}

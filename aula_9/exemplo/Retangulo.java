import java.util.Objects;

public class Retangulo {
    double largura;
    double altura;

    @Override
    public String toString(){
        return " Retangulo{altura ="+altura+", largura ="+largura+"}";
    }

    @Override
    public int hashCode(){
        return Objects.hash(altura,largura);
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        return o instanceof Retangulo && hashCode() == o.hashCode();
    }
}

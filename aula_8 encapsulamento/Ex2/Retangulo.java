package Ex2;

public class Retangulo {
    double base;
    double altura;

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        if (base >= 0){
            this.base = base;
        }else{
            System.out.println("A base deve ser positiva.");
        }
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        if (altura >= 0){
            this.altura = altura;
        }else{
            System.out.println("A altura deve ser positiva.");
        }
    }

    public double area(){
        return base * altura;
    }

    public double perimetro(){
        return (base*2) + (altura*2);
    }
}

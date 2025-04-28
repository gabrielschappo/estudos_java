public class Main{
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo();
        Retangulo r2 = new Retangulo();
        System.out.println(r1);
        System.out.println(r1.hashCode());
        System.out.println(r2.hashCode());
        System.out.println(r1.equals(r2));
    }
}
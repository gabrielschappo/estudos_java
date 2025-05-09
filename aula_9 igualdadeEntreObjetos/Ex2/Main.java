package Ex2;

public class Main {
    public static void main(String[] args) {
        Pais brasil = new Pais("BR", "Brasil");
        Pais eua = new Pais("US", "Estados Unidos");

        Estado df = new Estado("DF", "Distrito Federal", brasil);
        Estado sc = new Estado("SC", "Santa Catarina", brasil);
        Estado fl = new Estado("FL", "Flórida", eua);

        Cidade brasilia = new Cidade("Brasília", df, true, true);
        Cidade joinville = new Cidade("Joinville", sc, false, false);
        Cidade florianopolis = new Cidade("Florianópolis", sc, true, false);
        Cidade jaragua = new Cidade("Jaraguá do Sul", sc, false, false);
        Cidade miami = new Cidade("Miami", fl, false, false);
        Cidade orlando = new Cidade("Orlando", fl, false, false);

        System.out.println(brasil.getCapital());
    }
}

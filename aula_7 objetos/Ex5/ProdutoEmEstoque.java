package Ex5;

public class ProdutoEmEstoque {
    public static void main(String[] args) {
        Produto arroz = new Produto("arroz", 20, 5);
        arroz.exibirStatus();
        arroz.vender(10);
        arroz.exibirStatus();
        arroz.vender(12);
        arroz.repor(5);
        arroz.exibirStatus();
        arroz.vender(12);
        arroz.exibirStatus();
    }
}

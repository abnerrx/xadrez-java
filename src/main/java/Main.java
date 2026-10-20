public class Main {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.imprimir();

        System.out.println(tabuleiro.mover(7, 0, 5, 0));
        System.out.println(tabuleiro.mover(7, 1, 5, 2));
        System.out.println();
        tabuleiro.imprimir();
    }
}

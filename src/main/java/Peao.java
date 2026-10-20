public class Peao extends Peca {
    Peao(boolean branca) {
        super(branca);
    }

    String simbolo() {
        return branca ? "P" : "p";
    }

    boolean movimentoValido(int linhaOrigem, int colOrigem,
                            int linhaDestino, int colDestino) {
        int direcao = branca ? -1 : 1;
        int linhaInicial = branca ? 6 : 1;

        if (colOrigem != colDestino) {
            return false;
        }
        if (linhaDestino == linhaOrigem + direcao) {
            return true;
        }
        if (linhaOrigem == linhaInicial && linhaDestino == linhaOrigem + direcao * 2) {
            return true;
        }
        return false;
    }
}
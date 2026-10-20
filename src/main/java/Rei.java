public class Rei extends Peca {
    Rei(boolean branca) {
        super(branca);
    }

    String simbolo() {
        return branca ? "R" : "r";
    }

    boolean movimentoValido(int linhaOrigem, int colOrigem,
                            int linhaDestino, int colDestino) {

        int deltaLinha = Math.abs(linhaDestino - linhaOrigem);
        int deltaColuna = Math.abs(colDestino - colOrigem);

        if (deltaLinha == 0 && deltaColuna == 0) {
            return false;
        }
        return deltaLinha <= 1 && deltaColuna <= 1;
    }
}

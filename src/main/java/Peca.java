abstract class Peca {
    boolean branca;

    Peca(boolean branca) {
        this.branca = branca;
    }

    abstract String simbolo();

    abstract boolean movimentoValido(int linhaOrigem, int colOrigem,
                                     int linhaDestino, int colDestino);
}

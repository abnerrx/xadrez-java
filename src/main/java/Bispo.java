class Bispo extends Peca {
    Bispo(boolean branca) {
        super(branca);
    }

    String simbolo() {
        return branca ? "B" : "b";
    }

    boolean movimentoValido(int linhaOrigem, int colOrigem,
                            int linhaDestino, int colDestino) {

        int deltaLinha = Math.abs(linhaDestino - linhaOrigem);
        int deltaColuna = Math.abs(colDestino - colOrigem);
        if (deltaLinha == deltaColuna && (linhaDestino != linhaOrigem || colDestino != colOrigem)){
            return true;
        }

        return false;

    }
}
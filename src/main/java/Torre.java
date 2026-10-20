class Torre extends Peca {
    Torre(boolean branca) {
        super(branca);
    }

    String simbolo() {
        return branca ? "T" : "t";
    }

    boolean movimentoValido(int linhaOrigem, int colOrigem,
                            int linhaDestino, int colDestino) {
        if((linhaOrigem == linhaDestino) && (colOrigem == colDestino)) {
            return false;
        } else return((linhaOrigem == linhaDestino) || (colOrigem == colDestino)) ;
    }
}

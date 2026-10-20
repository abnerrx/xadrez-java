public class Dama extends Peca{
    Dama(boolean branca) {
        super(branca);
    }

    String simbolo() {
        return branca ? "D" : "d";
    }

    boolean movimentoValido(int linhaOrigem, int colOrigem,
                            int linhaDestino, int colDestino) {

        int deltaLinha = Math.abs(linhaDestino - linhaOrigem);
        int deltaColuna = Math.abs(colDestino - colOrigem);

        if ((linhaOrigem == linhaDestino) && (colOrigem == colDestino)) {
            return false;
        }
        return (linhaOrigem == linhaDestino) || (colOrigem == colDestino) || (deltaLinha == deltaColuna);
    }
}

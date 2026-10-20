public class Cavalo extends Peca {
    Cavalo(boolean branca) {
        super(branca);
    }

    String simbolo() {
        return branca ? "C" : "c";
    }

    boolean movimentoValido(int linhaOrigem, int colOrigem,
                            int linhaDestino, int colDestino) {

        int deltaLinha = Math.abs(linhaDestino - linhaOrigem);
        int deltaColuna = Math.abs(colDestino - colOrigem);
        int distancia = deltaLinha + deltaColuna;
        return (deltaLinha == 2 && deltaColuna == 1) || (deltaLinha == 1 && deltaColuna == 2);
    }

}
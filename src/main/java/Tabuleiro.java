public class Tabuleiro {
    Peca[][] casas = new Peca[8][8];

    Tabuleiro() {
        for (int j = 0; j < 8; j++) {
            casas[1][j] = new Peao(false);
            casas[6][j] = new Peao(true);
        }
        colocarFundo(0, false);
        colocarFundo(7, true);
    }
    boolean caminhoLivre(int lo, int co, int ld, int cd) {
        int passoLinha = Integer.compare(ld, lo);
        int passoCol = Integer.compare(cd, co);

        int l = lo + passoLinha;
        int c = co + passoCol;

        while (l != ld || c != cd) {
            if (casas[l][c] != null) {
                return false;
            }
            l += passoLinha;
            c += passoCol;
        }
        return true;
    }
    private void colocarFundo(int linha, boolean branca) {
        casas[linha][0] = new Torre(branca);
        casas[linha][1] = new Cavalo(branca);
        casas[linha][2] = new Bispo(branca);
        casas[linha][3] = new Dama(branca);
        casas[linha][4] = new Rei(branca);
        casas[linha][5] = new Bispo(branca);
        casas[linha][6] = new Cavalo(branca);
        casas[linha][7] = new Torre(branca);
    }

    boolean mover(int lo, int co, int ld, int cd) {
        Peca p = casas[lo][co];
        if (p == null) return false;
        if (!p.movimentoValido(lo, co, ld, cd)) return false;

        if (!(p instanceof Cavalo) && !caminhoLivre(lo, co, ld, cd)) return false;

        Peca destino = casas[ld][cd];
        if (destino != null && destino.branca == p.branca) return false;

        casas[ld][cd] = p;
        casas[lo][co] = null;
        return true;
    }
    void imprimir() {
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++){
                if(casas[i][j] == null) {
                    System.out.print("0");
                    System.out.print(" ");
                } else {
                    System.out.print((casas[i][j]).simbolo());
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
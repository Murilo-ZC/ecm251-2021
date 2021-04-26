package carvalho.murilo.pedra_papel_tesoura_2.model;

import carvalho.murilo.pedra_papel_tesoura_2.enumeracao.Resultado;

public abstract class Jogada {
    final public Resultado verificarResultado(Jogada jogada) {
        if(verificarSeGanhei(jogada)){
            return Resultado.GANHOU;
        }
        if (verificarSePerdi(jogada)){
            return Resultado.PERDEU;
        }
        return Resultado.EMPATOU;
    }

    final private boolean verificarSePerdi(Jogada jogada) {
        for (Jogada jogadaGanha : jogadasQuePerco()) {
            if (jogadaGanha.getClass() == jogada.getClass()) {
                return true;
            }
        }
        return false;
    }

    final private boolean verificarSeGanhei(Jogada jogada) {
        for (Jogada jogadaGanha : jogadasQueVenco()) {
            if (jogadaGanha.getClass() == jogada.getClass()) {
                return true;
            }
        }
        return false;
    }

    public abstract Jogada[] jogadasQueVenco();
    public abstract Jogada[] jogadasQuePerco();
}

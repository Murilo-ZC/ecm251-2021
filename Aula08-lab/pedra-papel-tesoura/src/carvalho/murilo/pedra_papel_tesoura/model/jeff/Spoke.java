package carvalho.murilo.pedra_papel_tesoura.model.jeff;

import carvalho.murilo.pedra_papel_tesoura.enumeracao.Resultado;
import carvalho.murilo.pedra_papel_tesoura.model.Jogada;
import carvalho.murilo.pedra_papel_tesoura.model.classico.Papel;
import carvalho.murilo.pedra_papel_tesoura.model.classico.Pedra;
import carvalho.murilo.pedra_papel_tesoura.model.classico.Tesoura;


public class Spoke extends Jogada {
    @Override
    public boolean verificarSeGanhei(Jogada jogada) {
        return (jogada instanceof Pedra) || (jogada instanceof Tesoura);
    }

    @Override
    public boolean verificarSePerdi(Jogada jogada) {
        return (jogada instanceof Papel) || (jogada instanceof Lagarto);
    }

    @Override
    public String toString() {
        return "Spoke";
    }
}

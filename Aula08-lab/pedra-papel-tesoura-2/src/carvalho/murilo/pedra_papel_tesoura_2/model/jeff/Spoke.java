package carvalho.murilo.pedra_papel_tesoura_2.model.jeff;

import carvalho.murilo.pedra_papel_tesoura_2.model.Jogada;
import carvalho.murilo.pedra_papel_tesoura_2.model.classico.Papel;
import carvalho.murilo.pedra_papel_tesoura_2.model.classico.Pedra;
import carvalho.murilo.pedra_papel_tesoura_2.model.classico.Tesoura;


public class Spoke extends Jogada {
    @Override
    public Jogada[] jogadasQueVenco() {
        return new Jogada[]{new Pedra(), new Tesoura()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[]{new Papel(), new Lagarto()};
    }
    @Override
    public String toString() {
        return "Spoke";
    }
}

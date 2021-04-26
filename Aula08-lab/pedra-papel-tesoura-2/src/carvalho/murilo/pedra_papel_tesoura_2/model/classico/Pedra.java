package carvalho.murilo.pedra_papel_tesoura_2.model.classico;

import carvalho.murilo.pedra_papel_tesoura_2.model.Jogada;
import carvalho.murilo.pedra_papel_tesoura_2.model.jeff.Lagarto;
import carvalho.murilo.pedra_papel_tesoura_2.model.jeff.Spoke;

public class Pedra extends Jogada {

    @Override
    public Jogada[] jogadasQueVenco() {
        return new Jogada[]{new Tesoura(), new Lagarto()};
    }

    @Override
    public Jogada[] jogadasQuePerco() {
        return new Jogada[]{new Papel(), new Spoke()};
    }

    @Override
    public String toString() {
        return "Pedra";
    }
}

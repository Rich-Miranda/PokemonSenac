package Pokemon;

import Configuracao.CartaPokemon;
import Configuracao.PersonangensPokemon;
import Configuracao.TypeEnum;

public class Squirtle extends CartaPokemon {
    int HP;
    int atk;
    TypeEnum tipo;
    public Squirtle() {
        super(90, 10, TypeEnum.Agua);
    }

    public void SpikeWater(){}
    public void WaterJet(){}
}

package Pokemon;

import Configuracao.CartaPokemon;
import Configuracao.PersonangensPokemon;
import Configuracao.TypeEnum;

public class Bulbassauro extends CartaPokemon {
    int HP;
    int atk;
    TypeEnum tipo;
    public Bulbassauro() {
        super(120, 40, TypeEnum.Agua);
    }

    public int sementeSanguessuga(){
        return this.getHP();
    }

    public int doceIncenso(){
        return this.getHP();
    }

    public int chicoteVinha(){
        return this.getHP();
    }
}

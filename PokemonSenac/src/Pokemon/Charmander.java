package Pokemon;

import Configuracao.CartaPokemon;
import Configuracao.Cartas;
import Configuracao.PersonangensPokemon;
import Configuracao.TypeEnum;

public class Charmander  extends CartaPokemon {
    int HP;
    int atk;
    TypeEnum tipo;

    public Charmander() {
        super(80, 20, TypeEnum.Fogo);
    }


    public void SoltarFogo(){}
}

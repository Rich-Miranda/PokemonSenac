package Pokemon.Personagens;

import Pokemon.Carta;
import Pokemon.Persona;
import Pokemon.Tipo;

public class Bulbassauro extends Persona implements Carta {
    int HP;
    int atk;
    Tipo tipo;
    public Bulbassauro() {
        super(120, 40, Tipo.Agua);
    }

    @Override
    public int HP(int hp) {
        return 0;
    }

    @Override
    public int ATK(int atk) {
        return 0;
    }

    @Override
    public Tipo tipo() {
        return null;
    }

    public void ChoqueTrovao(){
        System.out.println("Eletrizado");
    }
}

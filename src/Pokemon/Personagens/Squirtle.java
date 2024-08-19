package Pokemon.Personagens;

import Pokemon.Persona;
import Pokemon.Tipo;

public class Squirtle extends Persona {
    int HP;
    int atk;
    Tipo tipo;
    public Squirtle() {
        super(90, 10, Tipo.Agua);
    }

    public void SpikeWater(){}
    public void WaterJet(){}
}

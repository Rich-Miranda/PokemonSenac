package Pokemon.Personagens;

import Pokemon.Carta;
import Pokemon.Persona;
import Pokemon.Tipo;

import javax.swing.*;

public class Pikachu extends Persona implements Carta {
    int defesa;
    int ataque;
    Tipo tipo;

    public Pikachu() {
        super(100, 30, Tipo.Eletrico);
    }

    @Override
    public int HP(int hp) {
        return hp = (hp + ataque)/2 ;
    }

    @Override
    public int ATK(int atk) {
        return atk = atk + defesa;
    }

    @Override
    public Tipo tipo() {
        return Tipo.Eletrico;
    }
}

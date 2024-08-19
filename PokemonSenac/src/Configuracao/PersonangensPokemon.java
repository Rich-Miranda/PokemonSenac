package Configuracao;

public class PersonangensPokemon {
    private int HP;
    private int Atk;
    private TypeEnum tipoCartas;
    private int energia;



    public PersonangensPokemon(int HP, int atk, TypeEnum tipo) {
        this.HP = HP;
        this.Atk = atk;
        this.tipoCartas = tipo;
    }

    public int getHP() {
        return HP;
    }

    public int getAtk() {
        return Atk;
    }

    public TypeEnum getTipoCartas() {
        return tipoCartas;
    }

    public int Energia(){
        return 2;
    }
}

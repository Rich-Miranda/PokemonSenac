package Pokemon;

public class Persona {
    private int HP;
    private int Atk;
    private Tipo tipo;
    private String nome;



    public Persona(int HP, int atk, Tipo tipo) {
        this.HP = HP;
        this.Atk = atk;
        this.tipo = tipo;
    }
    public String getNome() {
        return nome;
    }
    public int getHP() {
        return HP;
    }

    public int getAtk() {
        return Atk;
    }

    public Tipo getTipo() {
        return tipo;
    }
}

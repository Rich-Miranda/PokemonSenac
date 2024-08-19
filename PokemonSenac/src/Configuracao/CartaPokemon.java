package Configuracao;

public class CartaPokemon extends PersonangensPokemon implements Cartas{

        private int hp;
        private int atk;
        private TypeEnum tipo;


        public CartaPokemon(int HP, int atk, TypeEnum tipo) {
            super(HP, atk, tipo);
            this.hp = hp;
            this.atk = atk;
            this.tipo = tipo;
        }


        @Override
        public void defesa(int dano) {
            this.hp = dano - this.hp ;
        }

        @Override
        public int ataque() {
            return this.atk;
        }

        @Override
        public int vida() {
            return this.hp;
        }

        @Override
        public TypeEnum tipo() {
            return super.getTipoCartas();
        }

        @Override
        public int energia(){
            return super.Energia();
        }


}

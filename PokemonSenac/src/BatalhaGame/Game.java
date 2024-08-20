package BatalhaGame;

import Configuracao.CartaPokemon;
import Configuracao.Cartas;
import Configuracao.TypeEnum;
import Pokemon.Bulbassauro;
import Pokemon.Charmander;
import Pokemon.Pikachu;
import Pokemon.Squirtle;

import java.awt.*;
import java.util.Scanner;

public class Game {
    private CartaPokemon j1;
    private CartaPokemon j2;
    Scanner sc = new Scanner(System.in);
    private int player1, player2;
    Cartas charmander = new Charmander();
    Cartas bulbassauro = new Bulbassauro();

    public void Menu(){

      do {

          System.out.println("===========================================================");

          System.out.println("Jogar 1: " );
          System.out.println("Selecione o seu pokemon para batalhar");
          System.out.println("1- Bulbassauro \n2- Charmander \n3- Pikachu \n4- Squirtle");
          System.out.println("J1: ");
          player1 = sc.nextInt();
          System.out.println("===========================================================");
          System.out.println("Jogar 2: " );
          System.out.println("Selecione o seu pokemon para batalhar");
          System.out.println("1- Bulbassauro \n2- Charmander \n3- Pikachu \n4- Squirtle");
          System.out.println("J2: ");
          player2 = sc.nextInt();
          System.out.println("===========================================================");
          if(player1 == player2) {
              //Limpa a loop caso tenha dois pokemons do mesmo tipo
              player1 = 0;
              player2 = 0;
              System.out.println("Personagens repetidos não podem!");
              System.out.println();
          }else{ // caso acontrario vai aparecer o pokemons selecionado pelos jogadores
              switch (player1) {
                  case 1:
                      System.out.println("Jogador1 selecionou Bulbassauro");
                      j1 = new Bulbassauro();
                      break;
                  case 2:
                      System.out.println("Jogador1 selecionou Charmander");
                      j1 = new Charmander();
                      break;
                  case 3:
                      System.out.println("Jogador1 selecionou Pikachu");
                      j1 = new Pikachu();
                      break;
                  case 4:
                      System.out.println("Jogador1 selecionou Squirtle");
                      j1 = new Squirtle();
                      break;
              }
              switch (player2) {
                  case 1:
                      System.out.println("Jogador2 selecionou Bulbassauro");
                      j2 = new Bulbassauro();
                      break;
                  case 2:
                      System.out.println("Jogador2 selecionou Charmander");
                      j2 = new Bulbassauro();
                      break;
                  case 3:
                      System.out.println("Jogador2 selecionou Pikachu");
                      j2 = new Pikachu();
                      break;
                  case 4:
                      System.out.println("Jogador2 selecionou Squirtle");
                      j2 = new Squirtle();
                      break;
              }
          }

              turnoGame();



    }while (player1 == 0 &&  player2 == 0);
        System.out.println("Finalizou");

    }


    public boolean eficaz(Cartas ataca, Cartas defende){
        if ((ataca.tipo() == TypeEnum.Agua) && (defende.tipo() == TypeEnum.Fogo)) {
            turnoGame();
            return true;
        } else if ((ataca.tipo() == TypeEnum.Fogo) && (defende.tipo() == TypeEnum.Grama)) {
            turnoGame();
            return true;
        } else if ((ataca.tipo() == TypeEnum.Grama) && (defende.tipo() == TypeEnum.Eletrico)) {
           turnoGame();
            return true;
        } else if ((ataca.tipo() == TypeEnum.Eletrico) && (defende.tipo() == TypeEnum.Agua)) {
           turnoGame();
            return true;
        }

        return false;
    }

    public void turnoGame(){
        do {
            System.out.println("Jogador 1, selecione a ação do seu Pokémon:");
            System.out.println("1 - Ataque \n2 - Defesa \n3 - Especial");
            int jg1 = sc.nextInt();

            System.out.println("Jogador 2, selecione a ação do seu Pokémon:");
            System.out.println("1 - Ataque \n2 - Defesa \n3 - Especial");
            int jg2 = sc.nextInt();

            if (jg1 == 1 && jg2 == 1) {
                System.out.println("Dano dulpo, ambos escolheram a mesma opção!");
                j1.defesa(j2.ataque());  // Jogador 1 recebe o ataque do Jogador 2
                j2.defesa(j1.ataque());  // Jogador 2 recebe o ataque do Jogador 1
            } else if (jg1 == 1 && jg2 == 2) {
             
                j1.defesa(0);
                j2.defesa(j1.ataque());

            }else if (jg1 == 2 && jg2 == 1) {

                j1.defesa(0);
                j2.defesa(j1.ataque());
            }else if (jg1 == 3 && jg2 == 2) {

                j1.defesa(0);
                j2.defesa(j1.energia());

            }else if (jg1 == 2 && jg2 == 3) {

                j1.defesa(j2.energia());
                j2.defesa(0);

            }else if (jg1 == 1 && jg2 == 3) {

                j1.defesa(j2.energia());
                j2.defesa(j1.ataque());

            }else if (jg1 == 3 && jg2 == 1) {

                j1.defesa(j2.ataque());
                j2.defesa(j1.energia());

            } else  {

                j1.defesa(j2.ataque());
                j2.defesa(0);
            }


            if (j1.vida() <=0 ) {}else {}
        } while (j1.vida() > 0 || j2.vida() > 0);


        System.out.println("Ambos os jogadores perderam!");
    }
}

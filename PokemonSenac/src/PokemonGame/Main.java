package PokemonGame;


import Pokemon.Batalha.Batalha;
import Pokemon.Personagens.Bulbassauro;
import Pokemon.Personagens.Charmander;
import Pokemon.Personagens.Pikachu;
import Pokemon.Personagens.Squirtle;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Bulbassauro bulbassauro= new Bulbassauro();
    static Charmander charmander = new Charmander();
    static Pikachu pikachu = new Pikachu();
    static Squirtle squirtle = new Squirtle();
    public static void main(String[] args) {

        int j1 = 0, j2 = 0;
        int opc = 0;
        do {
            System.out.println("Selecione um personagem j1");
            System.out.println("1-Bulbassauro");
            System.out.println("2-Charmander");
            System.out.println("3-Pikachu");
            System.out.println("4-Squirtle");

            j1 = sc.nextInt();
            System.out.println("Selecione um personagem j2");
            System.out.println("1-Bulbassauro");
            System.out.println("2-Charmander");
            System.out.println("3-Pikachu");
            System.out.println("4-Squirtle");
            j2 = sc.nextInt();

            if (j1 == j2) {
                System.out.println("Ambos jogadores selecionou o mesmo pokemon, selecione apenas um pokemon diferente do outro player");
            }else{
                    switch (j1) {
                        case 1:
                            System.out.println("Selecinou Bulbassauro");
                            break;
                        case 2:
                            System.out.println("Selecinou Charmander");
                            break;
                        case 3:
                            System.out.println("Selecionou Pikachu");
                            break;
                        case 4:
                            System.out.println("Selecionou Squirtle");
                            break;
                    }
                    switch (j2) {
                        case 1:
                            System.out.println("Selecinou Bulbassauro");

                            break;
                        case 2:
                            System.out.println("Selecinou Charmander");

                            break;
                        case 3:
                            System.out.println("Selecionou Pikachu");

                            break;
                        case 4:
                            System.out.println("Selecionou Squirtle");

                            break;
                    }
                Batalhar(j1, j2);
                }
        } while (j1 != 5 && j2 != 5);
        System.out.println("Encerrando");
    }

    public static void Batalhar(int j1, int j2) {
        if (j1 == 1 && j2 == 2) {
            do {
                System.out.println("Jogador 1: " + " Selecione o que quer usar");
                System.out.println("1- especial");
                System.out.println("2- ataque");
                System.out.println("3- defesa");
                j1 = sc.nextInt();
                System.out.println("Jogador 2: " + "Selecione o que quer usar");
                System.out.println("1- especial");
                System.out.println("2- ataque");
                System.out.println("3- defesa");
                j2 = sc.nextInt();

                if (j1 == j2) {
                    System.out.println("Jogada invalida");
                } else {
                    switch (j1) {
                        case 1:
                            System.out.println("Selecionou especial");
                            bulbassauro.ChoqueTrovao();
                            break;
                        case 2:
                            System.out.println("Seleciou Ataque");
                            break;
                        case 3:
                            System.out.println("Selecionou Defesa");
                            break;
                    }
                    switch (j2){
                        case 1:
                        System.out.println("Selecionou Especial");
                        charmander.SoltarFogo();
                        break;

                        case 2:
                            System.out.println("Selecionou ataque");
                            break;

                        case 3:
                            System.out.println("Selecionou defesa");
                            break;
                    }
                }

                if (j1 == 1 && j2 == 3){
                    bulbassauro.ATK(charmander.getHP()-2);
                    System.out.println("J2 perdeu : " + charmander.getHP() + "HP");
                }else {
                    charmander.ATK(bulbassauro.getAtk() -2);
                    System.out.println("J1 perdeu : " + bulbassauro.getHP() + "HP");
                }
            } while (j1 != 0 && j2 != 0);
        }
    }


}
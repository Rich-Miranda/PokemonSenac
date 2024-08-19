package Pokemon.Batalha;

import Pokemon.Persona;
import Pokemon.Tipo;

import java.util.Scanner;

public class Batalha  {
        static Scanner sc = new Scanner(System.in);




    public static void Batalhar(Persona j1, Persona j2){
        int jg1=0, jg2=0;


        do {
            System.out.println("Jogador 1: "+ j1.getNome()+ " Selecione o que quer usar");
            System.out.println("1- especial");
            System.out.println("2- ataque");
            System.out.println("3- defesa");
            jg1 = sc.nextInt();
            System.out.println("Jogador 2: " + j2.getNome()+ "Selecione o que quer usar");
            System.out.println("1- especial");
            System.out.println("2- ataque");
            System.out.println("3- defesa");
            jg2 = sc.nextInt();

            if(j1 == j2){
                System.out.println("Jogada invalida");
            }else {
                switch (jg1){
                    case 1:
                        especial(jg1);
                        break;
                    case 2:
                        break;

                    case 3:
                        break;

                }
            }
        }while (jg1 == 0 && jg2 == 0);
    }


    public static void especial(int j1){

    }
}

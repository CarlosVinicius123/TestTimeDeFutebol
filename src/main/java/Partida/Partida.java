package Partida;
//pacotes importados
import Jogador.Jogador;
import Posiçoes.Atacante;
import Posiçoes.Goleiro;
import Posiçoes.MeioDeCampo;
import java.util.ArrayList;
import java.util.Random;
public class Partida {

    String A, B, C;  //Criaçao da string dos times
    Random random = new Random();
    int probabilidade = random.nextInt(100);  //Probabilidade de acontecer um gol

    //Instanciando os jogadores de cada time
    Atacante AtacanteA;
    MeioDeCampo MeioDeCampoA;
    Goleiro GoleiroA;

    Atacante AtacanteB;
    MeioDeCampo MeioDeCampoB;
    Goleiro GoleiroB;

    Atacante AtacanteC;
    MeioDeCampo MeioDeCampoC;
    Goleiro GoleiroC;

    //Criando lista para cada time
    ArrayList<Jogador> list = new ArrayList<>();
    ArrayList<Jogador> list2 = new ArrayList<>();
    ArrayList<Jogador> list3 = new ArrayList<>();

    //Metodo para criar um time chamado na main e adicionar esse time na lista
    public void EscolhendoTime(String escolhaDoTime){


        if(escolhaDoTime.equals("A")){
            AtacanteA = new Atacante(70);
            MeioDeCampoA = new MeioDeCampo(50);
            GoleiroA = new Goleiro(40);
            list.add(AtacanteA);
            list.add(MeioDeCampoA);
            list.add(GoleiroA);
        }
        if(escolhaDoTime.equals("B")){
            AtacanteB = new Atacante(40);
            MeioDeCampoB = new MeioDeCampo(50);
            GoleiroB = new Goleiro(70);
            list2.add(AtacanteB);
            list2.add(MeioDeCampoB);
            list2.add(GoleiroB);
        }

        if(escolhaDoTime.equals("C")){
            AtacanteC = new Atacante(50);
            MeioDeCampoC = new MeioDeCampo(60);
            GoleiroC = new Goleiro(50);
            list3.add(AtacanteC);
            list3.add(MeioDeCampoC);
            list3.add(GoleiroC);
        }

    }

    //Metodo chamado na Main para simular uma partida de futebol
    public void simulaPartida(int timeJogando, int localBola, Partida Partida){

        /* O Primeiro switch representa os times, sendo case 1 para o time 1 e o case 2 para o time 2
           O switch dentro dos cases, representam onde a bola esta, sendo:
           Case 1: Goleiro
           Case 2: MeioDeCampo
           Case 3: Ataque
           Case 4: Gol
         */

        switch(timeJogando){
            case 1: //timeA
                switch(localBola){

                    case 1:
                        if(list.size() != 0 && list2.size() == 0){
                            GoleiroA.PassarAbola(probabilidade, Partida, timeJogando);
                        }
                        if(list.size() == 0 && list2.size() != 0){
                            GoleiroB.PassarAbola(probabilidade, Partida, timeJogando);
                        }
                        break;

                    case 2:
                        if(list.size() != 0 && list2.size() == 0){
                            MeioDeCampoA.PassarAbola(probabilidade, Partida, timeJogando);
                        }
                        if(list.size() == 0 && list2.size() != 0){
                            MeioDeCampoB.PassarAbola(probabilidade, Partida, timeJogando);
                        }
                        break;


                    case 3:
                        if(list.size() != 0 && list2.size() == 0){
                            AtacanteA.FazerGol(probabilidade, Partida, timeJogando);
                        }
                        if(list.size() == 0 && list2.size() != 0){
                            AtacanteB.FazerGol(probabilidade, Partida, timeJogando);
                        }
                        break;


                    case 4:
                        System.out.println("Gol do time 1");
                        System.out.println("O time A ganhou");
                        System.exit(0);

                        break;

                }

            case 2: //timeB
                switch(localBola){

                    case 1:
                        if(list2.size() != 0 && list3.size() == 0){
                            GoleiroB.PassarAbola(probabilidade, Partida, timeJogando);
                        }
                        if(list2.size() == 0 && list3.size() != 0){
                            GoleiroC.PassarAbola(probabilidade, Partida, timeJogando);
                        }
                        break;

                    case 2:
                        if(list2.size() != 0 && list3.size() == 0){
                            MeioDeCampoB.PassarAbola(probabilidade, Partida, timeJogando);
                        }
                        if(list2.size() == 0 && list3.size() != 0){
                            MeioDeCampoC.PassarAbola(probabilidade, Partida, timeJogando);
                        }
                        break;


                    case 3:
                        if(list2.size() != 0 && list3.size() == 0){
                            AtacanteB.FazerGol(probabilidade,Partida, timeJogando);
                        }
                        if(list2.size() == 0 && list3.size() != 0){
                            AtacanteC.FazerGol(probabilidade, Partida, timeJogando);
                        }
                        break;


                    case 4:
                        System.out.println("Gol do time 2");
                        System.out.println("O time B ganhou");
                        System.exit(0);

                        break;

                }
        }
    }
}

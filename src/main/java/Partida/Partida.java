package Partida;


import Jogador.Jogador;
import Posiçoes.Atacante;
import Posiçoes.Goleiro;
import Posiçoes.MeioDeCampo;

import java.util.ArrayList;
import java.util.Random;

public class Partida {

    String A, B, C;

    Random random = new Random();
    int probabilidade = random.nextInt(100);

    Atacante AtacanteA;
    MeioDeCampo MeioDeCampoA;
    Goleiro GoleiroA;

    Atacante AtacanteB;
    MeioDeCampo MeioDeCampoB;
    Goleiro GoleiroB;

    Atacante AtacanteC;
    MeioDeCampo MeioDeCampoC;
    Goleiro GoleiroC;

    ArrayList<Jogador> list = new ArrayList<>();
    ArrayList<Jogador> list2 = new ArrayList<>();
    ArrayList<Jogador> list3 = new ArrayList<>();

    ArrayList<Integer> listaParaRetornar = new ArrayList<>();



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

    public void simulaPartida(int numero, int y, Partida Partida){


        switch(numero){
            case 1: //timeA
                switch(y){

                    case 1:
                        if(list.size() != 0 && list2.size() == 0){
                            GoleiroA.PassarAbola(probabilidade, Partida);
                        }
                        if(list == null && list2 != null){
                            GoleiroB.PassarAbola(probabilidade, Partida);
                        }
                        break;

                    case 2:
                        if(list != null && list2 == null){
                            MeioDeCampoA.PassarAbola(probabilidade, Partida);
                        }
                        if(list == null && list2 != null){
                            MeioDeCampoB.PassarAbola(probabilidade, Partida);
                        }
                        break;


                    case 3:
                        if(list != null && list2 == null){
                            AtacanteA.FazerGol(probabilidade, Partida);
                        }
                        if(list == null && list2 != null){
                            AtacanteB.FazerGol(probabilidade, Partida);
                        }
                        break;


                    case 4:
                        System.out.println("Gol do time A");
                        break;
                }

            case 2: //timeB
                switch(y){

                    case 1:
                        if(list2 != null && list3 == null){
                            GoleiroB.PassarAbola(probabilidade, Partida);
                        }
                        if(list2 == null && list3 != null){
                            GoleiroC.PassarAbola(probabilidade, Partida);
                        }
                        break;

                    case 2:
                        if(list2 != null && list3 == null){
                            MeioDeCampoB.PassarAbola(probabilidade, Partida);
                        }
                        if(list2 == null && list3 != null){
                            MeioDeCampoC.PassarAbola(probabilidade, Partida);
                        }
                        break;


                    case 3:
                        if(list2 != null && list3 == null){
                            AtacanteB.FazerGol(probabilidade,Partida);
                        }
                        if(list2 == null && list3 != null){
                            AtacanteC.FazerGol(probabilidade, Partida);
                        }
                        break;


                    case 4:
                        System.out.println("Gol do time B");
                        break;
                }
        }
    }
}

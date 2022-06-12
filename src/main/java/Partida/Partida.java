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


        if(escolhaDoTime=="A"){
            AtacanteA = new Atacante(70);
            MeioDeCampoA = new MeioDeCampo(50);
            GoleiroA = new Goleiro(40);
            list.add(AtacanteA);
            list.add(MeioDeCampoA);
            list.add(GoleiroA);
        }
        if(escolhaDoTime=="B"){
            AtacanteB = new Atacante(40);
            MeioDeCampoB = new MeioDeCampo(50);
            GoleiroB = new Goleiro(70);
            list2.add(AtacanteB);
            list2.add(MeioDeCampoB);
            list2.add(GoleiroB);
        }

        if(escolhaDoTime=="C"){
            AtacanteC = new Atacante(50);
            MeioDeCampoC = new MeioDeCampo(60);
            GoleiroC = new Goleiro(50);
            list3.add(AtacanteC);
            list3.add(MeioDeCampoC);
            list3.add(GoleiroC);
        }

    }


    public void simulaPartida(){

        //quem começa a partida
        Random random = new Random();
        int numero = random.nextInt(2);
        int y = 2; //local da bola, 1 para defesa, 2 para meio, 3 para ataque


        switch(numero){
            case 1: //timeA
                switch(y){

                    case 1:
                        if(list != null && list2 == null){
                            GoleiroA.PassarAbola(probabilidade);
                        }
                        if(list == null && list2 != null){
                            GoleiroB.PassarAbola(probabilidade);
                        }

                    case 2:
                        if(list != null && list2 == null){
                            MeioDeCampoA.PassarAbola(probabilidade);
                        }
                        if(list == null && list2 != null){
                            MeioDeCampoB.PassarAbola(probabilidade);
                        }


                    case 3:
                        if(list != null && list2 == null){
                            AtacanteA.FazerGol(probabilidade);
                        }
                        if(list == null && list2 != null){
                            AtacanteB.FazerGol(probabilidade);
                        }


                    case 4:
                        System.out.println("Gol do time A");
                        break;
                }

            case 2: //timeB
                switch(y){

                    case 1:
                        if(list2 != null && list3 == null){
                            GoleiroB.PassarAbola(probabilidade);
                        }
                        if(list2 == null && list3 != null){
                            GoleiroC.PassarAbola(probabilidade);
                        }

                    case 2:
                        if(list2 != null && list3 == null){
                            MeioDeCampoB.PassarAbola(probabilidade);
                        }
                        if(list2 == null && list3 != null){
                            MeioDeCampoC.PassarAbola(probabilidade);
                        }


                    case 3:
                        if(list2 != null && list3 == null){
                            AtacanteB.FazerGol(probabilidade);
                        }
                        if(list2 == null && list3 != null){
                            AtacanteC.FazerGol(probabilidade);
                        }


                    case 4:
                        System.out.println("Gol do time B");
                        break;
                }

        }


    }




}

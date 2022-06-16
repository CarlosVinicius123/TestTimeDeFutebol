package Posiçoes;

import Interface.Ataque;
import Jogador.Jogador;
import Partida.Partida;

public class Atacante extends Jogador implements Ataque {

    // atributos do Atacante depende do time
    int ataque;
    int localBola;
    int numero;

    int ChanceDeGOL = 50 - ataque;

    public Atacante(int ataque){
        this.ataque = ataque;
    }

    @Override
    public void FazerGol(int probabilidade, Partida Partida, int timeJogando){
        if(ChanceDeGOL < 0){             //Caso a chance de gol seja -0
            ChanceDeGOL = 0;
        }
        if(timeJogando == 1) {
                if (probabilidade <= ChanceDeGOL) {                //Se for True, Faz gol
                    localBola = 4;
                    timeJogando = 1;
                    System.out.println("Time 1 marcou gol");
                    Partida.simulaPartida(timeJogando, localBola, Partida);

                } else {                                          //Se for false, a bola passa para a defesa do outro time
                    localBola = 1;
                    timeJogando = 2;
                    System.out.println("time 1 perdeu a bola para o time 2, bola no goleiro do time 2");
                    ChanceDeGOL = ChanceDeGOL + 10;
                    Partida.simulaPartida(timeJogando, localBola, Partida);

                }}

        if(timeJogando == 2) {
                if (probabilidade <= ChanceDeGOL) {                              //Se for True, Faz gol
                    localBola = 4;
                    timeJogando = 2;
                    System.out.println("time 2 marcou gol");
                    Partida.simulaPartida(timeJogando, localBola, Partida);

                } else {                                                        //Se for false, a bola passa para a defesa do outro time
                    localBola = 1;
                    timeJogando = 1;
                    System.out.println("time 2 perdeu a bola para o itme 1, bola no goleiro do time 1");
                    ChanceDeGOL = ChanceDeGOL + 10;
                    Partida.simulaPartida(timeJogando, localBola, Partida);

                }
            }
        }

    @Override
    public void PassarAbola(int probabilidade, Partida Partida, int timeJogando) {

    }
}

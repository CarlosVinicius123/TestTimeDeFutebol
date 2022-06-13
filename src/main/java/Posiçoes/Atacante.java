package Posiçoes;

import Jogador.Jogador;
import Partida.Partida;

import java.util.Random;

public class Atacante extends Jogador {

    // atributos do Atacante depende do time
    int ataque;
    int y;
    int numero;

    int ChanceDeGOL = 50 - ataque;

    public Atacante(int ataque){
        this.ataque = ataque;
    }





    public void FazerGol(int probabilidade, Partida Partida){
        if(ChanceDeGOL < 0){
            ChanceDeGOL = 0;
        }
        if(numero == 1) {
            if (probabilidade <= ChanceDeGOL) {
                y = 4;
                numero = 1;
                System.out.println("Time 1 marcou gol");
                Partida.simulaPartida(numero,y,Partida);

            } else {
                y = 1;
                numero = 2;
                System.out.println("time 1 perdeu a bola para o time 2, bola no goleiro do time 2");
                ChanceDeGOL = ChanceDeGOL + 10;
                Partida.simulaPartida(numero,y,Partida);

            }
        }
        if(numero == 2) {
            if (probabilidade <= ChanceDeGOL) {
                y = 4;
                numero = 2;
                System.out.println("time 2 marcou gol");
                Partida.simulaPartida(numero,y,Partida);

            } else {
                y = 1;
                numero = 1;
                System.out.println("time 2 perdeu a bola para o itme 1, bola no goleiro do time 1");
                ChanceDeGOL = ChanceDeGOL + 10;
                Partida.simulaPartida(numero,y,Partida);

            }
        }
    }
}
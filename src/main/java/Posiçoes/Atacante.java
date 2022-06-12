package Posiçoes;

import Jogador.Jogador;

import java.util.Random;

public class Atacante extends Jogador {

    // atributos do Atacante depende do time
    int ataque;
    int ChanceDeGOL;
    int y;
    int numero;

    int ChanceDeGOL = 50 - ataque;

    public Atacante(int ataque){
        this.ataque = ataque;
    }





    public void FazerGol(int probabilidade){
        if(ChanceDeGOL < 0){
            ChanceDeGOL = 0;
        }
        if(numero == 1) {
            if (probabilidade <= ChanceDeGOL) {
                return y = 4;
                return numero = 1;
                System.out.println("Time 1 marcou gol");
            } else {
                return y = 1;
                return numero = 2;
                System.out.println("time 1 perdeu a bola para o time 2, bola no goleiro do time 2");
                ChanceDeGOL = ChanceDeGOL + 10;
            }
        }
        if(numero == 2) {
            if (probabilidade <= ChanceDeGOL) {
                return y = 4;
                return numero = 2;
                System.out.println("time 2 marcou gol");
            } else {
                return y = 1;
                return numero = 1;
                System.out.println("time 2 perdeu a bola para o itme 1, bola no goleiro do time 1");
                ChanceDeGOL = ChanceDeGOL + 10;
            }
        }
    }

    //construtor
    public Atacante(String nome, String posicao) {super(nome, posicao);
    }

    //métodos específicos



}
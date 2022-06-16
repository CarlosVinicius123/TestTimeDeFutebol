package Posiçoes;

import Jogador.Jogador;
import Partida.Partida;

public class Goleiro extends Jogador {

    // atributos do goleiro depende do time
    int defesa;
    int localBola;
    int numero;

    public Goleiro(int defesa){
        this.defesa = defesa;
    }

    int ChanceDePasseGoleiro = 10 + defesa;

    public void PassarAbola(int probabilidade, Partida Partida,int timeJogando){
        if(timeJogando == 1) {
            if (probabilidade <= ChanceDePasseGoleiro) {
                localBola = 2;
                timeJogando = 1;
                System.out.println("Time 1 passou a bola do goleiro para o meio de campo");
                Partida.simulaPartida(timeJogando, localBola,Partida);

            } else {
                localBola = 3;
                timeJogando = 2;
                System.out.println("Time 1 perdeu a bola para o time 2, bola no ataque do time 2");
                ChanceDePasseGoleiro = ChanceDePasseGoleiro + 10;
                Partida.simulaPartida(timeJogando, localBola,Partida);

            }
        }
        if(timeJogando == 2) {
            if (probabilidade <= ChanceDePasseGoleiro) {
                localBola = 2;
                timeJogando = 2;
                System.out.println("Time 1 passou a bola do goleiro para o meio de campo");
                Partida.simulaPartida(timeJogando, localBola,Partida);

            } else {
                localBola = 3;
                timeJogando = 1;
                System.out.println("Time 2 perdeu a bola para o time 1, bola no ataque do time 1");
                ChanceDePasseGoleiro = ChanceDePasseGoleiro + 10;
                Partida.simulaPartida(timeJogando, localBola,Partida);

            }
        }
    }

    //métodos específicos
    public void cobrarTirodeMeta(){
        System.out.println("Goleiro cobrando tiro de meta!");
    }

}
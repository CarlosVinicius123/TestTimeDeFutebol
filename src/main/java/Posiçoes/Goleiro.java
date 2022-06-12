package Posiçoes;

import Jogador.Jogador;

public class Goleiro extends Jogador {

    // atributos do goleiro depende do time
    int defesa;
    int y;
    int numero;

    public Goleiro(int defesa){
        this.defesa = defesa;
    }

    int ChanceDePasseGoleiro = 10 + defesa;

    public void PassarAbola(int probabilidade){
        if(numero == 1) {
            if (probabilidade <= ChanceDePasseGoleiro) {
                return y = 2;
                return numero = 1;
                System.out.println("Time 1 passou a bola do goleiro para o meio de campo");
            } else {
                return y = 3;
                return numero = 2;
                System.out.println("Time 1 perdeu a bola para o time 2, bola no ataque do time 2");
                ChanceDePasseGoleiro = ChanceDePasseGoleiro - 10;
            }
        }
        if(numero == 2) {
            if (probabilidade <= ChanceDePasseGoleiro) {
                return y = 2;
                return numero = 2;
                System.out.println("Time 1 passou a bola do goleiro para o meio de campo");
            } else {
                return y = 3;
                return numero = 1;
                System.out.println("Time 2 perdeu a bola para o time 1, bola no ataque do time 1");
                ChanceDePasseGoleiro = ChanceDePasseGoleiro + 10;
            }
        }
    }


    //construtor
    public Goleiro(String nome, String posicao) {
        super(nome, posicao);
    }

    //métodos específicos
    public void cobrarTirodeMeta(){
        System.out.println("Goleiro cobrando tiro de meta!");
    }



}
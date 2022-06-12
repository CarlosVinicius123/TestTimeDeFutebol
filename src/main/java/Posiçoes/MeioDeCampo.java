package Posiçoes;
import Jogador.Jogador;
import Partida.Partida;

import java.util.List;

public class MeioDeCampo extends Jogador {

    // atributos do MeioDeCampo depende do time
    int dominio;
    int ChanceDePasse;
    int y;
    int numero;

    int ChanceDePasse = 10+dominio;
    public MeioDeCampo(int dominio){
        this.dominio = dominio;
    }


    public List<Integer> PassarAbola(int probabilidade){
        if(numero == 1) {
            if (probabilidade <= ChanceDePasse) {
                 y = 3;
                 numero = 1;

                System.out.println("Time 1 passou a bola do meio para o ataque");
            } else {
                return y = 2;
                return numero = 2;
                System.out.println("Time 1 perdeu a bola para o time 2, bola no meio");
                ChanceDePasse = ChanceDePasse - 10;
            }
        }
        if(numero == 2) {
            if (probabilidade <= ChanceDePasse) {
                return y = 3;
                return numero = 2;
                System.out.println("Time 2 passou a bola do meio para o ataque");
            } else {
                return y = 2;
                return numero = 1;
                System.out.println("Time 2 perdeu a bola para o time 1, bola no meio");
                ChanceDePasse = ChanceDePasse + 10;
            }
        }
    }

    public MeioDeCampo(String nome, String posicao) {
        super(nome, posicao);
    }
}

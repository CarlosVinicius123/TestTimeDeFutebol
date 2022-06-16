package Posiçoes;
import Jogador.Jogador;
import Partida.Partida;

public class MeioDeCampo extends Jogador {

    // atributos do MeioDeCampo depende do time
    int dominio;
    int localBola;
    int numero;

    int ChanceDePasse = 10 + dominio;

    public MeioDeCampo(int dominio) {
        this.dominio = dominio;
    }
    @Override
    public void PassarAbola(int probabilidade, Partida Partida,int timeJogando) {
        if (timeJogando == 1) {
            if (probabilidade <= ChanceDePasse) {                        //Se for true, passa para o ataque
                localBola = 3;
                timeJogando = 1;
                System.out.println("Time 1 passou a bola do meio para o ataque");
                Partida.simulaPartida(timeJogando, localBola, Partida);
            } else {                                                    //Se for false, passa para o outro time, mantem no meio de campo
                localBola = 2;
                timeJogando = 2;
                System.out.println("Time 1 perdeu a bola para o time 2, bola no meio");
                ChanceDePasse = ChanceDePasse + 10;
                Partida.simulaPartida(timeJogando, localBola, Partida);

            }
        }
        if (timeJogando == 2) {
            if (probabilidade <= ChanceDePasse) {                                   //Se for true, passa para o ataque
                localBola = 3;
                timeJogando = 2;
                System.out.println("Time 2 passou a bola do meio para o ataque");
                Partida.simulaPartida(timeJogando, localBola, Partida);

            } else {                                                                //Se for false, passa para o outro time, mantem no meio de campo
                localBola = 2;
                timeJogando = 1;
                System.out.println("Time 2 perdeu a bola para o time 1, bola no meio");
                ChanceDePasse = ChanceDePasse + 10;
                Partida.simulaPartida(timeJogando, localBola, Partida);
            }
        }
    }
}

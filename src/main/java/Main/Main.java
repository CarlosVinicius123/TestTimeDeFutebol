package Main;
import Partida.Partida;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Criaçao das variaveis
        String Time1, Time2; //Times de entrada

        Random random = new Random();  //Numero aleatorio para decidir qual time começara a partida
        int timeJogando = random.nextInt(2) + 1;  // +1 para o timeJogando estar entre 1 e 2

        System.out.println(timeJogando);  //Mostrando qual time vai começar

        Partida Partida = new Partida(); //Criaçao de uma nova partida

        Partida.MostrarProb();

        Scanner ler = new Scanner(System.in); //Pedir para o usuario digitar o time desejado
        System.out.println("Escolha o seu time A, B ou C");
        Time1 = ler.next();

        Partida.EscolhendoTime(Time1);  //Criaçao do time na .partida

        System.out.println("Escolha o seu time A, B ou C");
        Time2 = ler.next();

        Partida.EscolhendoTime(Time2);  //Criaçao do time2 na .partida

        Partida.simulaPartida(timeJogando, 2, Partida);  //Simulando uma partida de futebol

    }
}

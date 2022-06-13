package Main;

import Partida.Partida;
import Posiçoes.*;
import Jogador.Jogador;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //quem começa a partida
        Random random = new Random();
        int numero = random.nextInt(2) + 1;

        System.out.println(numero);

        Partida Partida = new Partida();

        Scanner ler = new Scanner(System.in);
        String Time1;
        String Time2;

        System.out.println("Escolha o seu time A, B ou C");
        Time1 = ler.next();

        Partida.EscolhendoTime(Time1);

        System.out.println("Escolha o seu time A, B ou C");
        Time2 = ler.next();

        Partida.EscolhendoTime(Time2);

        Partida.simulaPartida(numero, 2, Partida);
    }
}

package Jogador;

import java.util.Random;
import java.util.Random;
 public abstract class Jogador{

     //membros
     private String nome, posicao;

     //metodos
        public void correr(){
            System.out.println("O jogador " + this.getNome() + " está correndo!");
        }
        public void chutar(){
            System.out.println("O jogador " + this.getNome() + " está chutando!");
        }


        //getters
        public String getNome() {
            return nome;
        }
        public String getPosicao() {
            return posicao;
        }


 }

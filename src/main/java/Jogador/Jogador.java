package Jogador;

import java.util.Random;
import java.util.Random;
 public abstract class Jogador{

        private String nome, posicao;

        //construtores
        public Jogador(String nome, String posicao) {
            this.nome = nome;
            this.posicao = posicao;

        }

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

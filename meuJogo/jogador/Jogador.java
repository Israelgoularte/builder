package meuJogo.jogador;

import meuJogo.personagens.Personagem;

public class Jogador extends Thread{

    private Personagem personagem;
    private int numJogador;
    private int pontuacao;
    private Batalha batalha;


    @Override
    public void run() {
        
        while(!this.batalha.damage(this)){
            try {
                
                sleep((long) (Math.random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if(!this.batalha.fuiDerrotado(numJogador))
        {
            pontuacao++;
            System.out.println("Temos um vencedor!! jogador " + this.numJogador + " com " + pontuacao + " vitorias");
            personagem.getRaca().fala();
        }
        interrupt();
    }
    public Jogador(int numJogador) {
        this.pontuacao=0;
        this.numJogador=numJogador;
        this.batalha = Batalha.getBatalha();
    }


    public Personagem getPersonagem() {
        return this.personagem;
    }

    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }

    public int getPontuacao() {
        return this.pontuacao;
    }

    public void vitoria() {
        this.pontuacao++;
    }


    public int getNumJogador() {
        return this.numJogador;
    }

    public void setNumJogador(int numJogador) {
        this.numJogador = numJogador;
    }
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    
}

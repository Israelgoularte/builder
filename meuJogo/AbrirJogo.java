package meuJogo;

import meuJogo.jogador.Jogador;
import meuJogo.mundo.Mundo;
import meuJogo.personagens.Diretor;

public class AbrirJogo {
    
    private Mundo mundo;
    private Diretor diretor;
    private Jogador jogador01;
    private Jogador jogador02;



    public AbrirJogo() {
        mundo = Mundo.getMundo("Batalha com java");
        diretor = new Diretor();
        jogador01 = new Jogador(1);
        jogador02 = new Jogador(2);
    }

    public void inicializarJogo()
    {
        System.out.println("Seja bem vindo ao "+ mundo.getNome());
    
        diretor = new Diretor();
        System.out.println("Crie seu personagem jogador 1");
        while(jogador01.getPersonagem()==null)
        {
            jogador01.setPersonagem(diretor.criarPersonagem(1));
        }

        diretor = new Diretor();
        System.out.println("Crie seu personagem jogador 2");
        while(jogador02.getPersonagem()==null)
        {
            jogador02.setPersonagem(diretor.criarPersonagem(10));
        }

        jogador01.start();
        jogador02.start();

        try {
            jogador01.join();
            jogador02.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Fim de jogo");
    }



    
}

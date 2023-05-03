package meuJogo.personagens.jobs.classes;

import meuJogo.personagens.jobs.Job;

public class Mago implements Job{

    @Override
    public int atack() {
        return 10;   
    }

    @Override
    public int defesa() {
        return 3;
    }

    @Override
    public int vida() {
        return 10;
    }

    @Override
    public int velocidade() {
        return 5;
    }
    
}

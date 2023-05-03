package meuJogo.personagens.jobs.classes;

import meuJogo.personagens.jobs.Job;

public class Tank implements Job {

    @Override
    public int atack() {
        return 5;   
    }

    @Override
    public int defesa() {
        return 10;
    }

    @Override
    public int vida() {
        return 10;
    }

    @Override
    public int velocidade() {
        return 3;
    }
    
}

package meuJogo.personagens.jobs.classes;

import meuJogo.personagens.jobs.Job;

public class Warrior implements Job {

    @Override
    public int atack() {
        return 10;   
    }

    @Override
    public int defesa() {
        return 8;
    }

    @Override
    public int vida() {
        return 7;
    }

    @Override
    public int velocidade() {
        return 7;
    }

    
}

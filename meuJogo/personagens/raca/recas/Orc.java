package meuJogo.personagens.raca.recas;

import meuJogo.personagens.raca.Raca;

public class Orc implements Raca{
    private int status =0;

    @Override
    public String fala() {
        return "Todos pensam que sou so musculos, porque não conhece minha ciencia";
    }

    @Override
    public String habilidadeEspecial() {
        if(this.status<3)
        {
            this.status++;
            return null;
        }else{
            this.status=0;
            return "Atack 5";
        } 
    }
    
}

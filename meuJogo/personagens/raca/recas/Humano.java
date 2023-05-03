package meuJogo.personagens.raca.recas;
import meuJogo.personagens.raca.Raca;


public class Humano implements Raca{
    private int status =0;

    @Override
    public String fala() {
        return "Somos a raça mas inteligente";
    }

    @Override
    public String habilidadeEspecial() {
        if(this.status<3)
        {
            this.status++;
            return null;
        }else{
            this.status=0;
            return "defesa 5";
        } 
    }
    
}

package meuJogo.personagens.raca.recas;
import meuJogo.personagens.raca.Raca;


public class Elfo implements Raca{
    private int status =0;

    @Override
    public String fala() {
        return "Devemos cuidar da natureza";
    }

    @Override
    public String habilidadeEspecial() {
        if(this.status<3)
        {
            this.status++;
            return null;
        }else{
            this.status=0;
            return "vida 5";
        } 
    }
    
}

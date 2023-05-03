package meuJogo.mundo;

public class Mundo {
    
    private static Mundo mundo;
    private String nome;


    private Mundo(String nome) {
        this.nome = nome;
    }

    private static Mundo buscaOuCriaMundo(String nome){
        if(mundo == null)
            mundo = new Mundo(nome);
        return mundo;
    }

    public static Mundo getMundo(String nome){
        return buscaOuCriaMundo(nome);
    }

    public static Mundo getMundo(){
        return buscaOuCriaMundo("Word of Devs");
    }

    public String getNome()
    {
        return this.nome;
    }

}

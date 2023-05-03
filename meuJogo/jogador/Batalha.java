package meuJogo.jogador;

public class Batalha {
    
    private static Batalha batalha;
    private int damage;
    private int numJogador;
    private Boolean status;

    private Batalha(){
        this.damage=0;
        this.numJogador=0;
        this.status=false;
    }

    public static Batalha getBatalha()
    {
        if(batalha==null){
            batalha = new Batalha();
        }
        return batalha;
    }

    public synchronized Boolean damage(Jogador player){
        if(numJogador == 0){
            this.damage = player.getPersonagem().getAtack();
            this.numJogador = player.getNumJogador();
            System.out.println(player.getPersonagem().getNome()+ " - Atacando");
            return status;
        }else if(numJogador==player.getNumJogador()){
            this.damage = player.getPersonagem().getAtack();
            System.out.println(player.getPersonagem().getNome()+ " - Atacando novamente");
            return status;
        }else if(status)
            return status;
        else{
            player.getPersonagem().setVida(damage);
            this.damage=0;
            this.numJogador=0;
            System.out.println(player.getPersonagem().getNome()+ " - Recebe dano");
            if(player.getPersonagem().getVida()<1)
            {
                status=true;
                this.numJogador=player.getNumJogador();
                System.out.println(player.getPersonagem().getNome()+ " - Morri");
            }  
            return status;
        }
    }

    public Boolean fuiDerrotado(int numJogador){
        if(status && this.numJogador==numJogador)
            return true;
        else return false;
    }

    public void reset()
    {
        this.damage=0;
        this.numJogador=0;
        this.status=false;
    }
    
}

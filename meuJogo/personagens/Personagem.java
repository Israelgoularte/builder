package meuJogo.personagens;

import meuJogo.personagens.armor.Armor;
import meuJogo.personagens.jobs.Job;
import meuJogo.personagens.raca.Raca;
import meuJogo.personagens.weapon.Weapon;

public class Personagem{
    private String nome;
    private int vida;
    private int atack;
    private int velocidade;
    private Job classe;
    private Raca raca;
    private Armor armadura;
    private Weapon arma;


    public Personagem() {
        vida =100;
        atack=0;
        velocidade=100;
    }

    public void atualizaStatus(){
        this.vida += classe.vida();
        this.vida *= armadura.getDef();
        this.atack +=classe.atack();
        this.atack *= armadura.getAtack();
        this.atack *= arma.getAtack();
        this.velocidade += classe.velocidade();
        this.velocidade *= (-armadura.getPeso());
        this.velocidade *= (-arma.getPeso());
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Job getClasse() {
        return this.classe;
    }

    public void setClasse(Job classe) {
        this.classe = classe;
    }

    public Raca getRaca() {
        return this.raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public Armor getArmadura() {
        return this.armadura;
    }

    public void setArmadura(Armor armadura) {
        this.armadura = armadura;
    }

    public Weapon getArma() {
        return this.arma;
    }

    public void setArma(Weapon arma) {
        this.arma = arma;
    }


    public int getVida() {
        return this.vida;
    }

    public void setVida(int damage) {
        this.vida = this.vida - damage;
    }

    public int getAtack() {
        return this.atack;
    }

    public void setAtack(int atack) {
        this.atack = atack;
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", classe='" + getClasse().getClass().getSimpleName() + "'" +
            ", raca='" + getRaca().getClass().getSimpleName() + "'" +
            ", armadura='" + getArmadura().getClass().getSimpleName() + "'" +
            ", arma='" + getArma().getClass().getSimpleName() + "'" +
            "}";
    }

}

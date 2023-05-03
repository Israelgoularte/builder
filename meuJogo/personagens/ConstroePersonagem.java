package meuJogo.personagens;

import meuJogo.personagens.armor.armors.Heavy;
import meuJogo.personagens.armor.armors.Light;
import meuJogo.personagens.armor.armors.Robe;
import meuJogo.personagens.jobs.classes.Archer;
import meuJogo.personagens.jobs.classes.Mago;
import meuJogo.personagens.jobs.classes.Tank;
import meuJogo.personagens.jobs.classes.Warrior;
import meuJogo.personagens.raca.recas.Elfo;
import meuJogo.personagens.raca.recas.Humano;
import meuJogo.personagens.raca.recas.Orc;
import meuJogo.personagens.weapon.weapons.Bow;
import meuJogo.personagens.weapon.weapons.Katanna;
import meuJogo.personagens.weapon.weapons.Retibutter;
import meuJogo.personagens.weapon.weapons.Sword;

public class ConstroePersonagem {

    private Personagem personagem = new Personagem();

    public boolean setClasse(String classe){
        switch(classe){
            case "Mago":
                personagem.setClasse(new Mago());
                return true;
            case "Archer":
                personagem.setClasse(new Archer());
                return true;
            case "Warrior":
                personagem.setClasse(new Warrior());
                return true;
            case "Tank":
                personagem.setClasse(new Tank());
                return true;
            default:
                return false;
        }
    }
    
    public boolean setRaca(String raca){
        switch(raca)
        {
            case "Humano":
            personagem.setRaca(new Humano());
            return true;
            case "Elfo":
            personagem.setRaca(new Elfo());
            return true;
            case "Orc":
            personagem.setRaca(new Orc());
            return true;
            default:
            return false;
        }
    }

    public boolean setNome(String nome){
        personagem.setNome(nome);
        return true;
    }

    public boolean setArmor(String armor){
        switch(armor){
            case "Heavy":
            personagem.setArmadura(new Heavy());
            return true;
            case "Light":
            personagem.setArmadura(new Light());
            return true;
            case "Medium":
            personagem.setArmadura(new Robe());
            return true;
            default:
            return false;
        }
    }

    public boolean setWeapon(String weapon){
        switch(weapon){
            case "Sword":
            personagem.setArma(new Sword());
            return true;
            case "Bow":
            personagem.setArma(new Bow());
            return true;
            case "Katanna":
            personagem.setArma(new Katanna());
            return true;
            case "Retributer":
            personagem.setArma(new Retibutter());
            return true;
            default:
            return false;
        }
    }
    
    public Personagem builder(){
        return this.personagem;
    }

    public boolean reset(){
        personagem = new Personagem();
        return true;
    }
}

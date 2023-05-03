package meuJogo.personagens.weapon.weapons;
import meuJogo.personagens.weapon.Weapon;


public class Retibutter implements Weapon {

    @Override
    public int getPeso() {
        return 8;
    }

    @Override
    public int getDadoCritico() {
        return 3;
    }

    @Override
    public int getAtack() {
        return 8;
    }
    
}

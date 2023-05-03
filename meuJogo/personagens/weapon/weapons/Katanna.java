package meuJogo.personagens.weapon.weapons;
import meuJogo.personagens.weapon.Weapon;


public class Katanna implements Weapon {

    @Override
    public int getPeso() {
        return 1;
    }

    @Override
    public int getDadoCritico() {
        return 8;
    }

    @Override
    public int getAtack() {
        return 5;
    }
    
}

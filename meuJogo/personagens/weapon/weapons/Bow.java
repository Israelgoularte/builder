package meuJogo.personagens.weapon.weapons;
import meuJogo.personagens.weapon.Weapon;


public class Bow implements Weapon {

    @Override
    public int getPeso() {
        return 5;
    }

    @Override
    public int getDadoCritico() {
        return 5;
    }

    @Override
    public int getAtack() {
        return 8;
    }
    
}

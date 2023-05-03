package meuJogo.personagens.weapon.weapons;

import meuJogo.personagens.weapon.Weapon;

public class Sword implements Weapon {

    @Override
    public int getPeso() {
        return 2;
    }

    @Override
    public int getDadoCritico() {
        return 2;
    }

    @Override
    public int getAtack() {
        return 5;
    }
    
}

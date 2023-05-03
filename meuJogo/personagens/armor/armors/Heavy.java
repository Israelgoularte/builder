package meuJogo.personagens.armor.armors;

import meuJogo.personagens.armor.Armor;

public class Heavy implements Armor{

    @Override
    public int getPeso() {
        return 10;
    }

    @Override
    public int getDef() {
        return 10;
    }

    @Override
    public int getAtack() {
        return 2;
    }
    
}

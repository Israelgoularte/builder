package meuJogo.personagens.armor.armors;

import meuJogo.personagens.armor.Armor;

public class Light implements Armor{

    @Override
    public int getPeso() {
        return 1;
    }

    @Override
    public int getDef() {
        return 3;
    }

    @Override
    public int getAtack() {
        return 8;
    }
    
}

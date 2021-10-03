package com.company;

public class WitcherDecorator implements Witcher {
    Witcher character;

    public WitcherDecorator(Witcher character) {
        this.character = character;
    }


    @Override
    public String characterInfo() {
        return character.characterInfo();
    }

    @Override
    public double characterHealth() {
        return character.characterHealth();
    }

    @Override
    public double characterDamage() {
        return character.characterDamage();
    }

    @Override
    public double characterSpeed() {
        return character.characterSpeed();
    }
}

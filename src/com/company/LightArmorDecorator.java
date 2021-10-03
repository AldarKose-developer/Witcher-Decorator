package com.company;

public class LightArmorDecorator extends WitcherDecorator {

    public LightArmorDecorator(Witcher character) {
        super(character);
    }

    @Override
    public String characterInfo() {
        return character.characterInfo() + "He use Light Armor Set that increases damage to 25% and speed to 30%" +
                ", but decrease health to 40%\n";
    }

    @Override
    public double characterHealth() {
        return character.characterHealth() * 0.6;
    }

    @Override
    public double characterDamage() {
        return character.characterDamage() * 1.25;
    }

    @Override
    public double characterSpeed() {
        return character.characterSpeed() * 1.3;
    }
}

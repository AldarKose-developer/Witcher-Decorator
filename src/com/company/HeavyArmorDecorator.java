package com.company;

public class HeavyArmorDecorator extends WitcherDecorator{

    public HeavyArmorDecorator(Witcher character) {
        super(character);
    }

    @Override
    public String characterInfo() {
        return character.characterInfo() + "He use Heavy Armor Set that increases health to 60%" +
                ", but decrease speed to 50% and damage to 20%\n";
    }

    @Override
    public double characterHealth() {
        return character.characterHealth() * 1.6;
    }

    @Override
    public double characterDamage() {
        return character.characterDamage() * 0.80;
    }

    @Override
    public double characterSpeed() {
        return character.characterSpeed() * 0.5;
    }
}

package com.company;

public class WolfSchoolDecorator extends WitcherDecorator{

    public WolfSchoolDecorator(Witcher character) {
        super(character);
    }

    @Override
    public String characterInfo() {
        return character.characterInfo() + "He belongs to Wolf school that increases damage to 30%, health to 10% and speed to 15%\n";
    }

    @Override
    public double characterHealth() {
        return character.characterHealth() * 1.1;
    }

    @Override
    public double characterDamage() {
        return character.characterDamage() * 1.30;
    }

    @Override
    public double characterSpeed() {
        return character.characterSpeed() * 1.15;
    }
}

package com.company;

public class CatSchoolDecorator extends WitcherDecorator {

    public CatSchoolDecorator(Witcher character) {
        super(character);
    }

    @Override
    public String characterInfo() {
        return character.characterInfo() + "He belongs to Cat school that increases damage to 25% and speed to 50%\n";
    }

    @Override
    public double characterHealth() {
        return character.characterHealth();
    }

    @Override
    public double characterDamage() {
        return character.characterDamage() * 1.25;
    }

    @Override
    public double characterSpeed() {
        return character.characterSpeed() * 1.5;
    }

}

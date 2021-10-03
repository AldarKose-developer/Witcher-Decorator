package com.company;

public class BearSchoolDecorator extends WitcherDecorator {
    public BearSchoolDecorator(Witcher character) {
        super(character);
    }

    @Override
    public String characterInfo() {
        return character.characterInfo() + "He belongs to Bear school that increases damage to 35%" +
                "% and health to 50%\n";
    }

    @Override
    public double characterHealth() {
        return character.characterHealth() * 1.5;
    }

    @Override
    public double characterDamage() {
        return character.characterDamage() * 1.35;
    }

    @Override
    public double characterSpeed() {
        return character.characterSpeed();
    }
}

package com.company;

public class MagicalArmorDecorator extends WitcherDecorator {

    public MagicalArmorDecorator(Witcher character) {
        super(character);
    }

    @Override
    public String characterInfo() {
        return character.characterInfo() + "He use Magical Armor set that buffs all characteristics to 20%\n";
    }

    @Override
    public double characterHealth() {
        return character.characterHealth() * 1.2;
    }

    @Override
    public double characterDamage() {
        return character.characterDamage() * 1.2;
    }

    @Override
    public double characterSpeed() {
        return character.characterSpeed() * 1.2;
    }
}

package com.company;

public class MainCharacter implements Witcher {

    private String name;

    public MainCharacter(String name) {
        this.name = name;
    }

    @Override
    public String characterInfo() {
        return "This is your character "+ name + '\n';
    }

    @Override
    public double characterHealth() {
        return 100;
    }

    @Override
    public double characterDamage() {
        return 15;
    }

    @Override
    public double characterSpeed() {
        return 4;
    }
}

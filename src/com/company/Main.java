package com.company;

public class Main {
    public static void main(String[] args) {
        Witcher geralt = new WolfSchoolDecorator(new HeavyArmorDecorator(new MainCharacter("Geralt")));
        System.out.println(geralt.characterInfo());
        System.out.println("Your Characteristics: ");
        System.out.println("Health: " + geralt.characterHealth());
        System.out.println("Damage: " + geralt.characterDamage());
        System.out.println("Speed: " + geralt.characterSpeed());


        System.out.println();

        Witcher gaetan = new CatSchoolDecorator(new LightArmorDecorator(new MainCharacter("Gaetan")));
        System.out.println(gaetan.characterInfo());
        System.out.println("Your Characteristics: ");
        System.out.println("Health: " + gaetan.characterHealth());
        System.out.println("Damage: " + gaetan.characterDamage());
        System.out.println("Speed: " + gaetan.characterSpeed());

        System.out.println();

        Witcher junod = new BearSchoolDecorator(new MagicalArmorDecorator(new MainCharacter("Junod")));
        System.out.println(junod.characterInfo());
        System.out.println("Your Characteristics: ");
        System.out.println("Health: " + junod.characterHealth());
        System.out.println("Damage: " + junod.characterDamage());
        System.out.println("Speed: " + junod.characterSpeed());

    }
}

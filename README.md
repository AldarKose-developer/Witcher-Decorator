# Witcher-Decorator
 This is my implementation of decorator pattern.
 I decided to implement this strategy by using my favorite game Witcher3
## How this program works:
 In this program you can create your game character (Witcher).
 During creation, you can choose from which school this witcher is and 
 choose type of armor for him. Chosen school and armor affects to characteristics of witcher.

#### In program, you can find this schools:
```
Wolf, Bear, Cat
```
#### Type of armor:
```
Heavy, Light, Magical
```

For instance if your witcher from school of Wolf - it increases health to 60%, but decrease speed to 50% and damage to 20%.

And if he uses Heavy Armor Set it increases damage to 30%, health to 10% and speed to 15%.

#### By default, your character have:
```
Health: 100
Damage: 15
Speed: 4.0
```
#### And after choosing this school and Armor:
```
Health: 176.0
Damage: 15.6
Speed: 2.3
```
#### Code Example
```
        Witcher geralt = new WolfSchoolDecorator(new HeavyArmorDecorator(new MainCharacter("Geralt")));
        System.out.println(geralt.characterInfo());
        System.out.println("Your Characteristics: ");
        System.out.println("Health: " + geralt.characterHealth());
        System.out.println("Damage: " + geralt.characterDamage());
        System.out.println("Speed: " + geralt.characterSpeed());
```
#### Output
```
This is your character Geralt
He use Heavy Armor Set that increases health to 60%, but decrease speed to 50% and damage to 20%
He belongs to Wolf school that increases damage to 30%, health to 10% and speed to 15%

Your Characteristics: 
Health: 176.0
Damage: 15.600000000000001
Speed: 2.3
```


### Decoartor implemetation:
##### I have interface Witcher in which I declare all methods
##### Concrete component in my code is MainCharacter class
##### Base decorator is WitcherDecarator class which is super class for other Concrete Decorators
##### Concrete decorators are all schools and armors in game that changes character

I have Concrete Decorators - schools and armor types which extends from Base Decorator "WitcherDecorator" and modify main character health, speed, damage

# Witcher-Decorator
 This is my implementation of decorator pattern.
 I decided to implement this strategy by using my favorite game Witcher3
 ## Where I implemented this strategy:
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
## Why I used this strategy:
So by using Decorator pattern here user can create witcher from any school and any type of Armor.

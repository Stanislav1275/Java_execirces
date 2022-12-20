package ru.sstu.cocktail.Shooter;

import ru.sstu.cocktail.Pistol.Weapon;

public class Shooter {
    public String name;
    public Weapon gun;

    public Shooter(String name, Weapon gun) {
        this.name = name;
        this.gun = gun;
    }
    public Shooter(String name) {
        this(name, null);
    }
    public void fair(){
        if(gun !=null){
            gun.shoot();
        }else System.out.println("не могу стрелять");
    }
}

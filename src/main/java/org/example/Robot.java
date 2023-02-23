package org.example;

public class Robot {

//   Instance variables
    public String name;
    public Weapon weapon;

//    Constructor
    public Robot(Weapon weapon) {
        this.name = "JimBob";
        this.weapon = weapon;
    }

//    Methos (CAN DO)
    public void Attack(){
        System.out.println(this.name + " attacks with their " + this.weapon.name + " for " +this.weapon.power + " damage!");
    }

}

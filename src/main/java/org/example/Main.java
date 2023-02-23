package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        Weapon sword = new Weapon("Sword", 50);
//        Weapon spear = new Weapon("Spear", 40);
        Lightsaber lightsaber = new Lightsaber();
        Spear spear = new Spear();
        Dagger dagger = new Dagger();
        Robot robot_one = new Robot(lightsaber);
        System.out.println(robot_one.name + " 1");
        robot_one.Attack();
        Robot robot_two = new Robot(spear);
        System.out.println(robot_two.name + " 2");
        robot_two.Attack();
        Robot robot_three = new Robot(dagger);
        System.out.println(robot_three.name + " 3");
        robot_three.Attack();

    }
}
package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Weapon sword = new Weapon("Sword", 50);
        Weapon spear = new Weapon("Spear", 40);
        Robot robot_one = new Robot(spear);
        System.out.println(robot_one.name);
        robot_one.Attack();
    }
}
package com.company;

public class Main {

    public static void main(String[] args) {
        Weapon weaponBoss = new Weapon();
        weaponBoss.setWeaponName("bone arrows");
        Boss boss = new Boss();
        boss.setHealth(800);
        boss.setDamage(65);
        boss.setWeapon(weaponBoss);
        Weapon weaponSkeleton = new Weapon();
        weaponSkeleton.setWeaponName("fire arrows");

        Skeleton skeleton = new Skeleton();
        skeleton.setHealth(200);
        skeleton.setDamage(45);
        skeleton.setNumberOfArrows(15);
        skeleton.setWeapon(weaponSkeleton);

        Weapon weaponSkeleton2 = new Weapon();
        weaponSkeleton.setWeaponName("poison arrows");

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(440);
        skeleton2.setDamage(50);
        skeleton2.setNumberOfArrows(40);
        skeleton2.setWeapon(weaponSkeleton2);


        System.out.println(boss.printInfo());
        System.out.println(skeleton.printInfo());
        System.out.println(skeleton2.printInfo());
    }
}


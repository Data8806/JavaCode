package com.company.experiment.four;

public class Entry {
    public static void main(String[] args) {
        Zombie az = new ArmsZombie("普通僵尸",100,1,0,50);
        Role [] n = new Role[1];
        n[0] = az;
        while (az.getBlood()!=0 && az.getY()!=0){
        }
        System.out.println("僵尸胜利");
    }
}

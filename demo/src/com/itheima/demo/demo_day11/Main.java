package com.itheima.demo.demo_day11;

public class Main {
    public static void main(String[] args) {
       Hero hero = new Hero();
       hero.setName("船长");
       hero.setSkill(new Skill() {
           @Override
           public void sfun() {
               System.out.println("biu~~~biu~~~");
           }
       });
       hero.attack();
    }
}

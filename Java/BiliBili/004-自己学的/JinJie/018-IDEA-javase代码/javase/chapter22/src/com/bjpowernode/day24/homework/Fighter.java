package com.bjpowernode.day24.homework;

/**
 * 战斗机，是武器，可以移动，可攻击
 */
public class Fighter extends com.bjpowernode.day24.homework.Weapon implements com.bjpowernode.day24.homework.Moveable, com.bjpowernode.day24.homework.Shootable {

    @Override
    public void move() {
        System.out.println("战斗机起飞");
    }

    @Override
    public void shoot() {
        System.out.println("战斗机开炮！");
    }
}

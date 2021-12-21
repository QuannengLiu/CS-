package com.bjpowernode.day24.homework;

/**
 * 高射炮，是武器，但是不能移动，只能射击
 */
public class GaoShePao extends com.bjpowernode.day24.homework.Weapon implements com.bjpowernode.day24.homework.Shootable {

    @Override
    public void shoot() {
        System.out.println("高射炮开炮！！！");
    }
}

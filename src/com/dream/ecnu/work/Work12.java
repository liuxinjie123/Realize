package com.dream.ecnu.work;

/**
 * 请编写一个Cat类，要求如下：
 * 该猫可以做四则运算，也可以进行面积计算；
 *
 * 将四则运算器和面积运算器合二为一，作一个运算器，
 * 主菜单让用户选择是做四则运算还是面积运算，分为两个子菜单，让用户选择加减乘除或者形状。
 */
public class Work12 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.menu1();
    }

}

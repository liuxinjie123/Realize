package com.dream.ecnu.work;

import java.util.Scanner;

/**
 * 请大家采用面向对象思想设计超级马里奥游戏人物。
 * 并能用键盘输入命令，来控制马里奥的位置
 */
public class Work13 {
    public static void main(String[] args) {
        // 接收键盘输入
        Scanner sr = new Scanner(System.in);
        System.out.println("输入1-25的数字，你可以移动马里奥，输入其它数字退出");
        // 将键盘输入数字赋值给i
        int i = sr.nextInt();

        // 建立调用Maria构造方法
        Maria m = new Maria();
        for (int a = i; a <= 25; a--) {
            if (i < 25) {
                m.move(i);
                i = sr.nextInt();
            } else {
                System.out.println("退出游戏!");
                break;
            }
        }
    }
}

class Maria {
    int x, y;

    // 构造方法，初始化场景；确定地图，Maria的位置
    public Maria() {
        System.out.println("I'm Maria \n" + "@");
    }

    public void move(int i) {
        for (int k = 1; k <= 25; k++) {
            if (k == i) {
                System.out.printf("@");
            } else {
                System.out.printf(".");
            }
        }
    }
}

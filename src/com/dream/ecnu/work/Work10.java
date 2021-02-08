package com.dream.ecnu.work;

import java.util.Scanner;

/**
 * 第十题
 *
 * 有一只猴子摘了一堆桃子，当即吃了一半，可是桃子太好吃了，它又多吃了一个，
 * 第二天它把第一天剩下的桃子吃了一半，又多吃了一个，
 * 就这样到第十天早上它只剩下一个桃子了，问它共摘了多少桃子 ?
 */
public class Work10 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print(" please input the days: ");
        int times = myScanner.nextInt();
        if (times < 1) {
            System.out.println(" the days should be gratter then 0 ");
        } else {
            int total = 1;
            for (int i = 0; i < times; i++) {
                total += 1;
                total *= 2;
            }
            System.out.println(" total: " + total);
        }
    }
}

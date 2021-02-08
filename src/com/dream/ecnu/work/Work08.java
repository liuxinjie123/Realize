package com.dream.ecnu.work;

import java.util.Scanner;

/**
 * 第八题
 * 请使用三个整型变量完成如下功能：
 * 1、用户输入两个整数值；3 5
 * 2、计算两数的和，输出此和； 8
 * 3、求出两数的平均数，输出平均数(整数即可)； 4
 * 4、求出平均数>第二个数的关系表达式的值，输出此值； 0
 * 5、用第一个数减去上面关系表达式的值，得到它们的差，输出差； 3
 * 6、存储第二个数的变量累乘上式的结果，输出此变量的当前值； 15
 * 7、存储第一个数的变量累加第二个变量，输出第一个变量的当前值。 18
 */
public class Work08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" please input the first num: ");
        int a = scanner.nextInt();
        System.out.print(" please input the second num: ");
        int b = scanner.nextInt();
        int c = a + b;
        System.out.println(" sum=" + c);
        int d = (a + b) / 2;
        System.out.println(" average=" + d);
        int e = 0;
        if (d > b) {
            e = 1;
            System.out.println(" the average > " + b + ", res: " + e);
        } else {
            System.out.println(" the average < " + b + ", res: " + e);
        }
        int f = a - e;
        System.out.println(" f = " + f);
        int g = b * f;
        System.out.println(" g = " + g);
        a = a + g;
        System.out.println(" a = " + a);
    }
}

package com.dream.ecnu.work;

/**
 * 第一题：目的
 * 1、变量定义、初始化、赋值
 * 2、运算符和表达式
 * 3、输出语句System.out.println();
 * 1.作一个加法器，计算它们的和
 * 2.作一个减法器，计算它们的差
 * 3.作一个乘法器，计算它们的积
 * 4.作一个除法器，计算它们的商(和余数)
 *
 */
public class Work01 {
    public static void main(String[] args) {
        int i=9;
        int j=4;
        int k = i + j;
        int l = i - j;
        int m = i * j;
        int n = i / j;
        int o = i % j;
        System.out.println(" 和：" + k);
        System.out.println(" 差：" + l);
        System.out.println(" 积：" + m);
        System.out.println(" 商：" + n);
        System.out.println(" 模：" + o);
    }
}

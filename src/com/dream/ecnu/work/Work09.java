package com.dream.ecnu.work;

/**
 * 第九题
 * 渔夫出海打鱼，收获若干
 * 1、渔夫卖掉一半的鱼，然后送给海伦3条；
 * 2、渔夫又卖掉剩下的鱼的2/3，自己吃掉1条；
 * 3、海伦来看渔夫，问他那天打了多少鱼，渔夫数了数，还剩4条鱼，渔夫对海伦怎么说？
 */
public class Work09 {
    public static void main(String[] args) {
        int total = 4;
        total += 1;
        total *= 3;
        total += 3;
        total *= 2;
        System.out.println(" total=" + total);
    }
}

package com.dream.ecnu.work;

/**
 * 已知手掌游戏机一台320元，MP3一台260元。
 * 公司举行抽奖大会，公司有18人，
 * 一等奖游戏机，
 * 二等奖MP3，
 *
 * 购入5台游戏机，13台MP3。
 *
 * 问总价为多少，公司实际平均给每人花费多少钱。
 */
public class Work05 {
    // 游戏机价格
    public static int gamePrice = 320;
    // 游戏机数量
    public static int gameCount = 5;
    // MP3价格
    public static int mp3Price = 260;
    // MP3数量
    public static int mp3Count = 13;
    // 人个数
    public static int personCount = 18;

    public static void main(String[] args) {
        int total = (gamePrice * gameCount + mp3Price * mp3Count);
        double average = (float) total / personCount;
        System.out.printf(" total: %d, average: %f.\n", total, average);
    }
}

package com.dream.ecnu.work;

import java.util.Scanner;

/**
 * 手掌游戏机一台X元，mp3一台Y元(X,Y,N,M,Z由用户输入)
 * 公司举行抽奖大会，一等奖游戏机N台，二等奖mp3 M台。
 * 公司共有Z人。
 *
 * 问总价为多少，公司实际平均给每人花费了多少钱
 */
public class Work06 {
    public static int gamePrice = 0;
    public static int gameCount = 0;
    public static int mp3Price = 0;
    public static int mp3Count = 0;
    public static int personCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" please input the price of game player: ");
        gamePrice = scanner.nextInt();
        System.out.print(" please input the count of game player: ");
        gameCount = scanner.nextInt();
        System.out.print(" please input the price of mp3: ");
        mp3Price = scanner.nextInt();
        System.out.print(" please input the count of mp3: ");
        mp3Count = scanner.nextInt();
        System.out.print(" please input the count of person: ");
        personCount = scanner.nextInt();

        showInfo();
    }
    public static void showInfo() {
        int total = gamePrice * gameCount + mp3Price * mp3Count;
        float average = (float) total / personCount;
        System.out.printf("total: %d, average: %f.\n", total, average);
    }
}

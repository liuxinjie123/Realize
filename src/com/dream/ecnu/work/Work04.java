package com.dream.ecnu.work;

/**
 * 三角形
 */
public class Work04 {
    public static void main(String[] args) {
        // 层数
        int lay = 10;
        for (int i=1; i<=lay; i++) {
            for (int k=1; k<=lay-i; k++) {
                System.out.print(" ");
            }
            for (int j=1; j<=(i-1)*2+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

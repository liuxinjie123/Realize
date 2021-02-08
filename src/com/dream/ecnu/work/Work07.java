package com.dream.ecnu.work;

/**
 * 第七题
 * 九九乘法表，要求行列对齐
 */
public class Work07 {
    public static void main(String[] args) {
        // 9*9 乘法表
        showMultiplyInfo();
    }

    public static void showMultiplyInfo() {
        for (int i=1; i<=9; i++) {
            for (int j=1; j<=i; j++) {
                System.out.printf("%d*%d=%d\t", i, j, (i*j));
            }
            System.out.println();
        }
    }
}

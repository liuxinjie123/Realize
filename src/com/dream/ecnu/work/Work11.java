package com.dream.ecnu.work;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * 计算1+2+3+...+20=?思考如果让用户输入一个整数n计算累加和：1+2+3+...+n能做到吗？
 */
public class Work11 {
    public static void main(String[] args) {
        System.out.print(" please input the num n: ");
        Scanner scanner = new Scanner(System.in);
        Long n = scanner.nextLong();
        System.out.println(" sum1 = " + calSum1(n));
        System.out.println(" sum2 = " + calSum2(n));
    }

    public static BigDecimal calSum1(Long n) {
        BigDecimal sum = BigDecimal.ZERO;
        System.out.println(" cal sum1, start: " + LocalDateTime.now());
        for (int i = 1; i <= n; i++) {
            sum = sum.add(BigDecimal.valueOf((long)i));
        }
        System.out.println(" cal sum2, end: " + LocalDateTime.now());
        return sum;
    }

    public static BigInteger calSum2(Long n) {
        BigInteger sum = BigInteger.ONE;
        System.out.println(" cal sum2, start: " + LocalDateTime.now());
        if (n % 2 == 0) {
            sum = sum.multiply(BigInteger.valueOf(((1 + n) * (n/2))));
        } else {
            sum = sum.multiply(BigInteger.valueOf(((1 + n) / 2) * n));
        }
        System.out.println(" cal sum2, end: " + LocalDateTime.now());
        return sum;
    }
}

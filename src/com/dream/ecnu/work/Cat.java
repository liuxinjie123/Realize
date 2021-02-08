package com.dream.ecnu.work;

import java.util.Scanner;

public class Cat {
    public void menu1() {
        System.out.println("\t");
        System.out.println("\t题目类型如下：");
        System.out.println("\t1、四则运算");
        System.out.println("\t2、面积运算");
        System.out.println("\t0、退出程序");
        System.out.print("\t请选择要输入的类型，请输入 0-2：");
        Scanner scanner = new Scanner(System.in);
        int type = scanner.nextInt();
        switch (type) {
            case 0:
                System.out.println("\t");
                System.out.println("\t谢谢使用，再见！");
                break;
            case 1:
                szys();
                break;
            case 2:
                area();
                break;
            default:
                System.out.println("\t");
                System.out.println("\t参数输入错误，请重新输入！");
                menu1();
        }
    }

    private void szys() {
        System.out.println("\t");
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t四则运算：");
        System.out.println("\t1，加法运算");
        System.out.println("\t2，减法运算");
        System.out.println("\t3，乘法运算");
        System.out.println("\t4，除法运算");
        System.out.println("\t0，返回上级");
        System.out.print("\t请选择：");
        int operator = scanner.nextInt();
        if (0 == operator) {
            System.out.println("\t返回上级");
            menu1();
        } else if (4 < operator || 0 > operator) {
            System.out.println("\t");
            System.out.println("\t参数输入错误，请重新输入。");
            szys();
        } else {
            Scanner scanner01 = new Scanner(System.in);
            System.out.print("\t请输入第一个数：");
            int num1 = scanner01.nextInt();
            System.out.print("\t请输入第二个数：");
            int num2 = scanner01.nextInt();
            switch (operator) {
                case 1:
                    System.out.println("\t" + num1 + " + " + num2 + " = " + (num1 + num2));
                    System.out.println("\t已计算完成。");
                    break;
                case 2:
                    System.out.println("\t" + num1 + " - " + num2 + " = " + (num1 - num2));
                    System.out.println("\t已计算完成。");
                    break;
                case 3:
                    System.out.println("\t" + num1 + " * " + num2 + " = " + (num1 * num2));
                    System.out.println("\t已计算完成。");
                    break;
                case 4:
                    System.out.println("\t" + num1 + " / " + num2 + " = " + (num1 / num2));
                    System.out.println("\t已计算完成。");
                    break;
                default:
                    System.out.println("\t参数输入错误，请重新输入。");
                    szys();
            }
        }
    }

    private void area() {
        System.out.println("\t");
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t面积计算：");
        System.out.println("\t1，三角形");
        System.out.println("\t2，矩形");
        System.out.println("\t3，圆");
        System.out.println("\t0，返回上级");
        System.out.print("\t请选择：");
        int type = scanner.nextInt();
        System.out.println("\t");
        switch (type) {
            case 0:
                System.out.println("\t返回上级。");
                menu1();
                break;
            case 1:
                System.out.println("\t开始计算三角形面积：");
                System.out.print("\t请输入三角形底边长度：");
                int num11 = scanner.nextInt();
                System.out.print("\t请输入三角形高的长度：");
                int num12 = scanner.nextInt();
                float area01 = (float) (num11 * num12) / 2;
                System.out.printf("\t三角形的面积为：%.2f.\n", area01);
                System.out.println("\t已计算完成。");
                break;
            case 2:
                System.out.println("\t开始计算矩形面积：");
                System.out.print("\t请输入矩形的第一条边：");
                int num21 = scanner.nextInt();
                System.out.print("\t请输入矩形的第二条边：");
                int num22 = scanner.nextInt();
                int area02 = num21 * num22;
                System.out.printf("\t矩形的面积为：%d.\n", area02);
                System.out.println("\t已计算完成。");
                break;
            case 3:
                System.out.println("\t开始计算圆的面积：");
                System.out.print("\t请输入圆的半径：");
                float num31 = scanner.nextFloat();
                double area03 = Math.PI * num31 * num31;
                System.out.printf("\t圆的面积为：%.2f.\n", area03);
                System.out.println("\t已计算完成。");
                break;
            default:
                System.out.println("\t参数输入错误，请重新输入。");
                area();
        }
    }


}

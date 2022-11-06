package tech.relaib.java.cources.taranovaja;

import java.util.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Лабораторная работа №1");
        Lab1 lab1 = new Lab1();
        System.out.println("Задание 1");
        System.out.println(lab1.calculateFirstMath(1, 90) + " Результат первого выражения");
        System.out.println(lab1.calculateSecondMath(2, 4, 2) + " Результат второго выражения");
        System.out.println("Задание 2(2)");
        System.out.println(lab1.calculateSumInKilobytes(1, 5) + " Kilobytes");
        System.out.println("Задание 2(11)");
        System.out.println(lab1.calculateBcAndPer(3, 0.05) + " cm - Периметр треугольника");
        System.out.println("Задание 2(4)");
        System.out.println(lab1.calculateSt(45, 45, 90, 5) + " Сторона АС");
        System.out.println("Задание 2(13)");
        Point point1 = new Point(10, 4);
        Point point2 = new Point(15, 11);
        lab1.determineTheMidpoint(point1, point2).print();
    }
}


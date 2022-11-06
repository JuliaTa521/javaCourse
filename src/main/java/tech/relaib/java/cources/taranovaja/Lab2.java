package tech.relaib.java.cources.taranovaja;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Lab2 {
        public static void main(String[] args) throws FileNotFoundException {
            System.out.println("Лабораторная работа №2");
            Scanner scan = new Scanner(new File("тест.txt"));
            ArrayList<String> arrStr = new ArrayList<>();
            while (scan.hasNext()) {
                arrStr.add(scan.nextLine());
            }
            scan.close();
            System.out.println("Строка до сортировки: ");
            for (String anArrStr : arrStr) {
                System.out.println(anArrStr);
            }
            Collections.sort(arrStr);
            System.out.println("\nСтрока после сортировки: ");
            for (String anArrStr : arrStr) {
                System.out.println(anArrStr);
            }
        }
    }

package tech.relaib.java.cources.taranovaja;

import java.lang.Math;
//вариант 11
public class Lab1 {
    double calculateFirstMath(double x, double a) { return (((Math.sin(Math.toRadians(a))+(Math.pow(Math.tan(Math.toRadians(x)),2)))*Math.pow(Math.E,Math.abs(a)))/(Math.log(a)/Math.log(2)));}
    public double calculateSecondMath(double x, double y, double z) { return (Math.log(Math.abs(x+7))*(x-(y/(z+(Math.pow(x,5)/4))))); }
    //  Номера задач задания 2: 11, 2, 4, 13
    //11. Вычислить длину катета ВС и периметр треугольника.
    public double calculateBcAndPer(double ab, double ac) {
        ac*=100;
        double bc;
        bc=Math.pow(ac,2)-Math.pow(ab,2);
        bc=Math.pow(bc,0.5);
        System.out.println(bc+" Катет ВС в см");
        return ab+ac+bc;
    }

    //2.Перевести А в байты, В  в гигабайты. Найти их сумму в килобайтах
    public double calculateSumInKilobytes(double a, double b) {
        a*=1048576;
        b/=1024;
        return ((a/1024)+b*1048576);
    }

    //4. Вычислить стороны треугольника.
    public double calculateSt(double a, double b, double c, double r) {
        double ab,bc,ac;
        ab=2*r*Math.sin(Math.toRadians(a));
        System.out.println(ab+" Сторона АВ");
        bc=2*r*Math.sin(Math.toRadians(b));
        System.out.println(bc+" Сторона ВС");
        ac=2*r*Math.sin(Math.toRadians(c));
        return ac;
    }
    //13.  Вычислить координаты середины отрезка.
    public Point determineTheMidpoint(Point point1, Point point2) {
        Point point;
        if (point1.getX() > point2.getX()) {
            point = new Point((point1.getX() - point2.getX()) / 2, (point1.getY() - point2.getY()) / 2);
            point.setX(point.getX() + point2.getX());
            point.setY(point.getY() + point2.getY());
        } else {
            point = new Point((point2.getX() - point1.getX()) / 2, (point2.getY() - point1.getY()) / 2);
            point.setX(point.getX() + point1.getX());
            point.setY(point.getY() + point1.getY());
        }
        return point;
    }

}


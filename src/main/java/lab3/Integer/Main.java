package lab3.Integer;

public class Main {

    public static void main(String[] args) {

        Integer int1 = new Integer(16);
        Integer int2 = new Integer("234");
        Integer int3 = new Integer();

        int3.add(5.3);

        System.out.println(int1);
        System.out.println(int2);
        System.out.println(int3);

        System.out.println("\n Возведение в степень 3 первого числа: " +int1.pow(3));

        System.out.println("\n Сравнение двух объектов: " + int1.compare(int3));

        System.out.println("\n Вычитание: " + int2.subtraction(int1));
        System.out.println("\n Умножение: " + int2.multiplication(int3));
        System.out.println("\n Деление: " + int1.division(int3));

        System.out.println("\n Возведение в степень: " + int1.pow(3));

        Integer int4 = new Integer(80);
        System.out.println("\n Шестнадцетиричная система: " + int4.decimal2hex());
        Integer int5 = new Integer(80);
        System.out.println("\n Восьмеричная система: " + int5.decimal28());

    }
}

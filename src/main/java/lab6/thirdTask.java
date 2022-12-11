package lab6;

public class thirdTask {
    //Написать функциональный интерфейс с методом, который принимает
    //три дробных числа: a, b, c и возвращает тоже дробное число. Написать
    //реализацию такого интерфейса в виде лямбда-выражения, которое возвращает
    //дискриминант. Кто забыл, D = b^2 – 4ac.
    public static void main(String[] args) {
            thirdTaskInterface third = (a, b, c) -> {
                return Math.pow(b, 2) - 4 * a * c;
            };
            System.out.println(third.strBigLength(3.5, -13, 2.5));
        }
    }

    interface thirdTaskInterface {
        double strBigLength(double a, double b, double c);
    }



package lab6;

public class firstTask {
    //Написать функциональный интерфейс с методом, который принимает
    //число и возвращает булево значение. Написать реализацию такого интерфейса
    //в виде лямбда-выражения, которое возвращает true если переданное число
    //делится без остатка на 13.
        public static void main(String[] args) {
            firstTaskInterface first = ((n) -> {
                if (n % 13 == 0) {
                    return true;
                } else {
                    return false;
                }
            });
            System.out.println(first.divideOn13(26));
            System.out.println(first.divideOn13(20));
        }
    }

    @FunctionalInterface
    interface firstTaskInterface {
        boolean divideOn13(int n);
    }


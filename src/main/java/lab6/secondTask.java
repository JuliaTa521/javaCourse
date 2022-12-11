package lab6;

public class secondTask {
    //Написать функциональный интерфейс с методом, который принимает
    //две строки и возвращает тоже строку. Написать реализацию такого
    //интерфейса в виде лямбды, которая возвращает ту строку, которая длиннее
        public static void main(String[] args) {
            secondTaskInterface second = (st1, st2) -> {
                if (st1.length() > st2.length()) {
                    return st1;
                } else {
                    return st2;
                }
            };
            System.out.println(second.strBiggerLength("hello", "favourite"));
            System.out.println(second.strBiggerLength("ёлка", "шишки"));
        }
    }

    interface secondTaskInterface {
        String strBiggerLength(String st1, String st2);
    }




package lab6;

public class fourthTask {
    //Используя функциональный интерфейс из задачи 3 написать лямбда-выражение,
    // которое возвращает результат операции a * b^c
        public static void main(String[] args) {
            lab6.fourthTaskInterface fourth = (a, b, c) -> {
                return a * Math.pow(b, c);
            };
            System.out.println(fourth.strBigLength(3, 2, 5));
        }
    }

    interface fourthTaskInterface {
        double strBigLength(double a, double b, double c);
    }


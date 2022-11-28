package lab3;
import java.util.ArrayList;
import java.util.List;
public class MainTwo {

        public static void main(String[] args) {

            ListContainer<ArrayList<String>> listContainer1 = new ListContainer<>();
            ListContainer<ArrayList<String>> listContainer2 = new ListContainer<>();

            ArrayList<String> firstList = new ArrayList<>();
            ArrayList<String> secondList = new ArrayList<>();
            ArrayList<String> thirdList = new ArrayList<>();

            firstList.add("first");
            firstList.add("second");
            firstList.add("third");
            firstList.add("fourth");

            secondList.add("five");
            secondList.add("sixth");
            secondList.add("seventh");
            secondList.add("eight");

            thirdList.add("nine");
            thirdList.add("ten");
            thirdList.add("eleven");
            thirdList.add("this");

            ListContainer<List<String>> listContainer3 = new ListContainer<>(firstList, secondList);

            listContainer1.add(firstList);
            listContainer2.add(firstList);

            listContainer3.add(firstList);
            listContainer3.add(secondList);
            listContainer3.add(thirdList);

            System.out.println(listContainer1);
            System.out.println(listContainer2);
            System.out.println(listContainer3);

            System.out.println("\nМетод сравнения двух контейнеров:\n" + listContainer1.compareTo(listContainer2));

            System.out.println("\nlistContainer3:\n" + listContainer3);
            listContainer3.remove(0);
            System.out.println("\nМетод удаления элементов в контейнере:\n" + listContainer3);

            System.out.println("\nПоиск элементов по индексу = 1:\n" + listContainer3.get(1));

            System.out.println("\nПоиск элементов по значению = 'nine,ten,eleven,this':\n" + listContainer3.get(thirdList));

            System.out.println("\nПолучение подсписка по индексам с 0 по 2:\n" + listContainer3.subList(0, 2));
            System.out.println("\nКонтейнер второй:\n" + listContainer2);
            System.out.println("\nКонтейнер третий:\n" + listContainer3);
            listContainer3.addAll(listContainer2);
            System.out.println("\nДобавление коллекции элементов (к 3+2):\n" + listContainer3);
        }
    }

package SeminarsHW.HW3.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Books book1 = new Books("Сказки", "Иванов", 100, 2008, 270);
        Books book2 = new Books("Детектив", "Агапов", 150, 2015, 131);
        Books book3 = new Books("Роман", "Петров", 200, 2020, 307);
        Books book4 = new Books("Песни", "Антонов", 100, 2001, 179);
        Books book5 = new Books("Фантастика", "Аюпов", 250, 2022, 311);
        Books book6 = new Books("Кулинария", "Сидоров", 100, 2012, 250);

        List<Books> allBooks = new ArrayList<>();
        allBooks.add(book1);
        allBooks.add(book2);
        allBooks.add(book3);
        allBooks.add(book4);
        allBooks.add(book5);
        allBooks.add(book6);

        List<String> nameList = new ArrayList<>();
        for (int i = 0; i < allBooks.size(); i++) {
            if ((checkSimple(allBooks.get(i).getPages())) &&
                    (allBooks.get(i).getAuthor().contains("А")) &&
                    ((allBooks.get(i).getYear()) >= 2010)) {
                nameList.add(allBooks.get(i).getName());
            }
        }
        System.out.println(nameList);

    }

    public static boolean checkSimple(int number) {
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;                
            }
        }
        return isPrime;
    }
}

package SeminarsHW.HW3.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Products product1 = new Products("Мороженное", "Россия", 10, 150, 1);
        Products product2 = new Products("Сок", "Белоруссия", 15, 300, 2);
        Products product3 = new Products("Пряности", "Казахстан", 10, 150, 1);
        Products product4 = new Products("Мука", "Россия", 20, 300, 2);
        Products product5 = new Products("Рыба", "Россия", 12, 500, 1);
        Products product6 = new Products("Мясо", "Белоруссия", 17, 450, 2);

        List<Products> allProducts = new ArrayList<>();
        allProducts.add(product1);
        allProducts.add(product2);
        allProducts.add(product3);
        allProducts.add(product4);
        allProducts.add(product5);
        allProducts.add(product6);

        int searchSort = 2;
        int minPrice = 1001;
        for (int i = 0; i < allProducts.size(); i++) {
            if (allProducts.get(i).getSort().equals(searchSort) &&
                    ((allProducts.get(i).getPrice()) < minPrice)) {
                minPrice = (allProducts.get(i).getPrice());
            }
        }

        List<String> finalList = new ArrayList<>();
        for (int i = 0; i < allProducts.size(); i++) {
            if (allProducts.get(i).getSort().equals(searchSort) &&
                    ((allProducts.get(i).getPrice()) == minPrice)) {
                finalList.add(allProducts.get(i).getName());
            }
        }
        System.out.println("Товары " + searchSort + " сорта с минимальной ценой " + minPrice +
                ": " + finalList);
    }
}
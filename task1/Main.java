package SeminarsHW.HW3.task1;

import java.util.ArrayList;
import java.util.List;

//Дан массив записей: наименование товара, цена, сорт. 
// Найти наибольшую цену товаров 1го или 2го сорта среди товаров, 
// название которых содержит «высший».

public class Main {
    public static void main(String[] args) {
        Products product1 = new Products("Кофе высший класс", 300, 1);
        Products product2 = new Products("Чай", 250, 2);
        Products product3 = new Products("Мука", 150, 3);
        Products product4 = new Products("Арахис высший вкус", 200, 2);
        Products product5 = new Products("Мороженное", 100, 1);
        Products product6 = new Products("Рис высший класс", 150, 1);

        List<Products> allProducts = new ArrayList<>();
        allProducts.add(product1);
        allProducts.add(product2);
        allProducts.add(product3);
        allProducts.add(product4);
        allProducts.add(product5);
        allProducts.add(product6);        
        
        int maxPrice = 0;
        for (int i = 0; i < allProducts.size(); i++) {
            if (((allProducts.get(i).getSort().equals(1)) || 
            (allProducts.get(i).getSort().equals(2))) 
            && 
            (allProducts.get(i).getName().contains("высший"))) 
            {                
                if ((allProducts.get(i).getPrice()) > maxPrice) {
                    maxPrice = allProducts.get(i).getPrice();
                    }
            }
            
        }
        System.out.println(maxPrice);
    }
}
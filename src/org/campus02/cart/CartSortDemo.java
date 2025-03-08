package org.campus02.cart;

import java.util.ArrayList;
import java.util.Collections;

public class CartSortDemo {

    public static void main(String[] args) {

        ArrayList<Cart> carts = new ArrayList<>();
        carts.add(new Cart("max", 1, 5, 100.00));
        carts.add(new Cart("john", 4, 12, 135.90));
        carts.add(new Cart("susi", 10, 12, 643.90));

        Collections.sort(carts);
        System.out.println(carts);


        // sortiere nun nach anzahl der artikel desc
        Collections.sort(carts, new CartTotalItemsDescComparator());
        System.out.println(carts);

        // sortiere zuerst nach total items desc und bei gleichstand nach num articles desc
        carts.sort(new CartTotalItemsDescNumArticlesDescComparator());
        System.out.println(carts);
    }
}

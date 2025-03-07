package org.campus02.cart;

import java.util.ArrayList;
import java.util.Collections;

public class CartSortDemo {

    public static void main(String[] args) {

        ArrayList<Cart> carts = new ArrayList<>();
        carts.add(new Cart("max", 1, 5, 100.00));
        carts.add(new Cart("john", 4, 10, 135.90));
        carts.add(new Cart("susi", 10, 12, 643.90));

        Collections.sort(carts);
        System.out.println(carts);


    }
}

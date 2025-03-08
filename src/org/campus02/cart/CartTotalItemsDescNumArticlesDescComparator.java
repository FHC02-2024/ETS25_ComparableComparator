package org.campus02.cart;

import java.util.Comparator;

public class CartTotalItemsDescNumArticlesDescComparator implements Comparator<Cart> {
    @Override
    public int compare(Cart o1, Cart o2) {
        int result = Integer.compare(o2.getTotalItems(), o1.getTotalItems());
        if (result == 0) {
            return Integer.compare(o2.getNumArticles(), o1.getNumArticles());
        }
        return result;
    }
}

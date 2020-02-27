package com.open.store.open_store.mock;

import com.open.store.open_store.core.model.item.*;
import com.open.store.open_store.core.model.shop.ShopCart;

public class Mock {

    /**
     * Generates a shopcart containing the following item list:
     * 1 book at 12.49
     * 1 music CD at 14.99
     * 1 chocolate bar at 0.85
     */
    public static ShopCart shopCart1() {
        ShopCart shopCart = new ShopCart();
        Book book = new Book("Book", false, 12.49);
        Item musicCd = new Item("Music cd", false, 14.99);
        Food chocolateBar = new Food("Chocolate bar", false, 0.85);
        
        shopCart.addItemToCart(book);
        shopCart.addItemToCart(musicCd);
        shopCart.addItemToCart(chocolateBar);

        return shopCart;
    }

    /**
     * Generates a shopcart containing the following item list:
     * 1 imported box of chocolates at 10.00
     * 1 imported bottle of perfume at 47.50
     */
    public static ShopCart shopCart2() {
        ShopCart shopCart = new ShopCart();
        Food importedBoxOfChocolate = new Food("Imported box of chocolate",
            true, 10.00);
        Item importedPerfume = new Item("Imported perfume", true, 47.50);
        
        shopCart.addItemToCart(importedBoxOfChocolate);
        shopCart.addItemToCart(importedPerfume);

        return shopCart;
    }

    /**
     * Generates a shopcart containing the following item list:
     * 1 imported bottle of perfume at 27.99
     * 1 bottle of perfume at 18.99
     * 1 packet of headache pills at 9.75
     * 1 imported box of chocolates at 11.25
     */
    public static ShopCart shopCart3() {
        ShopCart shopCart = new ShopCart();
        Item importedPerfume = new Item("Imported perfume", true, 27.99);
        Item perfume = new Item("Perfume", false, 18.99);
        MedicalProduct headachePills = new MedicalProduct("Headache pills",
            false, 9.75);
        Food importedBoxOfChocolate = new Food("Imported box of chocolate",
            true, 11.25);
        
        shopCart.addItemToCart(importedPerfume);
        shopCart.addItemToCart(perfume);
        shopCart.addItemToCart(headachePills);
        shopCart.addItemToCart(importedBoxOfChocolate);

        return shopCart;
    }
}
package com.keyin;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Games> games;

    public Cart() {
        this.games = new ArrayList<>();
    }

    public void addGame(Games game) {
        if (game.getAmount() > 0) {
            this.games.add(game);
            System.out.println("Added " + game.getTitle() + " to cart: ");
        } else {
            System.out.println(game.getTitle() + " is out of stock.");
        }
    }

    public void removeGame(Games game) {
        if (this.games.contains(game)) {
            this.games.remove(game);
            System.out.println("Removed " + game.getTitle() + " from cart: ");
        } else {
            System.out.println(game.getTitle() + " is not in the cart.");
        }
    }

    public double calculateTotal() {
        double total = 0.0;
        for (Games game : this.games) {
            total += game.getPrice();
        }
        
        return total;
    }

    public void viewCart() {
        if (this.games.isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        }

        for (Games game : this.games) {
            System.out.println(game.getTitle() + " - $" + game.getPrice());
        }

        System.out.println("Total: $" + calculateTotal());
    }

    public void checkout() {
        if (this.games.isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        }

        System.out.println("Total: $" + calculateTotal() + ". Thank you for shopping with us!");
        games.clear();
    }
}

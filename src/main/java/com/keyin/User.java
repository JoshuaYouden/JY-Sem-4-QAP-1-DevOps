package com.keyin;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<Games> purchaseHistory;

    public User(String username) {
        this.username = username;
        this.purchaseHistory = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<Games> getPurchaseHistory() {
        return purchaseHistory;
    }

    public void addPurchases(List<Games> game) {
        this.purchaseHistory.addAll(game);
    }

    public void purchaseHistory() {
        if (purchaseHistory.isEmpty()) {
            System.out.println("Purchase history is empty.");
        } else {
            System.out.println("Purchase history for " + username + ":");
            for (Games game : purchaseHistory) {
                System.out.println("- " + game.getTitle() + " ($" + game.getPrice() + ")");
            }
        }
    }
}

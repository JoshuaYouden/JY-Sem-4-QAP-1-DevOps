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

    public void addPurchase(Games game) {
        purchaseHistory.add(game);
    }

    public void purchaseHistory() {
        if (purchaseHistory.isEmpty()) {
            System.out.println("Purchase history is empty.");
        } else {
            System.out.println("Purchase history for " + username + ":");
            purchaseHistory.forEach(System.out::println);
        }
    }
}

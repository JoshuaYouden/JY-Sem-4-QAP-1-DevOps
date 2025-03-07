package com.keyin;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Cart cart = new Cart();
        User user = new User("JohnnyBoy121");

        store.addGame(new Games("The Legend of Zelda: Breath of the Wild", 59.99, "Adventure", 10, "E"));
        store.addGame(new Games("Call of Duty: Black Ops 6", 75.99, "FPS", 20, "M"));
        store.addGame(new Games("Elden Ring", 59.99, "RPG", 15, "M"));
        store.addGame(new Games("Cyberpunk 2077", 49.99, "Action", 18, "M"));

        System.out.println("Welcome to the game store, " + user.getUsername() + "!");
        store.showListOfGames();

        System.out.println("\nAdding Cyberpunk 2077 to cart... ");
        cart.addGame(store.searchGame("Cyberpunk 2077"));

        System.out.println("\nAdding Call of Duty: Black Ops 6 to cart... ");
        cart.addGame(store.searchGame("Call of Duty: Black Ops 6"));

        System.out.println("\nAdding The Legend of Zelda: Breath of the Wild to cart... ");
        cart.addGame(store.searchGame("The Legend of Zelda: Breath of the Wild"));

        System.out.println("\nHere is your cart " + user.getUsername() + ": ");
        cart.viewCart();
        
        System.out.println("\nRemoving The Legend of Zelda: Breath of the Wild from cart... ");
        cart.removeGame(store.searchGame("The Legend of Zelda: Breath of the Wild"));

        System.out.println("\nProceeding to checkout...");
        cart.checkout(user);

        System.out.println("\nViewing Purchase History...");
        user.purchaseHistory();

        System.out.println("\nThank you for your purchases and we hope to see you again, " + user.getUsername() + "!");
    }
}
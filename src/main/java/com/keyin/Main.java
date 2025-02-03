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

        System.out.println("Welcome to the game store, " + user.getUsername() + "! Here are our available games:");
        store.showListOfGames();

        System.out.println("\n Adding Cyberpunk 2077 to cart... ");
        cart.addGame(store.searchGame("Cyberpunk 2077"));

        System.out.println("\n Adding Call of Duty: Black Ops 6 to cart... ");
        cart.addGame(store.searchGame("Call of Duty: Black Ops 6"));

        System.out.println("\n Adding The Legend of Zelda: Breath of the Wild to cart... ");
        cart.addGame(store.searchGame("The Legend of Zelda: Breath of the Wild"));

        System.out.println("\n Here is your cart" + user.getUsername() + ": ");
        cart.viewCart();
        
        System.out.println("\n Removing The Legend of Zelda: Breath of the Wild from cart... ");
        cart.removeGame(store.searchGame("The Legend of Zelda: Breath of the Wild"));

        System.out.println("\n Proceeding to checkout...");
        cart.checkout();

        System.out.println("\nViewing Purchase History...");
        user.purchaseHistory();

        System.out.println("\n Thank you for your purchases and we hope to see you again, " + user.getUsername() + "!");
    }
}
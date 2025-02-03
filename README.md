# Game Store System - Documentation

# Project Overview

This Game Store System is a command-line application that simulates an online game store. Users can browse games, add games to their cart, remove games, checkout purchases, and view purchase history. The system follows clean coding principles and includes JUnit tests to verify functionality.

# Main Features

1. View Store Games - Displays all available games.
2. Search for a Game - Allows users to find games by title.
3. Add Game to Cart - Adds a selected game to the cart.
4. Remove Game from Cart - Removes a selected game from the cart.
5. View Cart - Displays the games currently in the cart along with the total price.
6. Checkout - Purchases all games in the cart and saves them to the user's purchase history.
7. View Purchase History - Shows all games the user has purchased.
   The project follows object-oriented programming (OOP) principles, with well structured classes (Game, Cart, User, Store). It is built using Java and JUnit 5 for testing.

# Clean Code Practices

This project follows clean coding principles, including meaningful naming, modular methods, and structured class design. The following are some examples:
1️. Meaningful Naming & Code Readability

```java
public double calculateTotal() {
    double total = 0.0;
    for (Games game : this.games) {
        total += game.getPrice();
    }
    return Math.round(total * 100.0) / 100.0;
}
```

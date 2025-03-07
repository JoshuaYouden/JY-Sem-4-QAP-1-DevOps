# Game Store System - Documentation

# Project Overview

This Game Store System is a command-line application that simulates an online game store. Users can browse games, add games to their cart, remove games, checkout purchases, and view purchase history. The system follows clean coding principles and includes JUnit tests to verify functionality.

# Main Features

1. View Store Games - Displays all available games.
2. Add Game to Cart - Adds a selected game to the cart.
3. Remove Game from Cart - Removes a selected game from the cart.
4. View Cart - Displays the games currently in the cart along with the total price.
5. Checkout - Purchases all games in the cart and saves them to the user's purchase history.
6. View Purchase History - Shows all games the user has purchased.

The project follows object-oriented programming (OOP) principles, with well structured classes (Game, Cart, User, Store). It is built using Java and JUnit 5 for testing.

# Clean Code Practices

This project follows clean coding principles, including meaningful naming, modular methods, and structured class design. The following are some examples:

1️⃣ Meaningful Naming & Code Readability

![calculateTotal method](/src/screenshots/Total.PNG)

Why is this clean code?

1. The method name calculateTotal() is clear and descriptive.
2. Proper indentation and spacing improve readability.

2️⃣ Single Responsibility Principle (SRP)

![addGame method](/src/screenshots/Add.PNG)

Why is this clean code?

1. The method only adds a game to the cart, following SRP.
2. It contains clear conditional logic for handling stock availability.

3️⃣ Proper Encapsulation

![private values](/src/screenshots/Private.PNG)
![getters](/src/screenshots/Getters.PNG)

Why this is clean code?

1. Attributes are private, preventing unintended modifications.
2. Getter methods control data access, ensuring encapsulation.

# Unit Testing & Test Cases

JUnit 5 Tests Implemented:

1. Cart Functionality:
   Adding a game to the cart.
   Removing a game from the cart.
   Checking total price calculation.

2. Purchase History:
   Saving and retrieving purchase history.

3. Game Search & Availability:
   Searching for an existing game.
   Searching for a non-existing game.

Here's an example:

```java
@Test
    public void addGameToCartTest() {
        cart.addGame(game1);
        List<Games> games = cart.getGames();
        assertEquals(1, games.size());
    }
```

Why does testing matter?

1. It ensures that functionality works as expected.
2. It helps prevent bugs when modifying the code.

# Dependencies

The project uses Maven for dependency management. The required dependencies are listed in pom.xml and are automatically downloaded.

Required Dependencies:

JUnit 5 - 5.8.1 - Maven Central

Maven Compiler Plugin - 3.8.1 - Maven Central

To install the dependencies, run:

```sh
mvn clean install
```

# Challenges Faced

Here's some problems I encountered during my time coding this application:

1. Maven Build Failing in VSCode

Issue: While running and debugging the Main.java file, the following came up: "Build failed, do you want to continue?" I fixed it by cloning the repo again.

2. Purchase History Not Saving

Issue: The Purchase History was not being saved. Turns out I had the logic wrong so I had to alter it.

3. Too many decimal places in checkout(User user)

Issue: When viewing the checkout, the total would show more than 2 decimal points. I fixed it by altering how it was shown in the method used.

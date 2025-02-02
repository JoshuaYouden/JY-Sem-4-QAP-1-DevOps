import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import com.keyin.Cart;

import com.keyin.Games;

public class CartTest {
    private Cart cart;
    private Games game1;
    private Games game2;

    @BeforeEach
    public void setUp() {
        cart = new Cart();
        game1 = new Games("Minecraft", 10.99, "Sandbox", 15, "E");
        game2 = new Games("Fortnite", 19.98, "Battle Royale", 18, "E");
    }

    @Test
    public void addGameToCartTest() {
        cart.addGame(game1);
        List<Games> games = cart.getGames();
        assertEquals(1, games.size());
    }

    @Test
    public void removeGameFromCartTest() {
        cart.addGame(game1);
        cart.removeGame(game1);
        assertEquals(0, cart.getGames().size());
    }

    @Test
    public void totalPriceCalculationTest() {
        cart.addGame(game1);
        cart.addGame(game2);
        assertEquals(30.97, cart.calculateTotal());
    }
}

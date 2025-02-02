import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.keyin.Games;

public class GameTest {
    @Test
    public void createGameTest() {
        Games game = new Games("Elden Ring", 59.99, "RPG", 20, "M");
        assertEquals("Elden Ring", game.getTitle());
        assertEquals(59.99, game.getPrice());
        assertEquals("RPG", game.getGenre());
        assertEquals(20, game.getAmount());
        assertEquals("M", game.getAgeRating());
    }

    @Test
    public void noStockTest() {
        Games game = new Games("Minecraft", 10.99, "Sandbox", 15, "E");
        game.setAmount(0);
        assertEquals(0, game.getAmount());
    }
}

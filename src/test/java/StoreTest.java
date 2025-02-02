import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.keyin.Games;
import com.keyin.Store;

public class StoreTest {
    private Store store;
    private Games game1;
    private Games game2;

    @BeforeEach
    public void setUp() {
        store = new Store();
        game1 = new Games("Elden Ring", 59.99, "RPG", 15, "M");
        game2 = new Games("Cyberpunk 2077", 49.99, "Action", 18, "M");
        store.addGame(game1);
        store.addGame(game2);
    }

    @Test
    public void searchFoundGameTest() {
        Games foundGame = store.searchGame("Cyberpunk 2077");
        assertNotNull(foundGame);
        assertEquals("Cyberpunk 2077", foundGame.getTitle());
    }

    @Test
    public void searchNotFoundGameTest() {
        Games notFoundGame = store.searchGame("Minecraft");
        assertNull(notFoundGame);
    }
}

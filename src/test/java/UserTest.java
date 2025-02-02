import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.keyin.Games;
import com.keyin.User;

public class UserTest {
    private User user;
    private  Games game1;

    @BeforeEach
    public void setUp() {
        user = new User("JohnnyBoy121");
        game1 = new Games("Call of Duty", 75.99, "FPS", 20, "M");
    }

    @Test
    public void createUserTest() {
        assertEquals("JohnnyBoy121", user.getUsername());
    }

    @Test
    public void purchaseHistoryTest() {
        user.addPurchase(game1);
        List<Games> purchaseHistory = user.getPurchaseHistory();
        assertEquals(1, purchaseHistory.size());
        assertEquals("Call of Duty", purchaseHistory.get(0).getTitle());
    }
}

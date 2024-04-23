import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class GameParameterizedTest {

    private final int playerChoice;
    private final boolean expected;

    public GameParameterizedTest(int playerChoice, boolean expected) {
        this.playerChoice = playerChoice;
        this.expected = expected;
    }

    @Parameters(name = "{index}: Player's choice={0}, Expected={1}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {0, true},
                {1, true},
                {2, true}
        });
    }

    @Test
    public void testSwitchDoor() {
        Game game = new Game();
        game.setPlayerChoice(playerChoice);
        assertEquals(expected, game.switchDoor());
    }
}

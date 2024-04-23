import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class GameTest {

    @Test
    public void testSwitchDoor() {
        Game game = new Game();
        game.setPlayerChoice(0);
        assertTrue(game.switchDoor());
    }

    @Test
    public void testSwitchDoorWhenPlayerChoosesCar() {
        Game game = new Game();
        game.setPlayerChoice(game.getCarPosition());
        assertFalse(game.switchDoor());
    }

    @Test
    public void testOpenGoatDoorWhenPlayerChoosesCar() {
        Game game = new Game();
        game.setPlayerChoice(game.getCarPosition());
        assertFalse(game.openGoatDoor());
    }

    @Test
    public void testSwitchDoorWithoutChoosing() {
        Game game = new Game();
        game.setPlayerChoice(0);
        assertFalse(game.switchDoor());
    }
}

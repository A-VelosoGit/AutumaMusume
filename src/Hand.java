import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.MouseEvent;
import java.awt.Point;

public class Hand {
    // A class for the auto-clicker

    public void clickAt(Point mouseLoc) throws AWTException {
        //move mouse to x, y location and left-click
        Robot mouseBot = new Robot();
        mouseBot.mouseMove(mouseLoc.x, mouseLoc.y);
        mouseBot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
        mouseBot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
    }
}
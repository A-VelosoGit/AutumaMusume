import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.awt.Rectangle;
import java.io.*;
import javax.imageio.ImageIO;

public class App {
    public static void main(String[] args) throws IOException, AWTException {
        Robot robot = new Robot();
        Boolean keepOpen = true;
        Rectangle screen = new Rectangle(0, 0, 1920, 1080);

        while (keepOpen) {
            BufferedImage frame = robot.createScreenCapture(screen);
            File outputfile = new File("image.jpg");
            ImageIO.write(frame, "jpg", outputfile);
            keepOpen = false;
        }
    }
}

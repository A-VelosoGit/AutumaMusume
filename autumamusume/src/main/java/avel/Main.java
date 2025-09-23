package avel;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.awt.Rectangle;
import java.io.*;
import java.util.Collections;
import java.util.List;

import javax.imageio.ImageIO;

import java.awt.Point;

public class Main {
    public static void main(String[] args) throws IOException, AWTException {
        Robot robot = new Robot();
        Rectangle screen = new Rectangle(0, 0, 1920, 1080);

        BufferedImage frame = robot.createScreenCapture(screen);
        File outputfile = new File("image.jpg");
        ImageIO.write(frame, "jpg", outputfile);

        Hand clicker = new Hand();
        Eye detector = new Eye();

        detector.recordTargets(frame);
        Point mouseLoc = detector.findMouseLoc("sample");
        clicker.clickAt(mouseLoc);
    }
}
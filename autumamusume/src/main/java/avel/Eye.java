package avel;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.HashMap;

public class Eye {
     // A class that handles detection of clickable items and returns mouse coordinates for the Hand to click at

     public HashMap<String, Rectangle> targetObjects = new HashMap<>();

     public void recordTargets (BufferedImage bi) {
          //insert image recognition algorithm
          Rectangle sample = new Rectangle(100, 100, 300, 300);

          targetObjects.put("sample", sample);
     }

     public Point findMouseLoc(String targetLabel) {
          //get midpoint (x, y) of targetObject
          Rectangle sample = targetObjects.get(targetLabel);

          int x = sample.x + Math.round(sample.width / 2);
          int y = sample.y + Math.round(sample.height / 2);

          Point mouseLoc = new Point(x, y);

          return mouseLoc;
     }
}
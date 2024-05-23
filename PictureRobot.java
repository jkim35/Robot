import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.*;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File; 
import java.awt.*;
import java.awt.event.InputEvent;
public class PictureRobot {
    public static void main(String[]args) throws Exception{
        Robot picture = new Robot();
        picture.mouseMove(0,1080);
        picture.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        picture.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        picture.delay(500);

        picture.mouseMove(100,700);
        picture.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        picture.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        picture.delay(2000);

        picture.mouseMove(1850,540);
        picture.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        picture.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        picture.delay(500);

        picture.mouseMove(1850,1000);
        picture.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        picture.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        picture.mouseMove(1050,50);
        picture.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        picture.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        picture.delay(2000);

        picture.mouseMove(1050,150);
        picture.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        picture.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        picture.delay(500);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle bounds = new Rectangle(screenSize);
        BufferedImage image= picture.createScreenCapture(bounds); 
        File file = new File("myScreenShot.png");
        ImageIO.write(image,"png", file);
        System.out.println("A screenshot is captured to " + file.getPath()); 
    }
}

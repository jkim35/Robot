import java.awt.*;
import java.awt.event.InputEvent;
public class ApplicationRobot{
    public static void main(String[]args) throws Exception{
        Robot imnotarobot = new Robot();
        imnotarobot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        imnotarobot.delay(25);
    }
}
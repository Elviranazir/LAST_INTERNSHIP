package utilities;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class fileUploadHelper {
    public static void uploadFile(String filePath) {
        try {
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(filePath), null);


            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_META);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_META);
            robot.keyRelease(KeyEvent.VK_TAB);

            robot.keyPress(KeyEvent.VK_META);
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_G);
            robot.keyRelease(KeyEvent.VK_META);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_G);

            Thread.sleep(1000);

            robot.keyPress(KeyEvent.VK_META);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_META);
            robot.keyRelease(KeyEvent.VK_V);

            Thread.sleep(5000);
            robotKeyPress(robot, KeyEvent.VK_ENTER);
            Thread.sleep(1000);
            robotKeyPress(robot, KeyEvent.VK_ENTER);
            Thread.sleep(1000);
            robotKeyPress(robot, KeyEvent.VK_ENTER);
            Thread.sleep(1000);
            robotKeyPress(robot, KeyEvent.VK_ENTER);



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void robotKeyPress(Robot robot, int keyCode) throws InterruptedException {
        robot.keyPress(keyCode);
        robot.delay(100);
        robot.keyRelease(keyCode);
    }
}


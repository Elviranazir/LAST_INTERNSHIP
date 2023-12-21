package utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {

//    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
//    public static ThreadLocal<String> threadBrowserName = new ThreadLocal<>();
public static WebDriver driver;
    public static WebDriver getDriver() {

        if (driver == null) {
//            closePreviousDrivers();
            Logger logger = Logger.getLogger("");
            logger.setLevel(Level.SEVERE);
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        }


        return driver;
    }

//        Locale.setDefault(new Locale("EN"));
//        System.setProperty("user.language", "EN");
//        if (threadBrowserName.get() == null) {
//            threadBrowserName.set("chrome");
//        }
//        if (threadDriver.get() == null) {
//            switch (threadBrowserName.get()) {
//                case "firefox":
//                    threadDriver.set(new FirefoxDriver());
//                    break;
//                case "safari":
//                    threadDriver.set(new SafariDriver());
//                    break;
//                case "edge":
//                    threadDriver.set(new EdgeDriver());
//                    break;
//                default:
//                    threadDriver.set(new ChromeDriver());
//            }
//        }
//        threadDriver.get().manage().window().maximize();
//        threadDriver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
//        return threadDriver.get();
//    }

//    public static void quitDriver() {
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        if (threadDriver.get() != null) {
//            threadDriver.get().quit();
//            WebDriver driver = threadDriver.get();
//            driver = null;
//            threadDriver.set(driver);
//        }
//
//
//
//    }

    public static void quitDriver(){

        if (driver!=null){
            driver.quit();
            driver=null;
        }


    }
}

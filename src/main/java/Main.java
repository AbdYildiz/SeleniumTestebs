import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.driver.chrome","C:\\Users\\Si\\Desktop\\RAZER\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        driver.manage().window().maximize();

        TestScenario1 TS1 = new TestScenario1();
        TS1.testC1(driver);

        TestScenario2 TS2 = new TestScenario2();
        TS2.testC1(driver);
        TS2.testC2(driver);
        TS2.testC3(driver);
        TS2.testC4(driver);
        TS2.testC5(driver);
        TS2.testC6(driver);
        TS2.testC7(driver);
        TS2.testC8(driver);

        TestScenario3 TS3 = new TestScenario3();
        TS3.testC1(driver,js);
        //TS3.testC2(driver);
        //TS3.testC3(driver);
        TS3.testC4(driver,js);
        TS3.testC5(driver,js);
        TS3.testC6(driver,js);
        TS3.testC7(driver,js);
        TS3.testC8(driver,js);
        TS3.testC9(driver,js);
        TS3.testC10(driver,js);
        TS3.testC11(driver);

        TestScenario4 TS4 = new TestScenario4();
        TS4.testC1(driver);

        TestScenario5 TS5 = new TestScenario5();
        TS5.testC1(driver);
    }

}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class googleHelloWorld

{

    public static WebDriver driver;

    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver", "/Users/hannesalazar/Downloads/chromedriver");
        System.out.println("starting selenium web driver");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        try{
            Thread.sleep(2000);
        }catch(Exception e){}

        driver.close();
        driver.quit();
    }
}

package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class DragAndDropUsingFindElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        // Open the drag-and-drop website
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        // Maximize window
        driver.manage().window().maximize();

        // Create Actions class instance
        Actions actions = new Actions(driver);

        // Find all draggable elements (capitals) using their specific classes
        List<WebElement> capitals = driver.findElements(By.className("dragableBox"));

        // Find all droppable elements (countries) using their specific classes
        List<WebElement> countries = driver.findElements(By.className("dragableBoxRight"));

        // Map of capital IDs to country IDs
        Map<String, String> capitalCountryMap = new HashMap<>();
        capitalCountryMap.put("box1", "box101"); 
        capitalCountryMap.put("box2", "box102"); 
        capitalCountryMap.put("box3", "box103"); 
        capitalCountryMap.put("box4", "box104"); 
        capitalCountryMap.put("box5", "box105"); 
        capitalCountryMap.put("box6", "box106"); 
        capitalCountryMap.put("box7", "box107"); 

      
        for (WebElement capital : capitals) 
        {
            String capitalId = capital.getAttribute("id");
            
            if (capitalCountryMap.containsKey(capitalId)) 
            {
                for (WebElement country : countries)
                {
                    String countryId = country.getAttribute("id");

                    if (capitalCountryMap.get(capitalId).equals(countryId)) 
                    {
                        actions.dragAndDrop(capital, country).perform();
                        Thread.sleep(1000);
//                        break;
                    }
                }
            }
        }

        Thread.sleep(2000);
        
        driver.quit();
    }
}

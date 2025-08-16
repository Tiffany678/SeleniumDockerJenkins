package page_objects;

import generic_keywords.WebElementsInteractions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPageObject extends WebElementsInteractions {
    WebDriver driver;

    private final By getTitleOfProductPage = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
     private final By getTextOf1stItem = By.xpath("//*[@id=\"item_4_title_link\"]/div");
  //   private final By getTextOf1stItem = By.xpath("//*[@id=\"item_11111_title_link\"]/div");

    public ProductsPageObject(WebDriver driver) {
        super(driver);
    }


    public String getTitleOfProductPage() {
        return retrieveTextData(getTitleOfProductPage);
    }

    public String getItemName() {
        return retrieveTextData(getTextOf1stItem);
    }
}

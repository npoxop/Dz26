import com.google.common.collect.Ordering;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class HomepageSausedemo {
    private static final By buttonSort = By.className("product_sort_container");
    private static final String filterNameAtoZ = "Name (A to Z)";
    private static final String filterNameZtoA = "Name (Z to A)";
    private static final String filterPriceHighToLow = "Price (high to low)";
    private static final String filterPriceLowToHigh = "Price (low to high)";
    private static final By findedItemsNames = By.className("inventory_item_name");
    private static final By findedItemsPrices = By.className("inventory_item_price");
    private static final By buttonAddSauceLabsBackpack = By.cssSelector("#inventory_container > div > div:nth-child(1) > div.pricebar > button");
    private static final By buttonAddSauceLabsBoltTShirt = By.cssSelector("#inventory_container > div > div:nth-child(3) > div.pricebar > button");
    private static final By buttonGoToCart = By.cssSelector("#shopping_cart_container > a > svg");


    public void selectByVisibleTextAtoZ() {
        Select select = new Select(InitDriver.webDriver.findElement(buttonSort));
        select.selectByVisibleText(filterNameAtoZ);
    }

    public void selectByVisibleTextZtoA() {
        Select select = new Select(InitDriver.webDriver.findElement(buttonSort));
        select.selectByVisibleText(filterNameZtoA);
    }

    public void selectByVisiblePriceHighToLow() {
        Select select = new Select(InitDriver.webDriver.findElement(buttonSort));
        select.selectByVisibleText(filterPriceHighToLow);
    }

    public void selectByVisiblePriceLowToHigh() {
        Select select = new Select(InitDriver.webDriver.findElement(buttonSort));
        select.selectByVisibleText(filterPriceLowToHigh);
    }

    public boolean isSortingByNameAtoZ() {
        List<WebElement> itemsNames = InitDriver.webDriver.findElements(findedItemsNames);
        ArrayList<String> itemsNamesWithText = new ArrayList<String>();
        for (WebElement element : itemsNames) {
            itemsNamesWithText.add(element.getText());
        }
        boolean sorted = Ordering.natural().isOrdered(itemsNamesWithText);
        return sorted;
    }

    public boolean isSortingByNameZtoA() {
        List<WebElement> itemsNames = InitDriver.webDriver.findElements(findedItemsNames);
        ArrayList<String> itemsNamesWithText = new ArrayList<String>();
        for (WebElement element : itemsNames) {
            itemsNamesWithText.add(element.getText());
        }
        boolean sorted = Ordering.natural().reverse().isOrdered(itemsNamesWithText);
        return sorted;
    }

    public boolean isSortingByPriceHighToLow() {

        List<WebElement> itemsNames = InitDriver.webDriver.findElements(findedItemsPrices);
        ArrayList<Double> itemsNamesWithText = new ArrayList<Double>();
        for (WebElement element : itemsNames) {
            itemsNamesWithText.add(Double.parseDouble(element.getText().substring(1)));
        }

        boolean sorted = Ordering.natural().reverse().isOrdered(itemsNamesWithText);
        return sorted;
    }

    public boolean isSortingByPriceLowToHigh() {

        List<WebElement> itemsNames = InitDriver.webDriver.findElements(findedItemsPrices);
        ArrayList<Double> itemsNamesWithText = new ArrayList<Double>();
        for (WebElement element : itemsNames) {
            itemsNamesWithText.add(Double.parseDouble(element.getText().substring(1)));
        }

        boolean sorted = Ordering.natural().isOrdered(itemsNamesWithText);
        return sorted;
    }

    public void addSauceLabsBackpack(){
        InitDriver.webDriver.findElement(buttonAddSauceLabsBackpack).click();
    }

    public void addSauceLabsBoltTShirt(){
        InitDriver.webDriver.findElement(buttonAddSauceLabsBoltTShirt).click();
    }

    public void pressButtonCart(){
        WebElement elem = InitDriver.webDriver.findElement(buttonGoToCart);
        String js = "arguments[0].style.height='auto'; arguments[0].style.visibility='visible';";
        ((JavascriptExecutor) InitDriver.webDriver).executeScript(js, elem);
        elem.click();
    }

}



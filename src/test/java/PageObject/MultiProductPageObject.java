package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MultiProductPageObject extends PageObject{

    @FindBy(xpath = "//body/div[@id='page']/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")
    public WebElement search;

    @FindBy(xpath = "//div[@class='productPane']/div[2]")
    public WebElement soap1;

    @FindBy(xpath = "//div[@class='productPane']/div[8]")
    public WebElement soap2;

    @FindBy(xpath = "//div[@class='productPane']/div[11]")
    public WebElement soap3;

    @FindBy(xpath = "//button[contains(text(),'+')]")
    public WebElement soadAddButton;

    //second part
    @FindBy(xpath = "//body/div[@id='page']/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]")
    public WebElement oilsearch;

    @FindBy(xpath = "//div[@class='productPane']/div[7]")
    public WebElement oil1;

    @FindBy(xpath = "//div[@class='productPane']/div[14]")
    public WebElement oil2;

    public MultiProductPageObject(WebDriver driver) {
        super(driver);
    }
}





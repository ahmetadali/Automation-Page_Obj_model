package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    public HomePage(){

        PageFactory.initElements(driver,this);
    }

    @FindBy(id="nav-hamburger-menu")
    public WebElement amzn_menu_bar;

    @FindBy(xpath = "//a[@data-menu-id='5']")
    public WebElement tablet_btn;

    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[4]/li[10]/a")
    public WebElement all_tablets;


}

package authenticgoods;

import authenticgoods.Navigation.Navigation;
import org.openqa.selenium.By;

public class FormsDrag extends CommonStepDefBasePageObject{
    Navigation navigation = new Navigation();

    public FormsDrag(){
        super();
    }
    public void navigateToDragForms(){
        navigate();
        navigation.pressOnFormDrag();
    }
    public String checkDragHeader(String arg0) {
        By locator = By.xpath("/html/body/section/section/div[1]/div/section/div/div/div/div[1]/h3");
        String text = getClickableElement(locator).getText();
        System.out.println("This is our header: " + text);
        return text;
    }
}

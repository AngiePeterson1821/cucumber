package authenticgoods.Navigation;

import authenticgoods.CommonStepDefBasePageObject;
import org.openqa.selenium.By;

public class Navigation extends CommonStepDefBasePageObject {


        private void pressOnUIElement(){
            getClickableElement(By.cssSelector("a[title='UI Elements']")).click();
        }
        public void pressOnAlerts() {
            pressOnUIElement();
            getClickableElement(By.cssSelector("a[title='Alerts & Notifications']")).click();
        }
        public void pressOnTables(){
            getClickableElement(By.cssSelector("a[title='Tables']")).click();
        }
        public void pressOnDataTables(){
            pressOnTables();
            getClickableElement(By.cssSelector("a[title='Data Tables']")).click();
        }
        public void pressOnForms(){
            getClickableElement(By.xpath("/html/body/section/aside/nav/ul/li[3]/a")).click();
        }
        public void pressOnWizard(){
            pressOnForms();
            getClickableElement(By.xpath("/html/body/section/aside/nav/ul/li[3]/ul/li[4]/a")).click();
        }
        public void pressOnFormComponents(){
            pressOnForms();
            getClickableElement(By.xpath("/html/body/section/aside/nav/ul/li[3]/ul/li[1]/a")).click();
        }
        public void pressOnFormDrag(){
            pressOnForms();
            getClickableElement(By.xpath("/html/body/section/aside/nav/ul/li[3]/ul/li[5]/a")).click();
        }
        public void pressOnSliders(){
            pressOnUIElement();
            getClickableElement(By.xpath("/html/body/section/aside/nav/ul/li[2]/ul/li[2]/a")).click();
        }
        public void pressOnFormValidation(){
            pressOnForms();
            getClickableElement(By.xpath("/html/body/section/aside/nav/ul/li[3]/ul/li[2]/a")).click();
        }
        public void pressOnFormMask(){
            pressOnForms();
            getClickableElement(By.xpath("/html/body/section/aside/nav/ul/li[3]/ul/li[3]/a")).click();
        }
        public void pressOnModals(){
            pressOnUIElement();
            getClickableElement(By.xpath("/html/body/section/aside/nav/ul/li[2]/ul/li[3]/a")).click();
        }
        public void pressOnBasicTables(){
            pressOnTables();
            getClickableElement(By.xpath("/html/body/section/aside/nav/ul/li[4]/ul/li[1]/a")).click();
        }


    }


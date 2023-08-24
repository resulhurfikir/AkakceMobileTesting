package MobileTesting.Utilities;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import java.time.Duration;
import java.util.Collections;
import java.util.List;
import static org.testng.Assert.fail;

public class Methods extends DriverManager{

    public void performScroll(String direction){
        if(direction.equalsIgnoreCase("down")){
            Dimension size = getAppiumDriver().manage().window().getSize();
            int startX = size.getWidth() / 2;
            int startY = (int) (size.getHeight() * 0.8);
            int endX = startX;
            int endY = (int) (size.getHeight() * 0.3);
            swipeWithCoordinates(startX, startY, endX, endY);
        }else if (direction.equalsIgnoreCase("right")){
            Dimension size = getAppiumDriver().manage().window().getSize();
            int startX = (int) (size.getWidth() * 0.9);
            int startY = (int) (size.getHeight() * 0.8);
            int endX = (int) (size.getWidth() * 0.1);
            int endY = startY;
            swipeWithCoordinates(startX, startY, endX, endY);
        } else System.out.println("Invalid direction entered!");
    }


    public void swipeWithCoordinates(int startX, int startY, int endX, int endY){
        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Sequence sequence = new Sequence(finger1, 0)
                .addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
                .addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                .addAction(new Pause(finger1, Duration.ofMillis(750)))
                .addAction(finger1.createPointerMove(Duration.ofMillis(750), PointerInput.Origin.viewport(), endX, endY))
                .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        getAppiumDriver().perform(Collections.singletonList(sequence));
    }


    public void AssertByText(List<WebElement> list, String text){
        boolean flag = false;
        for (WebElement webElement : list) {
            if (webElement.getText().equals(text)) {
                flag = true;
            }
        }
        if (!flag)
            fail("Texts don't Match!");
    }


    public int randomGenerator(int max) {
        return (int) (Math.random() * max);
    }


    public void scrollToElement(List<WebElement> elements){
        while (elements.size()<1){
            performScroll("down");
        }
    }


}

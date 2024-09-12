
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework18 extends BaseTest {

    @Test
    public void playSongTest() {
        login("aaronalbusiness@gmail.com", "te$t$tudent");
        playSong();
        Assert.assertTrue(isSongPlaying());
    }


    public void playSong() {
        WebElement playButton = driver.findElement(By.xpath("//span[@data-testid='playbtn']"));
        WebElement playNextSongButton = driver.findElement(By.xpath("//div[@data-testid=sound-bar-play']"));

        playNextSongButton.click();
    }

    public boolean isSongPlaying() {
        WebElement soundBarPlay = driver.findElement(By.xpath("//div[@data-testid=sound-bar-play']"));

        return soundBarPlay.isDisplayed();

    }

}
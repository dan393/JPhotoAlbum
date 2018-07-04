package fi.iki.jka;

import org.junit.Assert;
import org.junit.Test;

import java.awt.event.ActionEvent;

public class JPhotoFrameTest {
    int intervalTest = 0;

    @Test
    public void actionPerformed_startSlideshow() throws Exception {
        JPhotoFrame jPhotoFrame = new JPhotoFrame(){
           @Override
           public void startSlideshow(int interval) {
               // remember that startSlideshow has been called
               intervalTest = interval;

           }

           @Override
           public void setTitle() {}
       };
       ActionEvent actionEvent = new ActionEvent(new Object(), 0, "Start Slideshow");
       jPhotoFrame.actionPerformed(actionEvent);
       Assert.assertEquals(intervalTest, 5000);

        actionEvent = new ActionEvent(new Object(), 0, "Start Fast Slideshow");
        jPhotoFrame.actionPerformed(actionEvent);
        Assert.assertEquals(intervalTest, 500);

    }
}
import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Assert.*;

@RunWith(JUnit4.class)
public class HomeControllerTest{
    @Test
    public void firstTest(){
        org.junit.Assert.assertEquals("2.5 + 7.5 = 10.0", 2.5 + 7.5, 10.0, .1);
    }
}
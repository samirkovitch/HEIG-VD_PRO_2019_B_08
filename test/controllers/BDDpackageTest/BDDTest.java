import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Assert.*;
import controllers.BDDpackage.BDD;

@RunWith(JUnit4.class)
public class BDDTest{

    @Test
    public void firstTest(){
        // Pas besoin de la connection
        BDD BD = new BDD();
        String userDefault = BD.getUser();
        org.junit.Assert.assertEquals("postgres", userDefault);
    }
}
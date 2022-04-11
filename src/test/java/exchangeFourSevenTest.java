
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class exchangeFourSevenTest {
    @Test
    public void Input7Return4(){
     assertEquals(exchangeFourSeven.fourSeven(7),4);
    }

    @Test
    public void  Input7Return7() {
       assertEquals(exchangeFourSeven.fourSeven(4), 7);
    }
    @Test
    public void  Imput8Return0(){
        assertEquals(exchangeFourSeven.fourSeven(8),0);
    }


}

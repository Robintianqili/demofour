import static org.junit.Assert.*;
import org.junit.*;

public class Junttest{
    @Test
    public void testHello(){
        String a=test.hello();
        assertEquals("Hello Worlds", a);
    }
}
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * test for social class.
 * 
 * @author hannah peluso
 * @version 9-16-20
 */
public class SocialTest {

    /**
     * Test method for distance class.
     */
    @Test
    public void testDistanceReg() {
        int[] s = {0, 0};
        int[] t = {6, 8};
        assertEquals(10.0, Social.distance(s, t), 0.001);

    }

    /**
     * Test method for distance class with zeros.
     */
    @Test
    public void testDistanceZero() {
        int[] s = {0, 0};
        int[] t = {0, 0};
        assertEquals(0.0, Social.distance(s, t), 0.001);

    }
    
    /**
     * Test method for distance class with zeros.
     */
    @Test
    public void testDistance() {
        new Student("HAnnah", 0, 0);
        assertEquals(0.0, Social.distance(s, t), 0.001);

    }

}

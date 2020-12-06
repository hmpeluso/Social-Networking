import static org.junit.Assert.*;
import org.junit.Test;

/**
 * test for Posse class.
 * 
 * @author hannah peluso
 * @version 9-20-20
 */
public class PosseTest {

    /**
     * Test method for {@link Posse#Posse()}.
     */
    @Test
    public void testPosse() {
        Posse posTest = new Posse();
        assertEquals(30, posTest.getMaxSize());
        Student stu = new Student("Hannah");

        assertEquals(true, posTest.add(stu));
        assertEquals(true, posTest.add(stu));
        assertEquals(true, posTest.contains(stu));
        assertEquals(stu, posTest.get("Hannah"));
        assertEquals(stu, posTest.get(0));
        assertEquals(1, posTest.getSize());
        assertEquals(null, posTest.get("hannah"));

    }

    /**
     * Test method for {@link Posse#Posse()}.
     */
    @Test
    public void testPosseNull() {
        // tests cases where student object is null.
        Posse posTest = new Posse();
        // Student stu = null;
        assertEquals(false, posTest.contains(null));
        assertEquals(true, posTest.add(null));
        
        // tests case for name parameter being null.
        String name = null;
        // Student stu4 = new Student(name);
        // assertEquals(false, posTest.add(stu4));
        assertEquals(null, posTest.get(name));
    }
    
    
    
    /**
     * Test method for {@link Posse#Posse()}.
     */
    @Test
    public void testInvalidAndFull() {
        Posse posTest = new Posse(2);
        Student stu = new Student("Hannah");
        Student stu2 = new Student("Mad");
        Student stu3 = new Student("Kate");
        
        posTest.add(stu);
        assertEquals(true, posTest.add(stu));

        posTest.add(stu2);
        assertEquals(false, posTest.add(stu3));
        assertEquals(false, posTest.add(stu));

        assertEquals(null, posTest.get(3));
        assertEquals(null, posTest.get(-2));



    }
    

}

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * test for student class.
 * 
 * @author hannah peluso
 * @version 9-16-20
 */
public class StudentTest {

    
    /**
     * Test method for the standard student functions.
     */
    @Test
    public void testStudentString() {
        Student stu = new Student("Ryan");
        assertEquals("Ryan", stu.getName());
        assertEquals(0, stu.getRow());
        assertEquals(0, stu.getColumn());
        Student stu2 = new Student("Hannah", 2, 2);
        stu.addFriend(stu2);
        Student stu3 = new Student("Ryan");
        assertEquals(true, stu.equals(stu3));
        assertEquals(false, stu.equals(stu2));
    }

    /**
     * Test method for a problematic student.
     */
    @Test
    public void testErrorStudent() {
        Student stu = null;
        Student stu2 = new Student("Hannah");
        stu2.addFriend(stu);
        stu = new Student("Ryan", -3, -2);
        
    }

    /**
     * Test method for unhappiness method.
     */
    @Test
    public void testUnhappiness() {
        Student stu = new Student("Ryan", 0, 0);
        // friendsTest = null;
        Student stu2 = new Student("Hannah", 6, 8);
        stu.addFriend(stu2);
        assertEquals(10.0, stu.unhappiness(), 0.001);

    }

}

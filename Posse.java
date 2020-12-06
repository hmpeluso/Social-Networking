import java.util.ArrayList;

/**
 * PA 2 - Posse class.
 * 
 * @author hannah peluso
 * @version 9-15-20
 * 
 *
 */
public class Posse {

    private int maxSize;
    private ArrayList<Student> members;

    /**
     * constructor for Posse.
     */
    public Posse() {
        this(30);
    }

    /**
     * constructor for Posse.
     * 
     * @param maxSize of posse.
     */
    public Posse(int maxSize) {
        this.maxSize = maxSize;
        this.members = new ArrayList<Student>(this.maxSize);
    }

    /**
     * if posse is not full, and student is not already in posse, add to posse.
     * 
     * @param student to be added to posse.
     * @return true if added or already in posse.
     */
    public boolean add(Student student) {
        boolean res = false;
        if (student == null) {
            return false;
        }
        boolean isFull = this.members.size() == this.maxSize;
        if (isFull) {
            res = false;
        } else if (this.members.contains(student)) {
            res = true;
        } else if (!(this.members.contains(student)) && !isFull) {
            this.members.add(student);
            res = true;
        }
        return res;
    }

    /**
     * confirms or denies if student is in a posse.
     * 
     * @param student in question.
     * @return true if given student is already in posse; false if otherwise,
     *     including null.
     */
    public boolean contains(Student student) {
        if (student == null) {
            return false;
        }
        return this.members.contains(student);
    }

    /**
     * return reference to a student in posse.
     * 
     * @param index of given student if valid.
     * @return student at valid index., otherwise null.
     */
    public Student get(int index) {
        Student stu = null;

        boolean isValid = index >= 0 && index < this.maxSize;
        if (isValid) {
            stu = this.members.get(index);
        }
        return stu;
    }

    /**
     * return reference to a student in posse. assume parameter name is unique.
     * 
     * @param name of student if that student is in members of posse.
     * @return student with name , if valid; otherwise null.
     */
    public Student get(String name) {
        Student res = null;
        if (name == null) {
            return null;
        } else {
            for (Student stu : this.members) {
                if (name.equals(stu.getName())) {
                    res = stu;
                }
            }
        }
        return res;
    }

    /**
     * gets the maxsize of a posse.
     * 
     * @return number of size.
     */
    public int getMaxSize() {
        return this.maxSize;
    }

    /**
     * gets number of student objects currently in the posse.
     * 
     * @return number of students.
     */
    public int getSize() {
        return members.size();
    }

}

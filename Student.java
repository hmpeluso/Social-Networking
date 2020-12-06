/**
 * PA 2 - Student class.
 * 
 * @author hannah peluso
 * @version 9-15-20
 */
public class Student {

    private int[] seat = new int[2];
    private Posse friends;
    private String name;

    /**
     * constructor to initialize each instance variable.
     * 
     * @param name of student.
     */
    public Student(String name) {
        this(name, 0, 0);
        
    }

    /**
     * constructor- one constructor should probably call the other.
     * 
     * @param name of student.
     * @param row location of seat.
     * @param column location of seat.
     */
    public Student(String name, int row, int column) {
        this.name = name;
        this.setRow(row);
        this.setColumn(column);
        this.friends = new Posse();
    }

    /**
     * adds the selected student to the posse named friends. cannot add a
     * student to their own posse.
     * 
     * @param friend being added.
     */
    public void addFriend(Student friend) {
        if (friend != null) {
            this.friends.add(friend);
        }
    }

    /**
     * determines if two students are the same person.
     * 
     * @param obj being compared.
     * @return true if students match.
     */
    public boolean equals(Student obj) {
        boolean res = false;
        if (obj.name.equals(this.name)) {
            res = true;
        }
        return res;
    }

    /**
     * tells the column a student is in.
     * 
     * @return the column number.
     */
    public int getColumn() {
        return this.seat[1];
    }

    /**
     * tells the name of a student.
     * 
     * @return the name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * tells the row a student is in.
     * 
     * @return the row number.
     */
    public int getRow() {
        return this.seat[0];
    }

    /**
     * sets a students column to desired number.
     * 
     * @param column number.
     */
    public void setColumn(int column) {
        this.seat[1] = column;
        if (column < 0) {
            this.seat[1] = 0;
        }
    }

    /**
     * sets a students row to desired number.
     * 
     * @param row number.
     */
    public void setRow(int row) {
        this.seat[0] = row;
        if (row < 0) {
            this.seat[0] = 0;
        }
    }

    /**
     * happiness determined by summed Euclidean distance from student to each of
     * their friends. The further away the friends, the more unhappy.
     * 
     * @return unhappiness in a number.
     */
    public double unhappiness() {
        double level = 0.0;
        
        int[] i = new int[2];
        for (int x = 0; x < friends.getSize(); x++) {
            Student stu = friends.get(x);
            i[0] = stu.getRow();
            i[1] = stu.getColumn();
            level += Social.distance(seat, i);
        }
        return level;
    }

}

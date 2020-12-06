/**
 * PA 2 - Social class.
 * @author hannah peluso
 * @version 9-15-20
 * 
 *
 */
public class Social {
    
    /**
     * method method to calculate euclidean distance between two seats.
     * @param s first seat.
     * @param t second seat.
     * @return distance between two seats.
     */
    public static double distance(int[] s, int[] t) {
        double changerow = s[0] - t[0];
        double changecolumn = s[1] - t[1];
        double res = Math.sqrt((changerow * changerow) 
                + (changecolumn * changecolumn));
        
        return res;
    }
    
    public static void main(String[] args) {
        Student ryan = new Student("Ryan");
        ryan = new Student("Ryan", 0, 1);
        String[] counties = null;
        counties[0] = "Hannah";
        System.out.print(ryan);
        ryan = ryan.equals(false);
        
    }
}

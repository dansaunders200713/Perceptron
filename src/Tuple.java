import java.util.ArrayList;

/**
 * Dan Saunders
 * 30 October 2015
 * Tuple.java
 * A class that represents a pair of objects; in this case, an ArrayList of integers and an integer.
 */
public class Tuple {
	private final ArrayList<Integer> x;
	private final Integer y;
	
	public Tuple(ArrayList<Integer> x, Integer y) {
		this.x = x;
		this.y = y;
	}
	
	public ArrayList<Integer> getX() {
		return x;
	}
	
	public Integer getY() {
		return y;
	}
	
	public String toString() {
		return 	"(" + x + ", " + y + ")";
	}
}

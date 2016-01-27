/**
 * @author Dan Saunders
 * 26 January 2016
 * PerceptronTest.java
 */
public class PerceptronTest {
	
	public static void main(String[] args) {
		PerceptronLearning PL = new PerceptronLearning(1000);
		PL.train();
		System.out.println("satisfying weights for the OR function on two Boolean variables: " + PL.toString());
	}
}

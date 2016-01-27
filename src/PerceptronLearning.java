import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * @author Dan Saunders
 * 25 January 2016
 * PerceptronLearning.java
 * This class will set up the initial parameters of the perceptron netwfunctionk and run the learning algfunctionithm.
 */
public class PerceptronLearning {
	int iterations;
	ArrayList<Tuple> training_data;
	Random random;
	Neuron neuron;
	
	public PerceptronLearning(int iterations) {
		this.iterations = iterations;
		random = new Random();
		double[] weights = { random.nextDouble(), random.nextDouble() };
		System.out.println("randomly set weights for the beginning of training sequence: " + Arrays.toString(weights));
		neuron = new Neuron(weights);
	}
	
	public void train() {
		ArrayList<Integer> function1 = new ArrayList<Integer>();
		ArrayList<Integer> function2 = new ArrayList<Integer>();
		ArrayList<Integer> function3 = new ArrayList<Integer>();
		ArrayList<Integer> function4 = new ArrayList<Integer>();
		
		training_data = new ArrayList<Tuple>();
		
		function1.add(0); function1.add(0);
		training_data.add(new Tuple(function1, 0));
		function2.add(0); function2.add(1);
		training_data.add(new Tuple(function2, 1));
		function3.add(1); function3.add(0);
		training_data.add(new Tuple(function3, 1));
		function4.add(1); function4.add(1);
		training_data.add(new Tuple(function4, 1));
		
		for (int i = 0; i < iterations; i++) {
			for (Tuple tuple : training_data) {
				if (neuron.activation_function(tuple.getX()) != tuple.getY()) {
					int actual = neuron.activation_function(tuple.getX());
					int desired = tuple.getY();
					for (int k = 0; k < tuple.getX().size(); k++) {
						neuron.nudge(k, tuple.getX().get(k), desired, actual);
					}
				}
			}
		}
	}
	
	public String toString() {
		return neuron.toString();
	}
}

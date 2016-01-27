import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Dan Saunders
 * 25 January 2016
 * Neuron.java
 * This class represents the simplistic model of a single neuron. It has inputs x_1, ..., x_n with weights
 * w_1, ..., w_n. The weighted sum of these inputs is passed through a step function f (typically a Heaviside step function),
 * where f(s) = 1 if s >= 0, and f(s) = 0 otherwise.
 */

public class Neuron {
	double[] weights;
	double eta = 0.1;
	
	public Neuron (double[] weights) {
		this.weights = weights;
	}
	
	public int activation_function(ArrayList<Integer> inputs) {
		double sum = 0.0;
		for (int i = 0; i < inputs.size(); i++) {
			sum += inputs.get(i) * weights[i];
		}
		if (sum >= 1) return 1;
		return 0;
	}
	
	public void nudge(int index, int input, int desired, int actual) {
		weights[index] = weights[index] + ((desired - actual) * eta * input); 
	}
	
	public String toString() {
		return Arrays.toString(weights);
	}
}

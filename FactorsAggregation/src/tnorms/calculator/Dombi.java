package tnorms.calculator;

import tnorms.TNormCalculator;
import tnorms.TNormsCalculator;

public class Dombi implements TNormCalculator{

	private double lambda;
	
	public Dombi(double lambda) {
		this.lambda=lambda;
	}
	
	@Override
	public double calculate(double x, double y) {
		return TNormsCalculator.dombi(x, y, lambda);
	}

}

package tnorms.calculator;

import tnorms.TNormCalculator;
import tnorms.TNormsCalculator;

public class Hamacher implements TNormCalculator{

	private double lambda;
	
	public Hamacher(double lambda) {
		this.lambda=lambda;
	}
	
	@Override
	public double calculate(double x, double y) {
		return TNormsCalculator.hamacher(x, y, lambda);
	}

}

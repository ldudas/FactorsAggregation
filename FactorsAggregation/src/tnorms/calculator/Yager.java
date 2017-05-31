package tnorms.calculator;

import tnorms.TNormCalculator;
import tnorms.TNormsCalculator;

public class Yager implements TNormCalculator{

	private double lambda;
	
	public Yager(double lambda) {
		this.lambda=lambda;
	}
	
	@Override
	public double calculate(double x, double y) {
		return TNormsCalculator.yager(x, y, lambda);
	}

}

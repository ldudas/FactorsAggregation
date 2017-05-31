package tnorms.calculator;

import tnorms.TNormCalculator;
import tnorms.TNormsCalculator;

public class Frank implements TNormCalculator{

	private double lambda;
	
	public Frank(double lambda) {
		this.lambda=lambda;
	}
	
	@Override
	public double calculate(double x, double y) {
		return TNormsCalculator.frank(x, y, lambda);
	}

}

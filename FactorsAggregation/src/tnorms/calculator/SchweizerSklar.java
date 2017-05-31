package tnorms.calculator;

import tnorms.TNormCalculator;
import tnorms.TNormsCalculator;

public class SchweizerSklar implements TNormCalculator{

	private double lambda;
	
	public SchweizerSklar(double lambda) {
		this.lambda=lambda;
	}
	
	@Override
	public double calculate(double x, double y) {
		return TNormsCalculator.schweizerSklar(x, y, lambda);
	}

}

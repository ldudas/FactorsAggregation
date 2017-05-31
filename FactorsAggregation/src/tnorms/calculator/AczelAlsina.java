package tnorms.calculator;

import tnorms.TNormCalculator;
import tnorms.TNormsCalculator;

public class AczelAlsina implements TNormCalculator{

	private double lambda;
	
	public AczelAlsina(double lambda) {
		this.lambda=lambda;
	}
	
	@Override
	public double calculate(double x, double y) {
		return TNormsCalculator.aczelAlsina(x, y, lambda);
	}

}

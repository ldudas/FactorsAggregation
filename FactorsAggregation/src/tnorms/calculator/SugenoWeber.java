package tnorms.calculator;

import tnorms.TNormCalculator;
import tnorms.TNormsCalculator;

public class SugenoWeber implements TNormCalculator{

	private double lambda;
	
	public SugenoWeber(double lambda) {
		this.lambda=lambda;
	}
	
	@Override
	public double calculate(double x, double y) {
		return TNormsCalculator.sugenoWeber(x, y, lambda);
	}

}

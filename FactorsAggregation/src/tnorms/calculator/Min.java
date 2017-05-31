package tnorms.calculator;

import tnorms.TNormCalculator;
import tnorms.TNormsCalculator;

public class Min implements TNormCalculator{
	
	@Override
	public double calculate(double x, double y) {
		return TNormsCalculator.min(x, y);
	}

}

package tnorms.calculator;

import tnorms.TNormCalculator;
import tnorms.TNormsCalculator;

public class DrasticProduct implements TNormCalculator{
	
	@Override
	public double calculate(double x, double y) {
		return TNormsCalculator.drasticProduct(x, y);
	}

}

package tnorms.calculator;

import tnorms.TNormCalculator;
import tnorms.TNormsCalculator;

public class Product implements TNormCalculator{
	
	@Override
	public double calculate(double x, double y) {
		return TNormsCalculator.product(x, y);
	}

}

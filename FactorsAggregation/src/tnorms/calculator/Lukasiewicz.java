package tnorms.calculator;

import tnorms.TNormCalculator;
import tnorms.TNormsCalculator;

public class Lukasiewicz implements TNormCalculator{
	
	@Override
	public double calculate(double x, double y) {
		return TNormsCalculator.lukasiewicz(x, y);
	}

}

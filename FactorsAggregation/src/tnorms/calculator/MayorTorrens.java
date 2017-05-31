package tnorms.calculator;

import tnorms.TNormCalculator;
import tnorms.TNormsCalculator;

public class MayorTorrens implements TNormCalculator{
	
	private double lambda;
	
	public MayorTorrens(double lambda) {
		this.lambda=lambda;
	}
	
	@Override
	public double calculate(double x, double y) {
		return TNormsCalculator.mayorTorrens(x, y, lambda);
	}

}

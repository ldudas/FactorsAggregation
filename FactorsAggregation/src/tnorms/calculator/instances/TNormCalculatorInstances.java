package tnorms.calculator.instances;

import tnorms.TNormCalculator;
import tnorms.calculator.AczelAlsina;
import tnorms.calculator.Dombi;
import tnorms.calculator.DrasticProduct;
import tnorms.calculator.Frank;
import tnorms.calculator.Hamacher;
import tnorms.calculator.Lukasiewicz;
import tnorms.calculator.MayorTorrens;
import tnorms.calculator.Min;
import tnorms.calculator.Product;
import tnorms.calculator.SchweizerSklar;
import tnorms.calculator.SugenoWeber;
import tnorms.calculator.Yager;

public class TNormCalculatorInstances {
	
	public static TNormCalculator[] INSTANCES =
		{
				new Min(),
				new Product(),
				new Lukasiewicz(),
				new DrasticProduct(),
				new AczelAlsina(0.75),
				new AczelAlsina(2.0),
				new AczelAlsina(10.0),
				new Dombi(0.5),
				new Dombi(1),
				new Dombi(10),
				new Frank(0.000000001),
				new Frank(100.0),
				new Frank(1000000000.0),
				new Hamacher(0.0),
				new Hamacher(2.0),
				new Hamacher(10.0),
				new MayorTorrens(0.2),
				new MayorTorrens(0.5),
				new MayorTorrens(0.9),
				new SchweizerSklar(-10.0),
				new SchweizerSklar(0.5),
				new SchweizerSklar(5.0),
				new SugenoWeber(-0.5),
				new SugenoWeber(5.0),
				new SugenoWeber(100.0),
				new Yager(0.5),
				new Yager(2.0),
				new Yager(5.0)
		};

}

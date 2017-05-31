package tnorms;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		double[] wnmsJKCzwor = {0.44,0.45,0.61,0.54};
		double[] lovettsJKCzwor = {0.5,0.5,0.5,0.5};
		
		TNormsResults resJKCzwor = new TNormsResults("jk_czwor.txt", wnmsJKCzwor, lovettsJKCzwor);
		try {
			resJKCzwor.calcFactor();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//////////////////
		
		double[] wnmsJKPoœl = {0.55,0.47,0.51,0.49};
		double[] lovettsJKPoœl = {0.33,0.33,0.33,0.33};
		
		TNormsResults resJKPoœl = new TNormsResults("jk_poœl.txt", wnmsJKPoœl, lovettsJKPoœl);
		try {
			resJKPoœl.calcFactor();
		} catch (IOException e) {
			e.printStackTrace();
		}
		///////////////////////
		double[] wnmsPTCzwor = {0.53,0.48,0.41,0.68,0.77};
		double[] lovettsPTCzwor = {0.167,0.167,0.167,0.167,0.167};
		
		TNormsResults resPTCzwor = new TNormsResults("pt_czwor.txt", wnmsPTCzwor, lovettsPTCzwor);
		try {
			resPTCzwor.calcFactor();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//////////////////////////
		double[] wnmsPTPoœl = {0.69,0.74,0.5,0.81,0.8};
		double[] lovettsPTPoœl = {0.1,0.1,0.1,0.1,0.1};
		
		TNormsResults resPTPoœl = new TNormsResults("pt_poœl.txt", wnmsPTPoœl, lovettsPTPoœl);
		try {
			resPTPoœl.calcFactor();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}

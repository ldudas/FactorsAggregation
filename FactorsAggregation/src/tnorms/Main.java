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
		
		double[] wnmsJKPo�l = {0.55,0.47,0.51,0.49};
		double[] lovettsJKPo�l = {0.33,0.33,0.33,0.33};
		
		TNormsResults resJKPo�l = new TNormsResults("jk_po�l.txt", wnmsJKPo�l, lovettsJKPo�l);
		try {
			resJKPo�l.calcFactor();
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
		double[] wnmsPTPo�l = {0.69,0.74,0.5,0.81,0.8};
		double[] lovettsPTPo�l = {0.1,0.1,0.1,0.1,0.1};
		
		TNormsResults resPTPo�l = new TNormsResults("pt_po�l.txt", wnmsPTPo�l, lovettsPTPo�l);
		try {
			resPTPo�l.calcFactor();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}

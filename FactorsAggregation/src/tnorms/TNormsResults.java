package tnorms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import tnorms.calculator.instances.TNormCalculatorInstances;

public class TNormsResults {
	
	private double[] wnms;
	private double[] lovetts;
	private String filename;
	
	public TNormsResults(String filename, double[] wnms, double[] lovetts) {
		this.wnms=wnms;
		this.lovetts=lovetts;
		this.filename=filename;
	}
	
	public void calcFactor() throws IOException{
		double[][] allTnormsResults = new double[TNormCalculatorInstances.INSTANCES.length][wnms.length];
		for(int j=0; j<TNormCalculatorInstances.INSTANCES.length;j++){
			for(int i=0;i<wnms.length;i++){
				allTnormsResults[j][i] = TNormCalculatorInstances.INSTANCES[j].calculate(wnms[i], lovetts[i]);
			}
		}
		
		saveResults(allTnormsResults);
	}

	private void saveResults(double[][] x) throws IOException {
	  BufferedWriter outputWriter = new BufferedWriter(new FileWriter(filename));
	  for (int i = 0; i < x.length; i++) {
		outputWriter.write(TNormCalculatorInstances.INSTANCES[i].getClass().getSimpleName());
		outputWriter.newLine();
	    for(int j=0;j<x[0].length;j++){
		    outputWriter.write(Double.toString(x[i][j]).replace('.', ','));
		    outputWriter.newLine();
	    }
	    outputWriter.newLine();
	    outputWriter.newLine();
	    outputWriter.newLine();
	  }
	  
	  outputWriter.flush();  
	  outputWriter.close();  
	}

}

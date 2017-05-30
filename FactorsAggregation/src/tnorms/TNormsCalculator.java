package tnorms;

public abstract class TNormsCalculator {
	
	public static double min(double x, double y){
		return Math.min(x, y);
	}
	
	public static double product(double x, double y){
		return x * y;
	}
	
	public static double lukasiewicz(double x, double y){
		return Math.max(x+y-1.0,0);
	}
	
	public static double drasticProduct(double x, double y){
		if(x==1.0) return y;
		if(y==1.0) return x;
		return 0.0;
	}
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @param lambda >=0
	 * @return
	 */
	public static double aczelAlsina(double x, double y, double lambda){
		if (lambda==0.0){
			return drasticProduct(x, y);
		}
		return Math.exp( Math.pow(-(Math.pow(-Math.log(x),lambda) + Math.pow(-Math.log(y),lambda)),1.0/lambda ) );
	}
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @param lambda >=0
	 * @return
	 */
	public static double dombi(double x, double y, double lambda){
		if (lambda==0.0){
			return drasticProduct(x, y);
		}
		return 1.0 / ( 1.0 + Math.pow( Math.pow( (1.0-x)/x, lambda) + Math.pow((1.0-y)/y, lambda) , 1.0/lambda) );
	}
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @param lambda >=0
	 * @return
	 */
	public static double frank(double x, double y, double lambda){
		if (lambda==0.0){
			return min(x, y);
		} else if (lambda==1.0){
			return product(x, y);
		}
		return logb(1+(((Math.pow(lambda, x)-1.0)*(Math.pow(lambda, y)-1.0))/(lambda-1)), lambda);
	}
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @param lambda >=0
	 * @return
	 */
	public static double hamacher(double x, double y, double lambda){
		if(x==0.0 && y==0.0 && lambda==0.0){
			return 0.0;
		}
		return (x*y)/(lambda+(1.0-lambda)*(x+y-x*y));
	}
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @param lambda >=0 && <=1
	 * @return
	 */
	public static double mayorTorrens(double x, double y, double lambda){
		if(lambda>0.0 && lambda<=1.0 && x<=lambda && y<=lambda){
			return Math.max(x+y-lambda, 0);
		}
		return min(x,y);
	}
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @param lambda (-inf,inf)
	 * @return
	 */
	public static double schweizerSklar(double x, double y, double lambda){
		if(lambda==0.0){
			return product(x, y);
		}
		return Math.pow( Math.max(Math.pow(x, lambda) + Math.pow(y,lambda) - 1.0, 0.0) , 1.0/lambda);
	}
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @param lambda >=-1
	 * @return
	 */
	public static double sugenoWeber(double x, double y, double lambda){
		if(lambda==-1.0){
			return drasticProduct(x, y);
		}
		return Math.max((x+y-1+lambda*x*y)/(1.0+lambda),0.0);
	}
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @param lambda >=0
	 * @return
	 */
	public static double yager(double x, double y, double lambda){
		if(lambda==0.0){
			return drasticProduct(x, y);
		}
		return Math.max(1.0-Math.pow(Math.pow(1.0-x, lambda)+Math.pow(1.0-y, lambda), 1.0/lambda), 0.0);
	}
	
	
	private static double logb( double x, double base )
	{
		return Math.log(x) / Math.log(base);
	}

}

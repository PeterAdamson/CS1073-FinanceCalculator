//*@auhors Kyle Sutherland, Peter Adamson */

public class FinanceCalculator{

	public double rate;
        private double FV;

	FinanceCalculator(double R){
		rate = R;	
	}
	
	public double futureValue(double PV, int Y){

	    FV = PV * Math.pow((1 + rate/100),Y);
	    return FV;
	}
}

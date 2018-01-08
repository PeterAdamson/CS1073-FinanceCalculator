//*@authors Kyle Sutherland and Peter Adamson */

public class UIDriver{

	public static void main(String[] args) {

	    FinanceCalculator f = new FinanceCalculator(1);
	    FinanceCalculator c = new FinanceCalculator(5);
	    UserInterface ui = new UserInterface();
	    double PV = ui.promptForPV();
	    int Y = ui.promptForY();
	    System.out.println("For R=" + f.rate + ", PV=" + PV + ", FV =" + f.futureValue(PV, Y));
	    System.out.println("For R=" + c.rate + ", PV=" + PV + ", FV=" + c.futureValue(PV, Y));
		
	}

}

//*@authors Kyle Sutherland, Peter Adamson */

public class CalculatorDriver{

	public static void main(String[] args) {
	
		FinanceCalculator f = new FinanceCalculator(1);
		FinanceCalculator c = new FinanceCalculator(5);

		System.out.println("Future Value of Condition 1 and R = 1 " + f.futureValue(100,5));
		System.out.println("Future Value of Condition 1 and R = 5 " + c.futureValue(100,5));

		System.out.println("Future Value of Condition 2 and R = 1 " + f.futureValue(100,25));
		System.out.println("Future Value of Condition 2 and R = 5 " + c.futureValue(100,25));

		System.out.println("Future Value of Condition 3 and R = 1 " + f.futureValue(1000,5));
		System.out.println("Future Value of Condition 3 and R = 5 " + c.futureValue(1000,5));

		System.out.println("Future Value of Condition 4 and R = 1 " + f.futureValue(1000,25));
		System.out.println("Future Value of Condition 4 and R = 5 " + c.futureValue(1000,25));
	}

}

// Computes the future value of a saving investment.
public class FVCalc
 {
	public static void main(String[] args)
	{
		double currentValue = Double.parseDouble(args[0]);
		double rate =  Double.parseDouble(args[1]);
		double year = Double.parseDouble(args[2]);
		double power= Math.pow(1 + rate,year);
		double futureValue = currentValue*power;

		System.out.println("after "+ year + " years" + " " + currentValue + "$" +" "+"saved at" + rate +" "+ "will yield $"+ futureValue);



		// Replace this comment with your code
	}
}
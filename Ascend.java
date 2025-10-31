// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) 
	{
		
		int lim= Integer.parseInt(args[0]);
		int a = (int)(Math.random()*lim);
		 int b = (int)(Math.random()*lim);
		 int c = (int)(Math.random()*lim);

		 System.out.println(a+" "+b+" "+c);

		 int min = Math.min(a,b);
		 int minx= Math.min(min,c);
		 int max= Math.max(a,b);
		 int maxx= Math.max(max,c);
		 int middle= a+b+c-(maxx+minx);
		 
		 System.out.println(minx+ " " +middle+" "+ maxx);


		 


		// Replace this comment with your code
	}
}

package encapsulationdemo;

import accessspecifiersdemo.publicdemo;

public class HDFCExecutor {

	public static void main(String[] args) {
		HDFC h=new HDFC();
		
		
		//setters method is used for a to set a value
		h.setAmount(84760);
		//getter method is used to return a value
		System.out.println("The amount is: "+h.getAmount());
		
		
		//Driver code for PublicDemo class
		/*if any data member is declared as public we can access
		anywhere*/
		publicdemo p=new publicdemo();
		p.print(4376.98);

	}
}

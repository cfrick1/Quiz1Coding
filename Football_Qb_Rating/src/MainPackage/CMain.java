package MainPackage;

import java.util.Scanner;

public class CMain {

	public static double mm(double x) {
		if ((x <= 2.375) && (x >= 0))
			return x;
		else if (x > 2.375) 
			return 2.375;
		else
			return 0;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("TD: ");
		double TD = input.nextInt();
		System.out.println("COMP: ");
		double COMP = input.nextInt();
		System.out.println("YDS: ");
		double YDS = input.nextInt();
		System.out.println("INT: ");
		double INT = input.nextInt();
		System.out.println("ATT: ");
		double ATT = input.nextInt();
		input.close();
		
		
		double a = ((COMP / ATT) - 0.3) * 5;
		double b = ((YDS / ATT) - 3) * 0.25;
		double c = (TD / ATT) * 20;
		double d = 2.375 - ((INT / ATT) *25);
		double Qb_Rating = ((mm(a) + mm(b) + mm(c) + mm(d))/6)*(100);
		System.out.println("The QB rating is: " + Qb_Rating);

	}
}
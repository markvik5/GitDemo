package Program;

import java.awt.font.NumericShaper;
import java.util.Scanner;

public class Day_1 {

	public void program1(int age) {
		System.out.println("Hello ! your age is: " + age);
	}

	public void program2() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = s.nextLine();
		System.out.println("Enter your age: ");
		int age = s.nextInt();
		System.out.println("Enter your mobile number: ");
		long mobile_number = s.nextLong();
		System.out.println("Enter your height: ");
		double height = s.nextDouble();
		System.out.println("Enter address: ");
		String address = s.next();

		System.out.println("Hi " + name + "\nyour age:" + age + "\nyour mobile number " + mobile_number + "\n"
				+ "your height: " + height + "\n" + "Your address " + address);
		s.close();

	}

	public void check_Number_odd_Even(int number) {
		if (number % 2 == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}
	}

	public void check_Number_odd_Even_without_if_else(int number) {
		String st[] = { "Even", "odd" };
		System.out.println(number + " is " + st[number % 2]);
		System.out.println("GIt check");
	}

}

package stupidPackage;

import java.util.Random;

public class DmvSimulator {

	public static void main(String[] args) {

		// welcome
		System.out.println("Welcome to the DMV! You will be assigned a number 1 to 100.");
		System.out.println("When your number is called, come to the desk for assitance.");

		// create random and random number
		Random random = new Random();
		int number = random.nextInt((100 - 1) + 1) - 1;
		int startOver = 1;
		System.out.println("Your number is " + number + ".");
		System.out.println(" ");

		// call numbers
		for (int i = 1; i < 101; i++) {
			if ((number + i) < 101) {
				System.out.println(number + i + "!");
				// pause to simulate wait at DMV
				try {
					java.util.concurrent.TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			} else {
				System.out.println(startOver++ + "!");
				// pause to simulate wait at DMV
				try {
					java.util.concurrent.TimeUnit.SECONDS.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

		System.out.println(" ");
		System.out.println("You don't have the necessary paperwork. Why are you wasting my time? " +
				"\nYour entire life is a waste of time. Get outta here and never come back");
	}

}

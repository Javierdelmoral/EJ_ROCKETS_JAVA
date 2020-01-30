package Fase3_prueba;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_Cohetes_Fase3_prueba {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int chooseRocket;

		boolean drive = true;

		// code rocket
		String code1 = "LDSFJA32";
		String code2 = "XCVB564B";

		// create rocket
		Rocket rocket1 = new Rocket(code1);
		Rocket rocket2 = new Rocket(code2);

		// create thrusters for rocket 1
		System.out.println("How many thrusters do you want in " + rocket1.getCode() + "?");

		int numOfThrus1 = sc.nextInt();

		createThrusters(rocket1, numOfThrus1);

		// create thrusters for rocket 2
		System.out.println("How many thrusters do you want in " + rocket2.getCode() + "?");

		int numOfThrus2 = sc.nextInt();

		createThrusters(rocket2, numOfThrus2);

		//powering and stopping each thruster of each rocket
		do {

			System.out.println("What rocket do you want to power? 1 or 2?");
			chooseRocket = sc.nextInt();

			if (chooseRocket == 1) {

				rocket1.accelerate();

				System.out.println("Now, do you want to stop it? (yes or no)");
				String stop = sc.next().toLowerCase();

				if (stop.equalsIgnoreCase("yes")) {
					rocket1.stop();

				} else if (stop.equalsIgnoreCase("no")) {
					System.out.println("Ok... Straight to the sun!");

				}

				System.out.println("Do you want to keep powering any rocket?(yes or no)");
				String keepPowering = sc.next().toLowerCase();
				if (keepPowering.equalsIgnoreCase("yes")) {

				} else if (keepPowering.equalsIgnoreCase("no")) {
					drive = false;

				}

			} else if (chooseRocket == 2) {

				rocket2.accelerate();

				System.out.println("Now, do you want to stop it?(yes or no)");
				String stop = sc.next().toLowerCase();

				if (stop.equalsIgnoreCase("yes")) {
					rocket2.stop();

				} else if (stop.equalsIgnoreCase("no")) {
					System.out.println("Ok... Straight to the sun!");

				}

				System.out.println("Do you want to keep powering any rocket?(yes or no)");
				String keepPowering = sc.next().toLowerCase();
				if (keepPowering.equalsIgnoreCase("yes")) {

				} else if (keepPowering.equalsIgnoreCase("no")) {
					drive = false;

				}

			} else {
				System.out.println("That rocket doesn't exists!");
			}

		} while (drive == true);

		//show rockets info
		System.out.println("Cohete 1: " + rocket1.toString() + "\n" + "Cohete 2: " + rocket2.toString());

		sc.close();

	}

	//method to create each thruster and add all to the list
	public static Thruster createThrusters(Rocket rocket, int numOfThrus) {

		Thruster thruster = null;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < numOfThrus; i++) {
			System.out
					.println("What is the id of thruster number " + (i + 1) + " of rocket " + rocket.getCode() + " ?");
			String id = sc.next();

			System.out.println(
					"What is the max power of thruster number " + (i + 1) + " of rocket " + rocket.getCode() + " ?");
			int maxPower = sc.nextInt();

			System.out.println("What is your desired power for thruster num " + (i + 1) + " of rocket "
					+ rocket.getCode() + " ? Max is " + maxPower);
			int desPower = sc.nextInt();
			if (maxPower < desPower) {
				System.out.println("The desired power will be reduced due to the max power of this thruster!");
			}

			thruster = new Thruster(id, maxPower, desPower, 0);

			rocket.AddThruster(thruster);

		}

		return thruster;

	}

}

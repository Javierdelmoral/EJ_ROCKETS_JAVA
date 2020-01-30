package Fase2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_Cohetes_Fase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner sc = new Scanner(System.in);

		// code rockets
		String code1 = "LDSFJA32";

		String code2 = "32WESSDS";

		int power;

		// create rockets
		Cohete cohete1 = new Cohete(code1);

		Cohete cohete2 = new Cohete(code2);

		// create and add propulsores to list
		Propulsor prop;

		for (int i = 0; i < 3; i++) {
			
			power = 0;

			switch (i) {
			case 0:

				power = 10;

				break;

			case 1:

				power = 30;

				break;
				
			case 2:
				
				power = 80;
				
				break;
				
			}
			prop = new Propulsor("propulsor" + (i + 1), power);

			cohete1.getListaProp().add(prop);
			

		}

		for (int i = 0; i < 6; i++) {

			power = 0;

			switch (i) {
			case 0:

				power = 30;

				break;

			case 1:

				power = 40;

				break;

			case 2:
			case 3:

				power = 50;

				break;

			case 4:

				power = 30;

				break;

			case 5:

				power = 10;

				break;

			default:
				break;
			}

			prop = new Propulsor("propulsor" + (i + 1), power);

			cohete2.getListaProp().add(prop);

		}

		System.out.println("Cohete 1: " + cohete1.toString() + "\n" + "Cohete 2: " + cohete2.toString());

	}

}

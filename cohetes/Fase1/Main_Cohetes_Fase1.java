package Fase1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_Cohetes_Fase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner sc = new Scanner(System.in);

		//code rockets
		String code1 = "LDSFJA32";

		String code2 = "x";
				
		// create rockets
		Cohete cohete1 = new Cohete(code1/*, listaCohete1*/);

		Cohete cohete2 = new Cohete(code2/*, listaCohete2*/);

		//create and add propulsores to list
		Propulsor prop;

		for (int i = 0; i < 3; i++) {

			prop = new Propulsor("propulsor" + (i + 1));
			
			//listaCohete1.add(prop);

			cohete1.getListaProp().add(prop);

		}

		for (int i = 0; i < 6; i++) {

			prop = new Propulsor("propulsor" + (i + 1));
			
			//listaCohete2.add(prop);

			cohete2.getListaProp().add(prop);

		}

		System.out.println("Cohete 1: " + cohete1.toString() + "\n" + "Cohete 2: " + cohete2.toString());

	}

}






/*
 * 
		//list of propellers
		//List<Propulsor> listaCohete1 = new ArrayList<Propulsor>();
		
		//List<Propulsor> listaCohete2 = new ArrayList<Propulsor>();



 * 
 */



package Fase3_prueba;

import java.util.ArrayList;
import java.util.List;

public class Thruster implements Runnable {

	public String id;
	public int maxPower;
	public int currPower; 
	public int desPower;
	Thread threadAcc;
	Thread threadStop;

	public Thruster(String id, int maxPower, int desPower, int currPower) {

		this.id = id;
		this.maxPower = maxPower;
		this.desPower = desPower;
		this.currPower = currPower;

	}

	public String getIdThruster() {
		return id;
	}

	public int getMaxPower() {
		return maxPower;
	}

	public int getDesPower() {
		return desPower;
	}

	public int getCurrPower() {
		return currPower;
	}


	@Override
	public String toString() {
		return "Thruster [id=" + id + ", maxPower=" + maxPower + ", currPower=" + currPower + ", desPower=" + desPower
				+ "]";
	}

	// thrusters accelerate or brake
	@Override
	public void run() {

		if (this.currPower == 0) {
			do {
				if (this.desPower > this.maxPower) {
					this.desPower--;
				}

				if (this.currPower < this.maxPower) {
					this.currPower++;
				} else if (this.currPower >= this.maxPower) {
					this.currPower--;
				}
			} while (this.currPower < this.desPower);

		} else {
			do {
				this.currPower--;

			} while (this.currPower > 0);

		}

		System.out.println("Thruster number " + this.getIdThruster() + " with [ max power --> " + this.getMaxPower()
				+ ", desired Power --> " + this.getDesPower() + " and current Power --> " 
				+ this.getCurrPower() + "]");

	}

}


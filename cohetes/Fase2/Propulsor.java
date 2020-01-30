package Fase2;

import java.util.ArrayList;
import java.util.List;

public class Propulsor {

	public String name;
	public int power;

	public Propulsor(String name, int power) {

		this.name = name;
		this.power = power;

	}

	public String getProp() {

		return name;

	}

	public void setProp() {

		this.name = name;

	}

	public int getPower() {

		return power;

	}

	@Override
	public String toString() {
		return "[" + this.getProp() + " with max power " + this.getPower() + "]";
	}

}

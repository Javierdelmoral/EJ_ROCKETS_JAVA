package Fase1;

import java.util.ArrayList;
import java.util.List;

public class Propulsor {

	public String name;

	public Propulsor(String name) {

		this.name = name;

	}

	public String getProp() {

		return name;

	}

	public void setProp() {

		this.name = name;

	}


	@Override
	public String toString() {
		return "Propulsor: [" + this.getProp() + "]";
	}

}

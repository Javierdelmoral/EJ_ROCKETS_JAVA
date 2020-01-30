package Fase3_prueba;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rocket {

	public String code;
	public List<Thruster> listThrus = new ArrayList<Thruster>();

	public Rocket(String code) {

		this.code = code;
	}

	// getters & setters
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<Thruster> getListThrus() {
		return listThrus;
	}
	
	//add thrusters	
	public boolean AddThruster(Thruster addThruster) {
		boolean result = false;
		
		int sizeBefore = this.getListThrus().size();
		
		this.getListThrus().add(addThruster);
		
		if(this.getListThrus().size()>sizeBefore)
			result = true;
		else
			result = false;
		
		return result;
	}	
	
	
	// methods to accelerate and brake
	public void accelerate() {
						
		for (int i = 0; i < listThrus.size(); i++) {
			
			listThrus.get(i).run();
						
		}
		
	}
	
	public void stop() {
		
		for (int i = 0; i < listThrus.size(); i++) {
			
			listThrus.get(i).run();
			
		}
		
	}
	
	@Override
	public String toString() {
		return "Cohete [code = " + this.getCode() + ", lista de propulsores = " + this.getListThrus() + "]";
	}

}

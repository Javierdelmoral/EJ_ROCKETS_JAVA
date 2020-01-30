package Fase2;

import java.util.ArrayList;
import java.util.List;

public class Cohete {

	public String code;
	public List<Propulsor> listaProp = new ArrayList<Propulsor>();


	public Cohete(String code/*, List<Propulsor> listaProp*/) {

		this.code = code;
		//this.listaProp = listaProp;  

	}

	public String getCode() {

		return code;

	}

	public void setCode(String code) {

		this.code = code;

	}

	public List<Propulsor> getListaProp() {

		return listaProp;

	}

	public void setListaProp(List<Propulsor> listaProp) {

		this.listaProp = listaProp;

	}

	@Override
	public String toString() {
		return "Cohete [code = " + this.getCode() + ", lista de propulsores = " + this.getListaProp() + "]";
	}

}

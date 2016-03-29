package naz.olivepress.press;

import java.util.ArrayList;

import naz.olivepress.olives.Olive;

public class OlivePress {
	
	public OlivePress(){
		
	}
	
	public void getOil(ArrayList<Olive> olives){
		
		int oil = 0;
		
		for (Olive olive : olives){
			oil += olive.crush();
		}
		
		System.out.println("You got " + oil + " units of oil");
	}

}

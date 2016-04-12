package naz.olivepress;


import java.util.ArrayList;


import naz.olivepress.olives.Kalamata;
import naz.olivepress.olives.Ligurian;
import java.util.ArrayList;

import naz.olivepress.olives.Olive;
import naz.olivepress.press.OlivePress;

public class Main {
	
	
	
	
	// Main Method
	public static void main(String[] args) {
		
		ArrayList<Olive> olives = new ArrayList<Olive>();
		Olive olive;
		
		olive = new Kalamata();
		System.out.println(olive.name);
		olives.add(olive);
		
		olive = new Ligurian();
		System.out.println(olive.name);
		olives.add(olive);
		
		olive = new Kalamata();
		System.out.println(olive.name);
		olives.add(olive);
		
		OlivePress press = new OlivePress();
		press.getOil(olives);
		
		System.out.println("You got " + press.getTotalOil() + " units of oil");
		
        press.getOil(olives);
		
		System.out.println("You got " + press.getTotalOil() + " units of oil");
		
		Kalamata olive1 = (Kalamata)olives.get(0);
		System.out.println("Olive 1 is from " +olive1.getOrigin());
		
		System.out.println("Now get your important olive oil links from oliveUrl.java");
		
		
		olive = new Olive(2);
		System.out.println(olive.name);
		olives.add(olive);
		
		olive = new Olive(1);
		System.out.println(olive.name);
		olives.add(olive);
		
		olive = new Olive(2);
		System.out.println(olive.name);
		olives.add(olive);
		
		press.getOil(olives);
		
		System.out.println("You got " + press.getTotalOil() + " units of oil");
		
        press.getOil(olives);
		
		System.out.println("You got " + press.getTotalOil() + " units of oil");
	}

	
	
}


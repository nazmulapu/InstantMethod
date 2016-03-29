package naz.olivepress;

import java.util.ArrayList;

import naz.olivepress.olives.Olive;
import naz.olivepress.press.OlivePress;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<Olive> olives = new ArrayList<Olive>();
		Olive olive;
		
		olive = new Olive(2);
		System.out.println(olive.name);
		olives.add(olive);
		
		olive = new Olive(1);
		System.out.println(olive.name);
		olives.add(olive);
		
		olive = new Olive(2);
		System.out.println(olive.name);
		olives.add(olive);
		
		OlivePress press = new OlivePress();
		press.getOil(olives);
	}

}

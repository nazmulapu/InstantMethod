package naz.olivepress;

import naz.olivepress.olives.Olive;
import naz.olivepress.press.OlivePress;

public class Main {
	public static void main(String[] args) {
		Olive[] olives = {new Olive(), new Olive(), new Olive()};
		OlivePress press = new OlivePress();
		press.getOil(olives);
	}

}

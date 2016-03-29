package naz.olivepress.press;

import naz.olivepress.olives.Olive;

public class OlivePress {
	public void getOil(Olive[] olives){
		for (Olive olive : olives){
			olive.crush();
		}
	}

}

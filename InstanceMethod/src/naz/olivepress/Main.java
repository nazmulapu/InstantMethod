package naz.olivepress;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import naz.olivepress.olives.Kalamata;
import naz.olivepress.olives.Ligurian;
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
	}

	
	
}

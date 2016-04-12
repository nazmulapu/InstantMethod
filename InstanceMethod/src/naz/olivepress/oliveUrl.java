package naz.olivepress;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class oliveUrl {
	
	// Database Connection 
	
				public static DB db = new DB();
				 
				public static void main(String[] args) throws SQLException, IOException {
					db.runSql2("TRUNCATE Record;");
					processPage("https://en.wikipedia.org/wiki/Olive_oil");
				}
				
				public static void processPage(String URL) throws SQLException, IOException{
					//check if the given URL is already in database
					String sql = "select * from Record where URL = '"+URL+"'";
					ResultSet rs = db.runSql(sql);
					if(rs.next()){
			 
					}else{
						//store the URL to database to avoid parsing again
						sql = "INSERT INTO  `olive`.`Record` " + "(`URL`) VALUES " + "(?);";
						PreparedStatement stmt = db.conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
						stmt.setString(1, URL);
						stmt.execute();
			 
						//Parsing the link
						//BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
						//System.out.println("Enter a valid Url: ");
						//String url = (input.readLine());
						//String n = url.toString();
						//System.out.println(n);
						Document oliveBot = Jsoup.connect("https://en.wikipedia.org/wiki/Olive_oil").get(); // user input n
						Elements links = oliveBot.select("body a");
						System.out.println("Here is a helpful url is in your Database");
						System.out.println("//////////////////////////////////////////");
			 
						if(oliveBot.text().contains("olive oil")){
							
							System.out.println(URL);
						}
			 
						//getting all links 
						Elements alloliveoil = oliveBot.select("a[href]");
						for(Element link: alloliveoil){
							if(link.attr("href").contains("olive_oil"))
								processPage(link.attr("abs:href"));
						}
					}
				}

}

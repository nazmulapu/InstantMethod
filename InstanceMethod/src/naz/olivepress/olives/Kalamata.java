package naz.olivepress.olives;

public class Kalamata extends Olive {

	public Kalamata() {
		super(2);
		this.name = "Kalamata";
		this.name = "Grassy";
		this.color = Olive.BLACK;
	}
	
	@Override
	public int crush() {
		System.out.println("Crush from subclass");
		return super.crush();
	}
	
	public String getOrigin(){
		return "Greece";
	}
	

}

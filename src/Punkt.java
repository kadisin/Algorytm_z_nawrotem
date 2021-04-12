
public class Punkt {

	private int x;
	private int y;
	private int value;
	
	public Punkt(int x,int y)
	{
		this.x = x;
		this.y = y;
		this.value = 0;
		
	}
	
	public void setValue(int wart)
	{
		this.value = wart;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public int countDistance(Punkt other)
	{
		int wynik = 0;
		wynik += this.x - other.x;
		wynik += this.y - other.y;
		// dystans liczony w ten sposob a nie pitagorasem
		return wynik;
		
		
	}
	
	
	
}


public class Person {

	String narodowosc;
	int dom;
	String kolor;
	String papieros;
	String napoj;
	String zwierze;
	

	
	public Person(int dom)
	{
		this.dom = dom;
	}
	
	public String getNarodowosc()
	{
		return narodowosc;
	}
	public void setNarodowosc(String nar)
	{
		
		if(nar != "Norweg" && nar != "Anglik" && nar != "Dunczyk" && nar != "Niemiec" && nar != "Norweg")
			narodowosc = "error";
		else
			narodowosc = nar;
	}
	public int getDom()
	{
		return dom;
	}
	public void setDom(int d)
	{
		this.dom = d;
	}
	public String getKolor()
	{
		return kolor;
	}
	public void setKolor(String kolor)
	{
		if(kolor != "Czerwony" && kolor != "Zielony" && kolor != "Zolty" && kolor != "Niebieski" && kolor != "Bialy" )
			this.kolor = "error";
		else
			this.kolor = kolor;
	}
	public String getPapieros()
	{
		return papieros;
	}
	public void setPapieros(String pap)
	{
		if(pap != "Cygaro" && pap != "Light" && pap != "Filter" && pap != "Fajka" && pap != "Mentol")
			papieros = "error";
		else
			papieros = pap;
	}
	public String getNapoj()
	{
		return napoj;
	}
	public void setNapoj(String nap)
	{
		if(nap != "Woda" && nap != "Herbata" && nap != "Mleko" && nap != "Kawa" && nap != "Piwo")
			napoj = "error";
		else
			napoj = nap;
	}
	public String getZwierze()
	{
		return zwierze;
	}
	public void setZwierze(String zw)
	{
		if(zw != "Koty" && zw != "Konie" && zw != "Ptaki" && zw != "Rybki" && zw != "Psy")
			zw = "error";
		else
			zwierze = zw;
	}
	
	
	
	
	
}

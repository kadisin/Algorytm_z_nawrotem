import java.util.ArrayList;

public class Zarzadca {

	private ArrayList<Person> domy;
	private String[] Kolor_pool = {"Zolty","Niebieski","Czerwony","Zielony","Zolty"};
	private String[] Zwierze_pool = {"Koty","Psy","Ptaki","Konie","Rybki"};
	private String[] Napoj_pool = {"Woda","Herbata","Mleko","Kawa","Piwo"};
	private String[] Narodowosc_pool = {"Norweg","Dunczyk","Anglik","Niemiec","Szwed"};
	private String[] Papieros_pool = {"Cygaro","Light","Filtr","Fajka","Mentol"};
	
	
	public Zarzadca()
	{
		
		domy = new ArrayList<Person>();
		domy.add(new Person(1));
		domy.add(new Person(2));
		domy.add(new Person(3));
		domy.add(new Person(4));
		domy.add(new Person(5));
	}
	
	
	public Boolean sprawdzDziedzine()
	{
		
		for( int ii = 0 ; ii < domy.size(); ii ++)
		{
			if(domy.get(ii).getKolor() == "error" || domy.get(ii).getZwierze() == "error" || domy.get(ii).getNapoj() == "error" ||
					domy.get(ii).getNarodowosc() == "error" || domy.get(ii).getPapieros() == "error")
				return false;
			
		}
		
		
		
		return true;
	}
	
	
	
	public Boolean sprawdzOgraniczenia()
	{
		
		// ogr 1 
		if(domy.get(0).getNarodowosc() != "Norweg")
			return false;
		
		// ogr 2
		for(int ii = 0 ; ii < domy.size() ; ii ++)
		{
			if(domy.get(ii).getNarodowosc() == "Anglik")
				if(domy.get(ii).getKolor() != "Czerwony")
					return false;
		}	
		
		// ogr 3
		for(int ii = 0 ; ii < domy.size(); ii ++ )
		{
			
			if(domy.get(ii).getKolor() != "Zielony")
			{
				if(ii == 0)
					if(domy.get(domy.size()-1).getKolor() != "Bialy" )
						return false;
				if(domy.get(ii-1).getKolor() != "Bialy")
						return false;
						
			}
		}
		// ogr 4
		for (int ii = 0 ; ii < domy.size(); ii ++)
		{
			if(domy.get(ii).getNarodowosc() == "Dunczyk")
				if(domy.get(ii).getNapoj() != "Herbata")
					return false;
		}
		
		// ogr 5
		for (int ii = 0 ; ii < domy.size() ; ii ++)
		{
			if(domy.get(ii).getPapieros() == "Light")
			{
				if(ii == 0)
				{	
					if(domy.get(domy.size() -1 ).getZwierze() != "Kot" && domy.get(ii+1).getZwierze() != "Kot")
					return false;
				}		
				else if( ii == domy.size()-1 )
				{	
					if(domy.get(0).getZwierze() != "Kot" && domy.get(ii-1).getZwierze() != "Kot")
						return false;
				}
				else
				{
					if(domy.get(ii-1).getZwierze() != "Kot" && domy.get(ii+1).getZwierze() != "Kot" )
						return false;
				}
				
				
			}
				
		}
		
		// ogr 6
		for(int ii = 0 ; ii < domy.size(); ii ++)
		{
			if(domy.get(ii).getKolor() == "Zolty")
				if(domy.get(ii).getPapieros() != "Cygaro")
					return false;
			
		}
		
		
		// ogr 7
		for (int ii = 0 ; ii < domy.size(); ii ++)
		{
			if(domy.get(ii).getNarodowosc() == "Niemiec")
				if(domy.get(ii).getPapieros() != "Fajka")
					return false;
			
		}
		// ogr 8
		if(domy.get(2).getNapoj() != "Mleko")
			return false;
		
		//ogr 9
		for (int ii = 0 ; ii < domy.size() ; ii ++)
		{
			
			if(domy.get(ii).getPapieros() == "Light")
			{
				if( ii == 0)
				{
					if(domy.get(ii+1).getNapoj() != "Woda" && domy.get(domy.size()-1).getNapoj() != "Woda")
						return false;
				}
				else if(ii == domy.size()-1)
				{
					if(domy.get(0).getNapoj() != "Woda" && domy.get(ii-1).getNapoj() != "Woda")
						return false;
				}
				else
				{
					if(domy.get(ii-1).getNapoj() != "Woda" && domy.get(ii+1).getNapoj() != "Woda")
						return false;
				}
				
			}
			
		}
		
		// ogr 10
		for (int ii = 0 ; ii < domy.size(); ii ++)
		{
			if(domy.get(ii).getPapieros() == "Filter")
				if(domy.get(ii).getZwierze() != "Ptaki")
					return false;	
			
		}
		
		// ogr 11
		for (int ii = 0 ; ii < domy.size(); ii ++)
		{
			if(domy.get(ii).getNarodowosc() == "Szwed")
				if(domy.get(ii).getZwierze() != "Psy")
					return false;
			
		}
		
		// ogr 12 
		for (int ii = 0 ; ii < domy.size(); ii ++)
		{
			
			if(domy.get(ii).getNarodowosc() == "Norweg")
			{
				if(ii == 0 )
				{
					if(domy.get(domy.size()-1).getKolor() != "Niebieski" && domy.get(ii+1).getKolor() != "Niebieski")
						return false;
				}
				else if(ii == domy.size()-1)
				{
					if(domy.get(0).getKolor() != "Niebieski" && domy.get(ii-1).getKolor() != "Niebieski")
						return false;
				}
				else
				{
					if(domy.get(ii-1).getKolor() != "Niebieski" && domy.get(ii+1).getKolor() != "Niebieski")
						return false;
				}
				
				
			}
			
		}
		
		// ogr 13
		for (int ii = 0 ; ii < domy.size(); ii ++)
		{
			if(domy.get(ii).getZwierze() == "Konie")
			{
				if(ii == 0 )
				{
					if(domy.get(domy.size()-1).getKolor() != "Zolty" && domy.get(ii+1).getKolor() != "Zolty")
						return false;
				}
				else if(ii == domy.size()-1)
				{
					if(domy.get(0).getKolor() != "Zolty" && domy.get(ii-1).getKolor() != "Zolty")
						return false;
				}
				else
				{
					if(domy.get(ii-1).getKolor() != "Zolty" && domy.get(ii+1).getKolor() != "Zolty")
						return false;
				}
				
				
			}
			
		}
		
		// ogr 14
		for (int ii = 0 ; ii < domy.size(); ii ++)
		{
			if(domy.get(ii).getPapieros() == "Mentolowe")
				if(domy.get(ii).getNapoj() != "Piwo")
					return false;
			
		}
		// ogr 15
		for (int ii = 0 ; ii < domy.size(); ii ++)
		{
			if(domy.get(ii).getKolor() == "Zielony")
				if(domy.get(ii).getNapoj() != "Kawa")
					return false;
			
		}
		
		
		
		
		return true;
		
	}
	
	
	
	
}

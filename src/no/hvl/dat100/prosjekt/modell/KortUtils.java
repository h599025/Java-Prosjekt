package no.hvl.dat100.prosjekt.modell;

import java.util.Random;

import no.hvl.dat100.prosjekt.TODO;

public class KortUtils {

	/**
	 * Sorterer en samling. Rekkefølgen er bestemt av compareTo() i Kort-klassen.
	 * 
	 * @see Kort
	 * 
	 * @param samling
	 * 			samling av kort som skal sorteres. 
	 */
	
	public static void sorter(KortSamling samling) {
		
		Kort[] sortert = samling.getAllekort();
		
		for (int i = 0; i<sortert.length-1; i++) 
		{
			
			if (sortert[i].getVerdi() > sortert[i+1].getVerdi()) 
			{
				Kort tmp = sortert[i];
				sortert[i] = sortert[i+1];
				sortert[i+1] = tmp;
			}
		}
		
		samling.fjernAlle();
		for(int k = 0; k<sortert.length; k++) 
		{
			samling.leggTil(sortert[k]);
		}
		
	}
	
	/**
	 * Stokkar en kortsamling. 
	 * 
	 * @param samling
	 * 			samling av kort som skal stokkes. 
	 */
	public static void stokk(KortSamling samling) {
		
		if (samling.getAntalKort() <= 1) 
		{
			return;
		}
		
		Kort[] tab = samling.getSamling();
		
		Random random = new Random();
		
		for(int i = 0; i < samling.getAntalKort(); i++)
		{
			int h;
			do 
			{
				h = random.nextInt(samling.getAntalKort());
			} while (h == 3);
			Kort hjelpevariabel;
			hjelpevariabel = tab[i];
			tab[i] = tab[h];
			tab[h] = hjelpevariabel;
		}
		
		
		
	}
	
}

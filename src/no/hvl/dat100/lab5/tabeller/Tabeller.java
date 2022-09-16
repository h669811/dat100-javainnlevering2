package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		System.out.print("[ ");
		for (int v : tabell) {
			System.out.print(v + " ");
		}
		System.out.print("]");
		
		//throw new UnsupportedOperationException("skrivUt ikke implementert"); 
	}

	// b)
	public static String tilStreng(int[] tabell) {

		String tabellTxt = "[";
		for (int i = 0; i < tabell.length; i++) {
			if (i == tabell.length - 1) {
				tabellTxt += String.valueOf(tabell[i]);
			}
			else {
			tabellTxt += String.valueOf(tabell[i]) + ",";
			}
		}
		tabellTxt += "]";
		System.out.println(tabellTxt); 
		return tabellTxt;
		//throw new UnsupportedOperationException("tilStreng ikke implementert");
		
	}

	// c)
	public static int summer(int[] tabell) {

		int sumFor = 0;
		int sumWhile = 0;
		int sumUtFor = 0;
		
		for (int i = 0; i < tabell.length; i++) {
			sumFor += tabell[i];
		}
		
		int w = 0;
		while (w < tabell.length) {
			sumWhile += tabell[w];
			w += 1;
		}
		
		for (int v : tabell) {
			sumUtFor += v;
		}
		
		System.out.println(sumFor + " " + sumWhile + " " + sumUtFor);
		
		return sumFor;
		//throw new UnsupportedOperationException("summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		
		boolean inTab = false;
		for (int v : tabell) {
			if (v == tall) {
				inTab = true;
				break;
			}
		}
		return inTab;
		//throw new UnsupportedOperationException("finnesTall ikke implementert");
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		
		int i = 0;
		if (tabell.length > 0) {
			do {
				if (tabell[i] == tall) {
					break;
				}
				else if (i == (tabell.length-1)) {
					i = -1;
					break;
				}
				else {
					i+= 1;
				}
			}
			while (i < tabell.length);
		}
		else
			i = -1;
		
		return i;
		//throw new UnsupportedOperationException("posisjonTall ikke implementert");

	}

	// f)
	public static int[] reverser(int[] tabell) {

		int lengde = tabell.length;
		int newTab[] = new int[lengde];
		int s = 0;
		
		if (tabell.length != 0) {
			for (int i = lengde-1; i >= 0; i--) {
				newTab[s] = tabell[i];
				s += 1;
			}
			
		}
		return newTab;
		//throw new UnsupportedOperationException("reverser ikke implementert");
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean sortert = true;
		
		for (int i = 1; i < tabell.length; i++) {
			if (tabell[i] < tabell[i-1]) {
				sortert = false;
			}
				
		}
		return sortert;
		//throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int tab[] = new int[tabell1.length + tabell2.length];
		
		int indeks = 0;
		for (int i = 0; i < tab.length; i++) {
			if (i < tabell1.length) {
				tab[i] = tabell1[i];
			}
			else {
				tab[i] = tabell2[indeks];
				indeks += 1;
			}

		}
		
		return tab;
		//throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}

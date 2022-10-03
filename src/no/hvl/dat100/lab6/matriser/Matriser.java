package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int[] i : matrise) {
			for (int k : i) {
				System.out.print(k + " ");
			}
			System.out.print("\n");
			
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String nyMatrise = "";

        for (int i[] : matrise) {
            for (int j : i) {

                nyMatrise += j + " ";

            }

            nyMatrise += "\n";

        }
        return nyMatrise;
	}

	// c)
    public static int[][] skaler(int tall, int[][] matrise) {
        int[][] result = new int[matrise.length ][matrise[0].length];

        for (int i = 0; i < matrise.length; i++) { //this equals to the row in our matrix.
        	for (int j = 0; j < matrise[i].length; j++) { //this equals to the column in each row.
                   result[i][j] += matrise[i][j] * tall;
        	}

        }
        return result;
    }

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		boolean like = true;
		
		if (a!=b) {
			like = false;
		}
		
		return like;
	}
	
	// e)
    public static int[][] speile(int[][] matrise) {

        int[][] result = new int[matrise.length ][matrise[0].length];


        for (int i = 0; i < matrise.length; i++) { //this equals to the row in our matrix.
        	for (int j = 0; j < matrise[i].length; j++) { //this equals to the column in each row.
                   result[i][j] += matrise[j][i];
        	}
        }
        return result;
    }

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		int[][] matrix = new int[a.length][b[0].length]; 		//lager en ny matrise med like mange rader som a, og like mange kolonner som b
		
		for (int r = 0; r < matrix.length; r++) {   			//itererer over radene i den nye matrisen
			for (int k = 0; k < matrix[r].length; k++) {		//itererer over kolonnene i radene i matrisen
				int sum = 0;									//nullstiller summen
				for (int likeSider = 0; likeSider < b.length; likeSider++) {		
					sum += a[r][likeSider] * b[likeSider][k];	
				}
				
				matrix[r][k] = sum;
			}
		}
		
		
		return matrix;
	
	}
}

public class Practice10 {
	public static void main (String[] args) {
		int intArray[][] = new int[4][4];

		for (int i=0; i<intArray.length; i++)
			for (int j=0; j<intArray[i].length; j++)
				intArray[i][j] = 0;

		int num = 0;
		while (num < 10) {
			int row = (int)(Math.random()*4);
			int col = (int)(Math.random()*4);
   
			if (intArray[row][col] != 0)
				continue;
			else { 
				intArray[row][col] = (int) Math.round(Math.random()*9 + 1);
				num++;
			}
		}
		
		for (int i=0; i<intArray.length; i++) {
			for (int j=0; j<intArray[i].length; j++)
				System.out.print(intArray[i][j] + "\t");
			System.out.println();
		}
	}
}
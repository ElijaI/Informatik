public class Test {

	public static void main(String[] args) {
		
		boolean[][] test = erstelleSchiefesBooleanArray(6);
		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test[i].length; j++) {
				System.out.print(test[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public static boolean[][] erstelleSchiefesBooleanArray(int laenge) {
		boolean[][] ret = new boolean[laenge][];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = new boolean[i + 1];
		}
		return ret;
	}

}

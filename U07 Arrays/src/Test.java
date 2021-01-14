
public class Test {

	public static void main(String[] args) {

		int[][] ret = new int [7][3];
		ret = new int[7][3];
		for (int i = 0; i < ret.length; i++) {
			for (int j = 0; j < ret[i].length; j++) {
				switch(j) {
					case 0: {
							ret[i][j] = i + 1;
						break;
					}
					case 1: {
							ret[i][j] = i + 8;
						break;
					}
					case 2: {
							ret[i][j] = i + 15;
						break;
					}
					default: {
						
					}
				}
			}
		}
		
		ausgeben(ret);
	}

	public static void ausgeben(int[][] karten) {
		for (int i = 0; i < karten.length; i++) {
			for (int j = 0; j < karten[i].length; j++) {
				System.out.print(" ");
				if (karten[i][j] < 10) {
					System.out.print(" ");
				}
				System.out.print(karten[i][j]);
			}
			System.out.println();
		}
	}

}

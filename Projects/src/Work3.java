import java.util.Random;

public class Work3 {

	public static void main(String[] args) {
		Random rand = new Random(System.currentTimeMillis());
		int[][] x = new int[8][6];
		for (int i = 0; i<8; i++)
		{
			for (int j = 0; j<5; j++)
			{
				x[i][j] = 10 + rand.nextInt(90);
				System.out.print(x[i][j] + " ");
			}
			System.out.println();
		}
	}

}

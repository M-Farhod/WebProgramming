import java.util.Random;

public class Work4 {

	public static void main(String[] args) {
		Random rand = new Random(System.currentTimeMillis());
		int[][] x = new int[5][8];
		int max = -100;
		for (int i = 0; i<5; i++)
		{
			for (int j = 0; j<8; j++)
			{
				x[i][j] = -99 + rand.nextInt(199);
				if (x[i][j] > max)
					max = x[i][j];
				System.out.print(x[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Максимальный элемент массива:" + max);
	}

}

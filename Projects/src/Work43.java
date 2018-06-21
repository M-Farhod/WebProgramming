
public class Work43 {

	public static void main(String[] args) {
		int[][] k = new int[5][5];
		for (int i = 0; i<5; i++)
		{
			for (int j = 0; j<5; j++)
			{
				if (i==0 && j==0)
					k[i][j] = (int) (Math.random()*10);
				else if (j==0)
					k[i][j] = (int) (Math.random()*10) + k[i-1][4];
				else k[i][j] = (int) (Math.random()*10) + k[i][j-1];
				System.out.print(k[i][j] + " ");
			}
			System.out.println();			
		}
		int jr = (int) ((Math.random()*4));
		int ir = (int) ((Math.random()*4));
		int num = k[ir][jr];
		System.out.println("Число, которое нужно найти: " + num);		
		int i,j,f = 0,posmin=0,posmax=24,pos = 12, steps = 1;
		while(f==0) {
			i = pos/5;
			j = pos%5;
			if (k[i][j] == num) {
				System.out.println("Строка "+(i+1)+" Столбец "+(j+1));
				System.out.println("Количество шагов: " + steps);
				f=1;
			}
			else if (k[i][j] > num) {
				{
					posmax = pos;
					pos = (pos + posmin)/2;
					steps++;
				}
			}
			else if (k[i][j] < num) {
				posmin = pos;
				pos = (pos + posmax)/2;
				steps++;
				}				
		}
	}
}
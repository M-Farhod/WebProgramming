
public class Work41 {

	public static void main(String[] args) {
		int[][] x = new int[5][5];
		for (int i = 0; i<5; i++)
		{
			for (int j = 0; j<5; j++)
			{
				x[i][j] = (int) (Math.random()*100);
				System.out.print(x[i][j] + " ");
			}
			System.out.println();
			
			
		}
		int numb = (int) ((Math.random()*100));
		int l=0;
		System.out.println("�����, ������� ����� �����: " + numb);
		for (int i = 0; i<5; i++)
		{
			for (int j = 0; j<5; j++)
			{
				if (x[i][j] == numb)
					{
					System.out.println("������ "+(i+1)+" ������� "+(j+1));
					System.out.println("���������� �����: " + (i*5+j+1));
					l = 1;
					}
			}
		}
		if (l == 0)
			System.out.println("������ ����� � ������� ���");
	}
}
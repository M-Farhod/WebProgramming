public class Work42MatText {

	public static void main(String[] args) {
		String text = "��� � ���� �����, ����� �����\n������ ������ �� ������� ����\n� ������ ������ ������ ���� -\n�������� ��� ����!\n\n�� - �� �����, � - �����\n������ � ������� ����� -\n���, �� �� � �� ������ �\n� ���� �� ������ ����� -\n\n����� ����� ���������,\n������ ���� �� ��������,\n� ��������� ������ ����\n������� ���� ������.\n\n������, �������� �������\n�, ��������� ������,\n� ����� ������ �������\n������ � ���� � ������";
		int k=0,prob=0,maxprob=0;
		for (int i = 0;i<text.length();i++)
		{
			if (text.charAt(i)==' ')
					prob++;
			if (text.charAt(i)=='\n')
				{
					k++;
					if (prob>maxprob)
						maxprob = prob;
					prob = 0;
				}
		}
		String[][] words = new String[k+1][maxprob];
		String[] stroki = text.split("\n");
		for (int i=0; i<stroki.length;i++)
				words[i] = stroki[i].split(" ");
		for (int i=0; i<stroki.length; i++)
			{
			for (int j=0; j<words[i].length; j++)
				System.out.print(words[i][j]+" ");
			System.out.println();
			}
		System.out.println();
		for (int i=0; i<stroki.length; i++)
		{
		for (int j=0; j<words[i].length; j++)
			if (words[i][j].indexOf("�") != -1)
				System.out.print(words[i][j]+" ");
		}
	}

}

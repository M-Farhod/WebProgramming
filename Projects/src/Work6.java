import java.util.Scanner;

public class Work6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dec;
		short ibuff;
		char cbuff = 0;
		String hex = "";
		System.out.println("������� �����. ������� ����� ��� ����� � 16-������ ������� ���������");
		dec = scan.nextInt();
		if (dec == 0)
			System.out.println("�����: 0");
		else
			while (dec > 0)
			{
				ibuff = (short) (dec % 16);
				if ((ibuff >= 10) && (ibuff <=15))
					switch (ibuff)
					{
					case 10:
						cbuff = 'A';
						break;
					case 11:
						cbuff = 'B';
						break;
					case 12:
						cbuff = 'C';
						break;
					case 13:
						cbuff = 'D';
						break;
					case 14:
						cbuff = 'E';
						break;
					case 15:
						cbuff = 'F';
						break;
					}			
				else
					cbuff = (char) (ibuff + 48); //48 - ���� 0 � ASCII
				hex = cbuff + hex;
				dec = dec / 16;
			}
		System.out.println("�����: " + hex);
		scan.close();
	}
}

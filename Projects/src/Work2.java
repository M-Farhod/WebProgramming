import java.util.Scanner;

public class Work2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x, y, z;
		System.out.println("������� 3 �����. ������� ����� ����� ��������� ax^2+bx+c=0 ��� ��������� � ���, ��� ������ ���");
		x = scan.nextInt();
		y = scan.nextInt();
		z = scan.nextInt();
		if (y*y - (4*x*z) < 0)
			System.out.println("������ ���");
		else
		{
			if (y*y - (4*x*z) == 0)
				System.out.println("�����: " + (-y/(2*x)));
			else
			{
				System.out.println("����� 1: " + ((-y + Math.sqrt(y*y - (4*x*z)))/(2*x)));
				System.out.println("����� 2: " + ((-y - Math.sqrt(y*y - (4*x*z)))/(2*x)));
			}
		}
		scan.close();
	}
}

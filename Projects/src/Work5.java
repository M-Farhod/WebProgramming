import java.util.Scanner;

public class Work5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		short x, y;
		char buff;
		System.out.println("������� 2 ��������������� ����� ���, ����� ������ ���� ������ �������. ��������� ������� ��� ������� � ��������� ����������");
		x = scan.nextShort();
		y = scan.nextShort();
		if ((x > y) || (x<0) || (y<0))
			System.out.println("������");
		else
			for (int i = x; i < y; i++)
			{
				buff = (char) i;
				System.out.println(buff);
			}
		scan.close();
	}
}
import java.util.Scanner; 

public class Work1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x, y, xbuf, ybuf;
		System.out.println("������� 2 �����. ������� ����� �� �����, ������� ����� � 10");
		x = scan.nextInt();
		y = scan.nextInt();
		xbuf = Math.abs(x - 10);
		ybuf = Math.abs(y - 10);
		if (xbuf > ybuf)
			System.out.println("�����: " + y);
		else
			System.out.println("�����: " + x);
		scan.close();
		
	}
}
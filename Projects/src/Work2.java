import java.util.Scanner;

public class Work2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x, y, z;
		System.out.println("Введите 3 числа. Ответом будут корни уравнения ax^2+bx+c=0 или сообщение о том, что корней нет");
		x = scan.nextInt();
		y = scan.nextInt();
		z = scan.nextInt();
		if (y*y - (4*x*z) < 0)
			System.out.println("Корней нет");
		else
		{
			if (y*y - (4*x*z) == 0)
				System.out.println("Ответ: " + (-y/(2*x)));
			else
			{
				System.out.println("Ответ 1: " + ((-y + Math.sqrt(y*y - (4*x*z)))/(2*x)));
				System.out.println("Ответ 2: " + ((-y - Math.sqrt(y*y - (4*x*z)))/(2*x)));
			}
		}
		scan.close();
	}
}

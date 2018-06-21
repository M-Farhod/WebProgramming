import java.util.Scanner;

public class Work5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		short x, y;
		char buff;
		System.out.println("Введите 2 неотрицательных числа так, чтобы второе было больше первого. Программа выведет все символы в указанном промежутке");
		x = scan.nextShort();
		y = scan.nextShort();
		if ((x > y) || (x<0) || (y<0))
			System.out.println("Ошибка");
		else
			for (int i = x; i < y; i++)
			{
				buff = (char) i;
				System.out.println(buff);
			}
		scan.close();
	}
}
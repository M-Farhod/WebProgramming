import java.util.Scanner;

public class Work6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dec;
		short ibuff;
		char cbuff = 0;
		String hex = "";
		System.out.println("Введите число. Ответом будет это число в 16-ричной системе счисления");
		dec = scan.nextInt();
		if (dec == 0)
			System.out.println("Ответ: 0");
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
					cbuff = (char) (ibuff + 48); //48 - знак 0 в ASCII
				hex = cbuff + hex;
				dec = dec / 16;
			}
		System.out.println("Ответ: " + hex);
		scan.close();
	}
}

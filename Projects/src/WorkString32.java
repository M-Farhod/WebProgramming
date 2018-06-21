
public class WorkString32 {

	public static void main(String[] args) {
		String s=new String("1. <HTML> <HEAD> 2. <TITLE>Óïðàâëåíèå ðàçðûâîì ñòðîê </Title> 3. </HEAD>	4. <BODY> 5. <marquee>Ýòî ìîÿ ó÷åáíàÿ  ñòðàíèöà.</marquee> 6. <H2>Ìåíÿ çîâóò <kbd>Îëüãà. </kbd></H2> 7. <H3 align=center>ß æèâó âî <em>Âëàäèâîñòîêå</em>. </H3> 8.  <H4 align=right> Ìîÿ ìàëåíüêàÿ ðîäèíà -  <font face=Academy color=Red>Ñàõàëèí</font>. </H4> 9. <H5 align=left>ÄÂÃÓ - ÂÓÇ â êîòîðîì ÿ ðàáîòàþ.</H5> 10. <B>Çäåñü</B> 11. <I>ïðîäåìîíñòðèðîâàíû</I> 12. <Blink>ðàçëè÷íûå</Blink> 13. <U> ñïîñîáû </U> 14. <KBD>óïðàâëåíèÿ </KBD> 15. <FONT SIZE=5 COLOR=FF80C0>øðèôòîì:</FONT>  åãî  16. <FONT SIZE=5 COLOR=FF00FF>öâåòîì</FONT> è 17. <FONT SIZE=+3 COLOR=FF00FF> ðàçìåðîì. </FONT> 18. </BODY> </HTML>");
		System.out.println(s);
		String[] sParts;
		sParts = s.split(">"); 
		int numb=sParts.length;
		System.out.println("Âñåãî òýãîâ:"+numb);
		System.out.println();
		int start=s.indexOf("<marquee>"); 
		int end=s.indexOf("</marquee>"); 
		System.out.println("Òåêñò áåãóùåé ñòðîêè:");
		System.out.println(s.substring(start+9,end));
		System.out.println();
		String s1=new String();
		s1=s.toLowerCase();
		System.out.println("Èñïîëüçîâàíèÿ òýãà <kbd>:");
		start=s1.indexOf("<kbd>"); 
		end=s1.indexOf("</kbd>"); 
		System.out.println(s1.substring(start+5,end));
		int start1=s1.lastIndexOf("<kbd>"); 
		int end1=s1.lastIndexOf("</kbd>"); 
		System.out.println(s1.substring(start1+5,end1));
		System.out.println();
		int n1=s.indexOf("16");
		int n2=s.indexOf("17");
		String s2=new String(); 
		s2=s.substring(n1+3, n2); 
		int  n3=s2.indexOf("COLOR=");
		System.out.println("Çíà÷åíèå öâåòà â 16 ñòðîêå:");
		System.out.println(s2.substring(n3+6,n3+12));
		System.out.println();
		String s5=new String();
		s5=s;
		s5=s5.replace("=", "=\"");
		String s8=new String();
			String[] sParts1;
			sParts1 = s.split("=");
			int m=sParts1.length; 
		int j=0;
		while ( j<m){
			int r=s5.indexOf("=\""); 
			s8=s8+s5.substring(0,r+2); 
			String s6=new String();
			s6=s5.substring(r+2,s5.length());
			int p=s6.indexOf(" "); 
			int k=s6.indexOf(">"); 
			String s7=new String();
			if (p<k){
				s6=s6.replaceFirst(" ","\" ");
				int last=s6.indexOf("\""); 
				s7=s6.substring(0, last+2); 
				s6=s6.substring(last+2,s6.length()); 
				s8=s8+s7; 
				s5=s5.substring(r+s7.length()); 
			}
			else{
				s6=s6.replaceFirst(">","\">");
				int last=s6.indexOf("\"");
				s7=s6.substring(0, last+2);
				s6=s6.substring(last+2,s6.length());
				s8=s8+s7;
				s5=s5.substring(r+s7.length()+1);
			}
			j++;
			}
		s8=s8+s5;
		System.out.println(s8);
	}
}

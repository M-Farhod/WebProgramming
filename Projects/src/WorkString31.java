
public class WorkString31 {

	public static void main(String[] args) {
		String s=new String ("Р–РёР»Р°-Р±С‹Р»Р° РєРѕР·Р° СЃ РєРѕР·Р»СЏС‚Р°РјРё. РЈС…РѕРґРёР»Р° РєРѕР·Р° РІ Р»РµСЃ РµСЃС‚СЊ С‚СЂР°РІСѓ С€РµР»РєРѕРІСѓСЋ, РїРёС‚СЊ РІРѕРґСѓ СЃС‚СѓРґРµРЅСѓСЋ. РљР°Рє С‚РѕР»СЊРєРѕ СѓР№РґРµС‚ - РєРѕР·Р»СЏС‚РєРё Р·Р°РїСЂСѓС‚ РёР·Р±СѓС€РєСѓ Рё СЃР°РјРё РЅРёРєСѓРґР° РЅРµ РІС‹С…РѕРґСЏС‚. Р’РѕСЂРѕС‚РёС‚СЃСЏ РєРѕР·Р°, РїРѕСЃС‚СѓС‡РёС‚СЃСЏ РІ РґРІРµСЂСЊ Рё Р·Р°РїРѕРµС‚: - РљРѕР·Р»СЏС‚РєРё, СЂРµР±СЏС‚СѓС€РєРё! РћС‚РѕРїСЂРёС‚РµСЃСЏ, РѕС‚РІРѕСЂРёС‚РµСЃСЏ! Р’Р°С€Р° РјР°С‚СЊ РїСЂРёС€Р»Р° - РјРѕР»РѕРєР° РїСЂРёРЅРµСЃР»Р°; Р‘РµР¶РёС‚ РјРѕР»РѕРєРѕ РїРѕ РІС‹РјРµС‡РєСѓ, Р�Р· РІС‹РјРµС‡РєСѓ РїРѕ РєРѕРїС‹С‚РµС‡С‡РєСѓ, Р�Р· РєРѕРїС‹С‚РµС‡С‡РєСѓ РІРѕ СЃС‹СЂСѓ Р·РµРјР»СЋ! РљРѕР·Р»СЏС‚РєРё РѕС‚РѕРїСЂСѓС‚ РґРІРµСЂСЊ Рё РІРїСѓСЃС‚СЏС‚ РјР°С‚СЊ. РћРЅР° РёС… РїРѕРєРѕСЂРјРёС‚, РЅР°РїРѕРёС‚ Рё РѕРїСЏС‚СЊ СѓР№РґРµС‚ РІ Р»РµСЃ, РєРѕР·Р»СЏС‚РєРё Р·Р°РїСЂСѓС‚СЃСЏ РєСЂРµРїРєРѕ-РЅР°РєСЂРµРїРєРѕ. Р’РѕР»Рє РїРѕРґСЃР»СѓС€Р°Р», РєР°Рє РїРѕРµС‚ РєРѕР·Р°. Р’РѕС‚ СЂР°Р· РєРѕР·Р° СѓС€Р»Р°, РІРѕР»Рє РїРѕР±РµР¶Р°Р» Рє РёР·Р±СѓС€РєРµ Рё Р·Р°РєСЂРёС‡Р°Р» С‚РѕР»СЃС‚С‹Рј РіРѕР»РѕСЃРєРѕРј: - Р’С‹, РґРµС‚СѓС€РєРё! Р’С‹ РєРѕР·Р»СЏС‚РєРё! РћС‚РѕРїСЂРёС‚РµСЃСЏ, РћС‚РІРѕСЂРёС‚РµСЃСЏ! Р’Р°С€Р° РјР°С‚СЊ РїСЂРёС€Р»Р°, РњРѕР»РѕРєР° РїСЂРёРЅРµСЃР»Р°. РџРѕР»РЅС‹ РєРѕРїС‹С‚С†Р° РІРѕРґРёС†С‹!");
		s=s.toLowerCase(); 
		String tmp=new String();
			tmp = s.replace(".", ""); 
			s = tmp;
			tmp = s.replace(",", ""); 
			s = tmp;
			tmp = s.replace(":", ""); 
			s = tmp;
			tmp = s.replace("-", " "); 
			s = tmp;
			tmp = s.replace("!", "");
			s = tmp;
			tmp = s.replace(";", ""); 
			s = tmp;
			tmp = s.replace("  ", " "); 
			s = tmp;
			System.out.println(s);
		String[] sParts;
		sParts = s.split(" ");
		for (int n=0; n<sParts.length;n++){
			sParts[n].trim(); 
		}
		for (int i=0; i<sParts.length;i++){
			int sum=0;
			if (sParts[i]!=" "){
				System.out.print(sParts[i]+":"); 
				int k=0;
				int[] numb=new int[104]; 
				for(int j=0;j<sParts.length;j++){
					if (sParts[i].equals(sParts[j]))
					{ 
						sum=sum+1; 
						numb[k]=j;
						k++;
					}
				}
				System.out.print(sum);
				System.out.println();
				for (k=0;k<104;k ++) 
				{
					sParts[numb[k]]=" ";
				} 
			}
		}
	}
	}



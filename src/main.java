import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		//camelCase=ilk harf küçük sonrasýndakiler büyük
		//Dont repeat yourself
		String internetSubeButonu= "Ýnternet Þubeye gir";
		double dolarDun = 8.21;
		double dolarBugun = 8.20;
		boolean dustuMu = false;
		
		if(dolarBugun<dolarDun) {
		System.out.println("Dolar düstü resmini göster");	
			
		}
		else if(dolarDun<dolarBugun) {
			System.out.println("Dolar arttý resmini göster");
		}
		else {
			System.out.println("bugün kurlar deðiþmedi");
		}
				String kredi1 = "Hýzlý kredi";
				String kredi2 = "Mutlu emekli kredisi";
				String kredi3 = "çiftçi kredisi";
				String kredi4 = "msb kredisi";
				String kredi5 = "konut kredisi";
				String kredi6 = "meb kredisi";
			
				/*System.out.println(kredi1);
				System.out.println(kredi2);
				System.out.println(kredi3);
				System.out.println(kredi4);
				System.out.println(kredi5);*/
				
				//String[] krediler = new String[6];
			String[] krediler = {"Hýzlý kredi","Mutlu emekli kredisi","çiftçi kredisi",
					"msb kredisi","konut kredisi","meb kredisi"};
			for(int i = 0;i<krediler.length;i++) {
				System.out.println(krediler[i]);
			}
			System.out.println("_----------------------_-------------------_");
			
			for(String kredi:krediler) {
				System.out.println(kredi);
			}
			
			String [] sehir1 = {"ankara"};
			String []sehir2 = {"istanbul"};
			sehir1 = sehir2;
			sehir2[0] ="izmir";
			System.out.println(sehir1[0]);
			
			

		
		
	}

}

package Service.Implement;

import java.util.ArrayList;
import java.util.List;

public class TranslatorService {
		
		private List<Integer> amountsZerosList;
		private List<Integer> amountsList;
		private int averageZeros = 0;
		private int average = 0;
		
		public String decodeBits2Morse(String code)  {
			System.out.println("-------------------------decodeBits2Morse---------------------------");
			String character = "";
			String letter = "";
			getAverage(code);

			for (int i = 0; i < amountsList.size(); i++) {
				character = "";
				if (amountsList.get(i) <= average) {
					character = ".";
				} else {
					character = "-";
				}
				letter += character;
				if (amountsZerosList.get(i + 1) > averageZeros) {
					letter += " ";
				}

			}
			System.out.println("bit :" + code + "\nCodigo Morse : " +  letter);
			return letter;
		}
		
		private void getAverage(String code) {
			amountsList = new ArrayList<Integer>();
			amountsZerosList = new ArrayList<Integer>();

			int counter = 0;
			int sum = 0;
			Boolean booleanN = false;

			int counterZeros = 0;
			int sumZeros = 0;
			Boolean booleanZero = false;

			String[] parts = code.split("");

			for (int i = 0; i < parts.length; i++) {
				if (parts[i].equals("0")) {
					counterZeros++;
					booleanZero = true;
					if (booleanN) {
						sum += counter;
						amountsList.add(counter);
						booleanN = false;
						counter = 0;
					}
				} else {
					counter++;
					booleanN = true;
					
					if (booleanZero) {
						sumZeros += counterZeros;
						amountsZerosList.add(counterZeros);
						booleanZero = false;
						counterZeros = 0;
					}				
				}
			}
			
			
			if (booleanZero) {
				sumZeros += counterZeros;
				amountsZerosList.add(counterZeros);
				booleanZero = false;
			}
			
			averageZeros = sumZeros / amountsZerosList.size();
			average = sum / amountsList.size();
		}
		
	
}

package com.mose.demo.project;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Convertir {
	
	public String translate2Human(String messageMorse) {
		StringBuilder decoded = new StringBuilder();
		System.out.println("------------------------translate2Human----------------------------");
		String[] words = messageMorse.split("\\s{2}");
		 Map<String, Character> morseAlphabet = new HashMap<>();
		 	morseAlphabet.put(".-", 'A');
	        morseAlphabet.put("-...", 'B');
	        morseAlphabet.put("-.-.", 'C');
	        morseAlphabet.put("-..", 'D');
	        morseAlphabet.put(".", 'E');
	        morseAlphabet.put("..-.", 'F');
	        morseAlphabet.put("--.", 'G');
	        morseAlphabet.put("....", 'H');
	        morseAlphabet.put("..", 'I');
	        morseAlphabet.put(".---", 'J');
	        morseAlphabet.put("-.-", 'K');
	        morseAlphabet.put(".-..", 'L');
	        morseAlphabet.put("--", 'M');
	        morseAlphabet.put("-.", 'N');
	        morseAlphabet.put("---", 'O');
	        morseAlphabet.put(".--.", 'P');
	        morseAlphabet.put("--.-", 'Q');
	        morseAlphabet.put(".-.", 'R');
	        morseAlphabet.put("...", 'S');
	        morseAlphabet.put("-", 'T');
	        morseAlphabet.put("..-", 'U');
	        morseAlphabet.put("...-", 'V');
	        morseAlphabet.put(".--", 'W');
	        morseAlphabet.put("-..-", 'X');
	        morseAlphabet.put("-.--", 'Y');
	        morseAlphabet.put("--..", 'Z');
	        morseAlphabet.put("-----", '0');
	        morseAlphabet.put(".----", '1');
	        morseAlphabet.put("..---", '2');
	        morseAlphabet.put("...--", '3');
	        morseAlphabet.put("....-", '4');
	        morseAlphabet.put(".....", '5');
	        morseAlphabet.put("-....", '6');
	        morseAlphabet.put("--...", '7');
	        morseAlphabet.put("---..", '8');
	        morseAlphabet.put("----.", '9');
	        for (String word : words) {
	            decoded.append(' ');
	            String[] letters = word.split("\\s");
	            for (String letter : letters) {
	                decoded.append(morseAlphabet.get(letter));
	            }
	        }
	        System.out.println("Morse : " + messageMorse);
	        System.out.println("La palabra es : " + decoded.substring(1));
		return decoded.substring(1);
	}
	
	public String translate2Morse(String messageHuman){
		System.out.println("-------------------------translate2Morse---------------------------");
		Map<Character,String> Byte = new LinkedHashMap<>();
		Byte.put(' ' , " ");
		Byte.put(',' , "--..--");
		Byte.put('.' , ".-.-.-");
		Byte.put('?' , "..--..");
		Byte.put('0' , "-----");
		Byte.put('1' , ".----");
		Byte.put('2' , "..---");
		Byte.put('3' , "...--");
		Byte.put('4' , "....-");
		Byte.put('5' , ".....");
		Byte.put('6' , "-....");
		Byte.put('7' , "--...");
		Byte.put('8' , "---..");
		Byte.put('9' , "----.");
		Byte.put('A' , ".-");
		Byte.put('B' , "-...");
		Byte.put('C' , "-.-.");
		Byte.put('D' , "-..");
		Byte.put('E' , ".");
		Byte.put('F' , "..-.");
		Byte.put('G' , "--.");
		Byte.put('H' , "....");
		Byte.put('I' , "..");
		Byte.put('J' , ".---");
		Byte.put('K' , "-.-");
		Byte.put('L' , ".-..");
		Byte.put('M' , "--");
		Byte.put('N' , "-.");
		Byte.put('O' , "---");
		Byte.put('P' , ".--.");
		Byte.put('Q' , "--.-");
		Byte.put('R' , ".-.");
		Byte.put('S' , "...");
		Byte.put('T' , "-");
		Byte.put('U' , "..-");
		Byte.put('V' , "...-");
		Byte.put('W' , ".--");
		Byte.put('X' , "-..-");
		Byte.put('Y' , "-.--");
		Byte.put('Z' , "--..");
		
		char[] arr = messageHuman.toUpperCase().toCharArray();
		String Resultado = "";
		for ( char ch : arr ) {
			Resultado+= Byte.get(ch);
			if (ch != ' ') {
				Resultado+= " ";	
			}
		}
		System.out.println("messageHuman :" + messageHuman + "\nCodigo Morse : " +  Resultado);
		return Resultado;
	}
	
}

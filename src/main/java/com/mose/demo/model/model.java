package com.mose.demo.model;

import com.mose.demo.project.Convertir;

import Service.Implement.TranslatorService;

public class model {
	private String text;

	public String gettext() {
		return text;
	}

	public void settext(String codigo) {
		this.text = codigo; 
	}

	@Override
	public String toString() {
		return text ;
	}

	public String DecodeBits2Morse() {
		TranslatorService tra = new TranslatorService();
		return tra.decodeBits2Morse(text);
	}
	
	public String Translate2Human() {
		Convertir C = new Convertir ();
		return C.translate2Human(text);
	}
	
	public String translate2Morse() {
		Convertir C = new Convertir ();
		return C.translate2Morse(text);
	}
	
	
	
}

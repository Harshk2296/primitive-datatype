package com.in28Minutes.vowels;

public class MyChar {
       
	private char ch;

	public MyChar(char c) {
		this.ch=c;
	}

	public boolean isVowel() {
	   if(ch=='a'|| ch=='e' || ch=='i' || ch=='o'|| ch=='u'
			   || ch=='A'|| ch=='E'|| ch=='I'|| ch=='O' || ch=='U')
		   return true;
	   
		return false;
	}

	public boolean isNumber() {
		if(ch=='0' || ch=='1' || ch=='2' || ch=='3' || ch=='4' || ch=='5' 
				|| ch=='6' || ch=='7' || ch=='8' || ch=='9')
			return true;
		
		return false;
	}

	public boolean isAlphabets() {
		if(ch =='a'&& ch =='e' && ch=='i' && ch=='o'&& ch=='u'
			   && ch=='A'&& ch=='E'&& ch=='I'&& ch=='O' && ch=='U' 
			   && ch=='0' && ch=='1' && ch=='2' && ch=='3' && ch=='4' && ch=='5' 
			   && ch=='6' && ch=='7' && ch=='8' && ch=='9')
			return true;
		
		return false;
	}

}

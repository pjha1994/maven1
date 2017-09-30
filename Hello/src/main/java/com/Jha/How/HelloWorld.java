package com.Jha.How;

public class HelloWorld{
	static {
		for(int i=0;i<5;i++)
			System.out.println("How are you? hello World " + i);
	}
	public static void main(String[] args) {
		System.out.println(Converter(31,2));
	}
	private static int Converter(int num, int base){
		int s = 0;
		int p =1;
		while(num>0){
			int temp = num%base;
			num = num/base;
			s = s  + temp*p;
			p = p*10;
		}
		return s;
	}
}
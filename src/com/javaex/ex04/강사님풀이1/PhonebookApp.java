package com.javaex.ex04.강사님풀이1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class PhonebookApp {

	public static void main(String[] args) throws IOException {
		
		Reader fr = new FileReader("C:\\javaStudy\\file\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			
			String str = br.readLine();
			
			if(str==null) {
				break;
			}
			
			String[] personInfo =  str.split(",");
			
			String name = personInfo[0];
			String hp = personInfo[1];
			String company = personInfo[2];

			System.out.println("이름: " + name);
			System.out.println("핸드폰: " + hp);
			System.out.println("회사: " +  company);
			System.out.println("");
			
		}
		
		
		
		
		
		fr.close();
		
		
	}

}
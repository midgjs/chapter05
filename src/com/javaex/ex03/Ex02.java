package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class Ex02 extends Ex01{

	public static void main(String[] args) throws IOException{
		
		Reader fr = new FileReader("C:\\javaStudy\\file\\phoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		List<Person> pList = new ArrayList<Person>();
		
		while(true) {
			String str = br.readLine(); //한줄씩 읽어온다 줄바꿈기호는 제외
			
			if(str == null) {
				break;
			} else {
				String[] strArr = str.split(",");
				
				Person p = new Person(strArr[0], strArr[1], strArr[2]);
				pList.add(p); //배열에 담기
			}
			
			System.out.println(str);
		}
		
		System.out.println("");
		for(int i = 0; i < pList.size(); i++) {
			pList.get(i).showInfo();
		} //읽기 
		
		br.close();
	}

}


	

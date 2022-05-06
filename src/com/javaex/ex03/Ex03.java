package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Ex03 extends Ex01{

	public static void main(String[] args) throws IOException{
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\PhoneDB.txt");
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\PhoneDB-수정.txt");
		OutputStreamWriter osw = new OutputStreamWriter(out);
		BufferedWriter bw = new BufferedWriter(osw);
		
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
		
		Person p = new Person("이재훈", "010-1234-5678", "02-222-2222");
		pList.add(p); //객체 추가
		
		System.out.println("");
		for(int i = 0; i < pList.size(); i++) {
			pList.get(i).showInfo();
		} //다시 읽어보기
		
		for(int i = 0; i < pList.size(); i++) {
			
			bw.write(pList.get(i).write());
			bw.newLine();
		}
		//파일작성
		System.out.println("종료됩니다.");
		bw.close();
		br.close();
	}

}


	

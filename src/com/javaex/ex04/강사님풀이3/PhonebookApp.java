package com.javaex.ex04.강사님풀이3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class PhonebookApp {

	public static void main(String[] args) throws IOException {
		
		List<Person> personList = new ArrayList<Person>(); 
		
		//읽기 스트림
		Reader fr = new FileReader("C:\\javaStudy\\file\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		

		
		//text파일을 1줄씩 읽어서 리스트에 추가
		while(true) {
			
			String str = br.readLine();
			
			if(str==null) {
				break;
			}
			
			String[] personInfo =  str.split(",");
			
			String name = personInfo[0];
			String hp = personInfo[1];
			String company = personInfo[2];

			Person person = new Person(name, hp, company);
			
			personList.add(person);
			
		}
		
		//System.out.println(personList.toString());
		
		//////////////////////////////////////////////////
		//추가할 데이터 생성
		
		//황일영 정보(객체) 생성 -->황일영 010-1234-1234 02-123-1234
		Person p = new Person("황일영", "010-1234-1234", "02-123-1234");
		
		//리스트에 추가
		personList.add(p);
		
		//출력하기
		for(Person person :personList) {
			System.out.println("이름: " + person.getName());
			System.out.println("핸드폰: " + person.getHp());
			System.out.println("회사: " + person.getCompany());
			System.out.println("");
		}
		
		
		//////////////////////////////////////////////////
		//파일에 저장
		
		//쓰기 스트림
		Writer fw = new FileWriter("C:\\javaStudy\\file\\PhoneDB.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		for(Person person : personList) {
			String saveStr = person.getName() + "," + person.getHp() + "," + person.getCompany();
			System.out.println(saveStr);
			
			bw.write(saveStr);
			bw.newLine();
		}
		
		
		bw.close();
		br.close();
		
		
	}

}
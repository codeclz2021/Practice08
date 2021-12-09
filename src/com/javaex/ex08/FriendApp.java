package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
	
		Friend[] friendArray = new Friend[3];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("친구 3명을 등록해 주세요");
	
		for(int i=0; i<friendArray.length; i++) {
			String str = sc.nextLine();
			String[] dataArray = str.split(" ");
			
			String name = dataArray[0];
			String hp = dataArray[1];
			String schoolName = dataArray[2];
			
			Friend friend = new Friend(name, hp, schoolName);
	        		
			friendArray[i] = friend;
		}
		
		
		for(int i=0; i<friendArray.length; i++) {
			System.out.println(
					"이름:" + friendArray[i].getName()+ 
					" 핸드폰:" + friendArray[i].getHp()+
			   		" 학교:" + friendArray[i].getSchoolName()
			);
			
		}
		
		sc.close();
		
		
		

	}

}

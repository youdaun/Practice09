package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	List<Friend> fList = new ArrayList<Friend>();
    	int num = 0;
   
    	System.out.println("친구를 3명 등록해 주세요");
    	
    	for(int i=1; i<=3; i++) {
    		String inputFriend = sc.nextLine();
    		String[] fArray = inputFriend.split(" ");
    		
    		Friend f = new Friend(fArray[0], fArray[1], fArray[2]);
    		fList.add(f);
    	}
    	
    	for(Friend f : fList) {
    		f.showInfo();
    	}
    
    	sc.close();
    	
    	
    }

}

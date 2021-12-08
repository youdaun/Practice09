package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	List<Goods> gList = new ArrayList<Goods>();
    	int sumPrice = 0;
    	
    	System.out.println("상품을 입력해주세요(구분 , / 종료 q)");
    	while(true) {
    		String gInfo = sc.nextLine();
    		
    		if(gInfo.equals("q")) {
    			System.out.println("[입력완료]");
    			break;
    		}
    		
    		String[] gArray = gInfo.split(",");
    		
    		String name = gArray[0];
    		int price = Integer.parseInt(gArray[1]);
    		int count = Integer.parseInt(gArray[2]);
    		
    		Goods g = new Goods(name, price, count);
    		gList.add(g);
    		
    		sumPrice += count;
    	}
       
    	System.out.println("=======================");
    	
    	for(Goods g : gList) {
    		g.showAll();
    	}
    	
    	System.out.println("모든 상품의 갯수는 " + sumPrice + "개 입니다.");
    	
    	
    	
    }

}

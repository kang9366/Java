package Lec;

import java.util.*;

public class SetExam {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>(); 
	     
	    set.add("Milk"); 
	    set.add("Bread"); 
	    set.add("Butter"); 
	    set.add("Cheese"); 
	    set.add("Ham"); 
	    set.add("Ham"); //중복된 원소는 추가되지 않음
	    
	    //반복자를 사용한 출력
	    Iterator<String> iterator = set.iterator(); //반복자 얻기
	    while(iterator.hasNext()) {
	    	String element = iterator.next();
	    	System.out.print("    "+element);
	    }
	    System.out.println();
	    //객체 삭제
	    set.remove("Butter");
	    set.remove("Ham");
	    
	    //람다식을 사용한 출력
	    set.forEach((element)->System.out.print("    "+element));
	    
	    set.add("Apple");
	    System.out.println();
	    //향상된 for문을 사용한 출력
	    for(String element : set)
	    	System.out.print("    "+element);
	    
	    set.clear();  //set에 저장된 모든 객체 제거
	    if(set.isEmpty())  //set이 비어있으면 true 반환
	    	System.out.println("Hashset이 비었습니다");
	    }
}

package PracticeJava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.poi.poifs.filesystem.Entry;
import org.testng.annotations.Test;


public class StringPratice {
	
	@Test(enabled=false)
	//Using for loop
	public  void StringDemo(){
		int count=1;
		String str="Nitishss";
		char [] str1=str.toCharArray();
		for(int i=1;i<=str1.length-1;i++){
		for(int j=i+1;j<=str1.length-1;j++){
			
		if(str1[i]==str1[j]){
			
			System.out.println(str1[i]);
			System.out.println(count+1);		
		}
		}
	}	
}
	@Test(enabled=false)
	//Using Hash set
	public  void StringDemo1(){
	String name="Nitish";
	char[] name1=name.toCharArray();
	Set<Character> store=new HashSet();
	for (char names:name1){
		if(store.add(names)==false){
			System.out.println(names);
		}	
	  }
	}
	@Test
	public  void StringDemo2(){
		String name="Nitish";
		char[] name1=name.toCharArray();
		Map<Character,Integer> store=new HashMap<Character,Integer>();
		for(char str:name1){
			Integer count=store.get(str);
			if(count==null){
				store.put(str, 1);
			}
			else{
				store.put(str, ++count);
			}
		}
		
		Set<java.util.Map.Entry<Character,Integer>> entrySet=store.entrySet();
		for (java.util.Map.Entry<Character,Integer> entry:entrySet){
			if(entry.getValue()>1){
				System.out.println(entry.getKey());
			}
		}	
	}
}
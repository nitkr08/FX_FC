package PracticeJava;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		int student[]={0,10,2,20,1,30};
		
		//System.out.println(student.length);
		for(int i=0;i<6;i++){
			for(int j=0;j<5;j++){
				if(student[i]<student[j+1]){
					int tempVar=student[j+1];
					student[j+1]=student[i];
					student[i]=tempVar;
				}
				
				
			}
			}
		String numberString=Arrays.toString(student);
		System.out.println(numberString);
		

	}

}
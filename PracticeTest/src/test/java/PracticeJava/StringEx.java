package PracticeJava;

public class StringEx {
	
	public void Reverse(String name1){
		String rev=" ";
		for(int i=name1.length()-1;i>=0;i--){
			rev=rev+name1.charAt(i);
		}
		System.out.println(rev);
	}
	
	public static void main(String[] args) {
	
	String name="My name is nitish";
	
	String array[]=name.split(" ");
	for(String nam:array){
		StringEx str=new StringEx();
		str.Reverse(nam);
		//System.out.println(nam);
	}	
	}
}

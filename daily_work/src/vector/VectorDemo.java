package vector;

import java.util.Vector;

public class VectorDemo{
	
	
	public static void main(String[] args) {
		
	Vector<String> vectorObj=new Vector<>();
	vectorObj.add("hello");
	vectorObj.add("mayank");
	vectorObj.add("nayan");
	vectorObj.add("laptop");
	vectorObj.add("charger");
	vectorObj.add("cable");
	
	System.out.println(vectorObj); 
	
	System.out.println();
	
	for(int i=0;i<vectorObj.size();i++) {
		System.out.println(vectorObj.get(i));
	}
	
//	for(String names: vectorObj) {
//		System.out.println(names);
//	}
	
	vectorObj.remove(2);
	System.out.println(vectorObj);
		
	}
	

	

}

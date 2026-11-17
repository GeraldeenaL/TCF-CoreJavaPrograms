package day17_Egs;

public class TryCatchDemo {

	public static void main(String[] args) {
		int result;
		result=TryCatchEg.performDivision(12,3);
		float res;
		res=TryCatchEg.performDivision(12f,3f);
	
		if(result!=0) 
			System.out.println("Division is: "+result);
		

		System.out.println("Float Division is: "+res);
			
		
		

	}

}

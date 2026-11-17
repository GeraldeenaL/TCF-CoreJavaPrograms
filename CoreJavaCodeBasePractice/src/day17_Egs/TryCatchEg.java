package day17_Egs;

public class TryCatchEg {
	static int performDivision(int x,int y) {
		int z=0;
		try {
			z=x/y;
		}
		catch(ArithmeticException e) {
			System.err.println("Division catch the exception: "+e.getMessage());
			
		}
		return z;
		}
	static float performDivision(float a,float b) {
		return a/b;
	}
	}



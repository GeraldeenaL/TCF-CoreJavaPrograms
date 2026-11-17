package day15_Egs;

public class AdminDemo {

	public static void main(String[] args) {
		Admin a=Admin.getObject();
		Admin b=Admin.getObject();
		a.m=a.m+10;
		System.out.println(a.m);
		System.out.println(b.m);

	}

}

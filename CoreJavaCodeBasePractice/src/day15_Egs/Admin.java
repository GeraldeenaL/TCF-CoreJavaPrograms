package day15_Egs;

public class Admin {
	private String adminName;
	public int m=10;
	static Admin a=null;
	static public Admin getObject() {
		if(a==null) {
			a=new Admin();
		}
		return a;
	}
	private Admin() {
		
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	

}

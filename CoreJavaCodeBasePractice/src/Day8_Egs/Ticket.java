package Day8_Egs;

public class Ticket {
	private int tktNo;
	private String movieName;
	private int seatNo;
	private double tktPrice;
	
	public Ticket(int tktNo,String movieName,int seatNo,double tktPrice) {
		this.tktNo=tktNo;
		this.movieName=movieName;
		this.seatNo=seatNo;
		this.tktPrice=tktPrice;
	}
	public int getTktNo() {
		return tktNo;
	}
	public void setTktNo(int tktNo) {
		this.tktNo = tktNo;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	public double getTktPrice() {
		return tktPrice;
	}
	public void setTktPrice(double tktPrice) {
		this.tktPrice = tktPrice;
	}
	@Override
	public String toString() {
		return "Ticket [tktNo=" + tktNo + ", movieName=" + movieName + ", seatNo=" + seatNo + ", tktPrice=" + tktPrice
				+ "]";
	}
	
	
	
	
	

}

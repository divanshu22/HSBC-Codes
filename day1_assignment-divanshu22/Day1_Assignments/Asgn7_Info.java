package asg;

public class Info {
	private int pid;
	private String pname;
	private String des;
	private float price;
	public float maxdis;
	private int month;
	private int year;
	private boolean impor;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getDes() {
		return des;
	}
	public boolean isImpor() {
		return impor;
	}
	public void setImpor(boolean impor) {
		this.impor = impor;
	}
	public void setDes(String ds) {
		des = ds;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getMaxdis() {
		return maxdis;
	}
	public void setMaxdis(float maxdis) {
		this.maxdis = maxdis;
	}
	public int getM() {
		return month;
	}
	public void setM(int month) {
		this.month = month;
	}
	public int getY() {
		return year;
	}
	public void setY(int year) {
		this.year = year;
	}
	

}
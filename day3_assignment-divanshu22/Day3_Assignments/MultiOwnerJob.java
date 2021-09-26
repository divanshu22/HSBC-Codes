package com.hsbc.Day3;

public class MultiOwnerJob extends Job {

	private String nameofp;

	public MultiOwnerJob(String a, String b, int d, int e, int f, String g, String h) {
		super(a, b, d, e, f, g);
		setNameofp(h);
        
	}

	public String getNameofp() {
		return nameofp;
	}

	public void setNameofp(String nameofp) {
		this.nameofp = nameofp;
	}
	
	@Override
	public void showDetails() {
		System.out.println("====================================");
		super.showDetails();
		String x = getNameofp();
		System.out.println("Multi Owner Job : " + x);
	}

}

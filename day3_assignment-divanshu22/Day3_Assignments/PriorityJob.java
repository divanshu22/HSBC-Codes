package com.hsbc.Day3;

public class PriorityJob extends Job {

	private String priority;
	private String monitoredby;

	public PriorityJob(String a, String b, int d, int e, int f, String g, String h, String i) {
		super(a, b, d, e, f, g);
		setPriority(h);
		setMonitoredby(i);

	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getMonitoredby() {
		return monitoredby;
	}

	public void setMonitoredby(String monitoredby) {
		this.monitoredby = monitoredby;
	}

	@Override
	public void showDetails() {
		System.out.println("====================================");
		super.showDetails();
		String x = getPriority() + " " +  getMonitoredby();
		System.out.println("Priority Job Info : " + x);
	}
}

package com.hsbc.Day3;

public class Job {

	private String jobId;
	private String jobname;
	private String owner;
	private int effort;
	private int moc;
	private int yoc;
	private String status;
	static int noobj = 0;
	
	public String getJobname() {
		return jobname;
	}

	public void setJobname(String jobname) {
		this.jobname = jobname;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getEffort() {
		return effort;
	}

	public void setEffort(int effort) {
		this.effort = effort;
	}

	public int getMoc() {
		return moc;
	}

	public void setMoc(int moc) {
		this.moc = moc;
	}

	public int getYoc() {
		return yoc;
	}

	public void setYoc(int yoc) {
		this.yoc = yoc;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getJobId() {  //Only read mode 
		return jobId;
	}
	
	public boolean validate() {  //Making fields Mandatory
        if (this.jobname == null) {
            return false;
        }
        if (this.owner == null) {
            return false;
        }
        return true;
    }
	//Constructor created 
	public Job(String jobname, String owner, int effort, int moc, int yoc, String status) {
		super();
		this.jobname = jobname;
		this.owner = owner;
		this.effort = effort;
		this.moc = moc;
		this.yoc = yoc;  
		this.status = status;
		
		noobj = noobj + 1;  //Job count increase by 1
		jobId= jobname + "_" + noobj;   //JOB ID Created 
	}
	
	public void showDetails()
	{
		String s= getJobname()+" "+getOwner()+" "+getEffort()+" "+getMoc()+" "+getYoc()+" "+getStatus(); //Yet to learn string concat method so using this method 
		System.out.println("Job Info : "+ s);
		System.out.println("Job ID : "+ jobId);
		String str= getJobname()+getOwner()+getEffort()+getMoc()+getYoc()+getStatus(); //Yet to learn string concat method so using this method 
		System.out.println("Concatenated information : "+ str);
		
	}
		
	

	

}

package com.hsbc.Day3;


public class Tester {

	public static void main(String[] args) {

		Job j1 = new Job("Alex", "HSBC", 8, 2021, 12, "Ok");
		//j1.showDetails();
		PriorityJob p1 = new PriorityJob("Ben", "HTI", 7, 2019, 13, "Not OK", "High", "Boyle");
		PriorityJob p2 = new PriorityJob("Charles", "HGC", 6, 2018, 18, "OK", "Medium", "Boston");
		//p1.showDetails();
		MultiOwnerJob m1 = new MultiOwnerJob("David", "HHH", 01, 2022, 10, "Not Ok", "Dan");
		MultiOwnerJob m2 = new MultiOwnerJob("Earl", "Sweet Shop", 04, 2008, 11, "Ok", "Emily");
		//m1.showDetails();

		Job[] j = new Job[5]; //Array Created 
		j[0] = j1;
		j[1] = p1;
		j[2] = p2;
		j[3] = m1;
		j[4] = m2;
		
		for (Job k : j) {
			k.showDetails();
		}

	}

}

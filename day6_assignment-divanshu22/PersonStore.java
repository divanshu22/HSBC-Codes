package com.hsbc.Day6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.mysql.cj.jdbc.Driver;
import java.util.Date;

/*
 * 
 * 
 * @author-Divanshu
 * 
 * 
 */
public class PersonStore {

	private Connection conn;
	private PreparedStatement ps;
	private static String conURL;
	private static String dbDriver;
	private static String dbUsername;
	private static String dbPassword;

	static {
		conURL = "jdbc:mysql://localhost:3306/day6";
		dbDriver = "com.mysql.cj.jdbc.driver";
		dbUsername = "root";
		dbPassword = "divanshu";

		try {
			Class c = Class.forName(dbDriver);
			System.out.println("====Loaded" + c.getName() + "Class=====");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	/*
	 * 
	 * Creating Connection to the MySQL database
	 * 
	 */
	public void createConnection() {
		try {
			Connection conn = DriverManager.getConnection(conURL, dbUsername, dbPassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/*
	 * 
	 * 
	 * Entering person details
	 * 
	 */

	public void addPerson(Person p) {
		final String SQL = "Insert into Person values(?,?,?,?)";
		createConnection();
		try {
			ps = conn.prepareStatement(SQL);
			ps.setInt(1, p.getPerson_id());
			ps.setString(2, p.getPerson_name());
			ps.setString(3, p.getLocation());
			ps.setDate(4, p.getDob());
			int cnt = ps.executeUpdate();
			if (cnt != 0) {
				System.out.println(("====== Added Record to Table ======"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}

	}

	/*
	 * 
	 * 
	 * Updating Person
	 * 
	 */
	public void updatePerson(Person p) {
		final String SQL = "update Person set person_id=?, person_name=? , location=?, dob=? ";
		createConnection();
		try {
			ps = conn.prepareStatement(SQL);
			ps.setInt(1, p.getPerson_id());
			ps.setString(2, p.getPerson_name());
			ps.setString(3, p.getLocation());
			ps.setDate(4, p.getDob());
			int cnt = ps.executeUpdate();
			if (cnt != 0) {
				System.out.println(("===== Updated [" + cnt + "] Rows====="));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}

	}
	/*
	 * 
	 * Displaying list of all entered person
	 * 
	 */

	public List<Person> getAllPerson() {
		ArrayList<Person> list = new ArrayList<>();
		final String SQL = "select * from Person";
		createConnection();
		try {
			ps = conn.prepareStatement(SQL);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Person p = new Person();
				p.setPerson_id(rs.getInt("person_id"));
				p.setPerson_name(rs.getString("person_name"));
				p.setLocation(rs.getString("location"));
				p.setDob(rs.getDate("dob"));
				list.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return list;
	}
	/*
	 * 
	 * Getting location of Persons, for this code I have called Location = India
	 * 
	 */

	public Person getPersonBylocation(String location) {
		Person p = null;
		final String SQL = "select * from Person where location=?";
		createConnection();
		try {
			ps = conn.prepareStatement(SQL);
			ps.setString(3, location);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				p = new Person();
				p.setPerson_id(rs.getInt("person_id"));
				p.setPerson_name(rs.getString("person_name"));
				p.setLocation(rs.getString("location"));
				p.setDob(rs.getDate("dob"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return p;
	}

	public void closeConnection() {
		if (conn != null)
			try {
				conn.close();
				System.out.println("=====CONNECTION CLOSED=====");
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}

	public static void main(String[] args) {
		Person p1 = new Person(5, "Fredrick", "Japan", "2019-01-01");
		Person p2 = new Person(6, "George", "India", "2017-03-03");
		PersonStore pp = new PersonStore();
		pp.addPerson(p1);
		pp.addPerson(p2);
		List<Person> per = pp.getAllPerson();
		for (Person p : per) {
			System.out.println(p);
		}
		pp.getPersonBylocation("India");

	}

}
package day9assignment.dao;

import java.util.List;

import day9assignment.beans.Covid;

public interface CovidDao {
	public List<Covid> findall();

	public Covid findByName(String name);

}

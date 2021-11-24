Fpackage day9assignment.business;

import java.util.List;

import day9assignment.beans.Covid;

public interface CovidService {
	public List<Covid> fetchdetail();
	public Covid fetchvacdetail(String name);

}

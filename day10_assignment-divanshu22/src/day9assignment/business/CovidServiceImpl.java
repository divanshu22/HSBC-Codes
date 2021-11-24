package day9assignment.business;

import java.util.List;

import day9assignment.beans.Covid;
import day9assignment.dao.CovidDao;
import day9assignment.factory.ObjectFactory;

public class CovidServiceImpl implements CovidService {
	private CovidDao dao;

	public CovidServiceImpl() {
		dao = new ObjectFactory().getDaoInstance();
	}

	@Override
	public List<Covid> fetchdetail() {
		return dao.findall();
	}

	@Override
	public Covid fetchvacdetail(String name) {
		return dao.findByName(name);
	}

}

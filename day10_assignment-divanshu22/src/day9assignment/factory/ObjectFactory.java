package day9assignment.factory;

import day9assignment.dao.CovidDao;
import day9assignment.dao.CovidDaoImpl;
import day9assignments.business.CovidService;
import day9assignments.business.CovidServiceImpl;

public class ObjectFactory {
	public CovidDao getDaoInstance() {
		CovidDao dao = new CovidDaoImpl();
		return dao;
	}

	public CovidService getServiceInstance() {
		CovidService service = new CovidServiceImpl();
		return service;
	}
}

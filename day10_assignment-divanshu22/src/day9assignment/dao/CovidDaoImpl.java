package day9assignment.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import day9assignment.beans.Covid;

public class CovidDaoImpl implements CovidDao {

	@Override
	public List<Covid> findall() {
		List<Covid> detail = new ArrayList<Covid>();
		try {
			Connection connection = DBUtil.getConnection();
			String selectQuery = "select * from covid";
			PreparedStatement statement = connection.prepareStatement(selectQuery);
			ResultSet result = statement.executeQuery();
			while (result.next()) {
				Covid v1 = new Covid();
				v1.setName(result.getString("name"));
				v1.setSeconddose(result.getInt("seconddose"));
				v1.setDuration(result.getDate("duration").toLocalDate());
				v1.setSideeffects(result.getString("sideeffects"));
				v1.setPrecautions(result.getString("precautions"));

			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return detail;
	}

	@Override
	public Covid findByName(String name) {
		Covid vacdetail = null;
		try {
			Connection connection = DBUtil.getConnection();
			String selectQuery = "select * from name where name = ?";
			PreparedStatement statement = connection.prepareStatement(selectQuery);
			statement.setString(1, name);
			ResultSet result = statement.executeQuery();
			while (result.next()) {
				vacdetail = new Covid();
				vacdetail.setName(result.getString("name"));
				vacdetail.setSeconddose(result.getInt("seconddose"));
				vacdetail.setDuration(result.getDate("duration").toLocalDate());
				vacdetail.setSideeffects(result.getString("sideeffects"));
				vacdetail.setPrecautions(result.getString("precautions"));
			}
			result.close();
			statement.close();
			connection.close();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return vacdetail;
	}
}

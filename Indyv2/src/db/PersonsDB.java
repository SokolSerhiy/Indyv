package db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonsDB implements Persons{

	static{
		try {
			Statement statement = SingleConnection.getInstance().getConnection().createStatement();
			statement.execute("CREATE TABLE IF NOT EXISTS Person(id int PRIMARY KEY AUTO_INCREMENT, name varchar(255), age int)");
			statement.close();
		} catch (SQLException e) {
		}
	}

	@Override
	public Person findOne(int id) {
		try(PreparedStatement statement = SingleConnection.getInstance().getConnection()
				.prepareStatement(
				"SELECT * FROM Person WHERE id=?")) {
			statement.setInt(1, id);
			try(ResultSet set = statement.executeQuery()){
				if(set.next()){
					return new PersonDB(set.getInt(1), set.getString(2), set.getInt(3));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Person> findAll() {
		try(PreparedStatement statement = SingleConnection.getInstance().getConnection()
				.prepareStatement(
				"SELECT * FROM Person")) {
			try(ResultSet set = statement.executeQuery()){
				List<Person> persons = new ArrayList<>();
				while(set.next()){
					persons.add(new PersonDB(set.getInt(1), set.getString(2), set.getInt(3)));
				}
				return persons;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new ArrayList<>();
	}
}

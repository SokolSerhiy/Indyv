package db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonDB implements Person{
	
	static{
		try {
			Statement statement = SingleConnection.getInstance().getConnection().createStatement();
			statement.execute("CREATE TABLE IF NOT EXISTS Person(id int PRIMARY KEY AUTO_INCREMENT, name varchar(255), age int)");
			statement.close();
		} catch (SQLException e) {
		}
	}

	private int id;
	
	private String name;
	
	private int age;

	public PersonDB(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public PersonDB(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public void save() {
		try {
			PreparedStatement statement = SingleConnection.getInstance().getConnection()
					.prepareStatement(
					"INSERT INTO Person(name, age) VALUES(?,?)", Statement.RETURN_GENERATED_KEYS);
			statement.setString(1, name);
			statement.setInt(2, age);
			statement.executeUpdate();
			ResultSet generatedKeys = statement.getGeneratedKeys();
			if (generatedKeys.next()) {
				id = generatedKeys.getInt(1);
	        }
			statement.close();
			generatedKeys.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update() {
		try {
			PreparedStatement statement = SingleConnection.getInstance().getConnection()
					.prepareStatement(
					"UPDATE Person SET name=?, age=? WHERE id=?");
			statement.setString(1, name);
			statement.setInt(2, age);
			statement.setInt(3, id);
			statement.executeUpdate();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete() {
		try {
			PreparedStatement statement = SingleConnection.getInstance().getConnection()
					.prepareStatement(
					"DELETE FROM Person WHERE id=?");
			statement.setInt(1, id);
			statement.executeUpdate();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "PersonDB [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}

package db;

import java.util.List;

public interface Persons {

	Person findOne(int id);
	
	List<Person> findAll();
}

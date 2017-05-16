package db;

public interface Person {

	void save();
	
	void update();
	
	void delete();
	
	String getName();
	
	int getAge();
	
	void setName(String name);
	
	void setAge(int age);
}

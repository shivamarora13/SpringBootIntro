package io.javabrains.springbootstarter.topics;

public class Topics {
	
	int id;
	String description;
	String name;
	
	public Topics(int id, String description, String name) {
		super();
		this.id = id;
		this.description = description;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}

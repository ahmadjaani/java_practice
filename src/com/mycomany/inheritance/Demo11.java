package com.mycomany.inheritance;

public class Demo11 {

	private int id;
	private String name;

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

	@Override
	public String toString() {
		return "Demo11 Object [id=" + id + ", name=" + name + "]";
	}
	
	//override toString
	

}

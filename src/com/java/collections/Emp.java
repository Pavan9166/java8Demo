package com.java.collections;

public class Emp {
private int id;
private String name;

public Emp(int id, String name) {
	super();
	this.id = id;
	this.name = name;
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
@Override
public String toString() {
	return "Emp [id=" + id + ", name=" + name + "]";
}

public int hashCode() {
	System.out.println("In Hashcode");
	return getId();
}

public boolean equals(Object obj) {
	
	Emp e=null;
	
	if(obj instanceof Emp) {
		e=(Emp)obj;
	}
	System.out.println("In equals");
if(e.getId()==e.getId()) {
	return true;
}else {
	return false;
}

}
}

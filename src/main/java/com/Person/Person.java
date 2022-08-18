package com.Person;

public class Person implements Comparable<Person>
{
	int pid;
	String name;
	int purchaseAmount;
	int age;
	
	public void setpurchaseAmount(int pid)
	{
		this.purchaseAmount = pid;
	}

	
	
	@Override
	public int compareTo(Person st) {
		if(name==st.name)
			return 0;
		else if(name.compareTo(st.name)>0)
			return 1;
		else
		return -1;
		
	}

	public Person(int pid, String name, int purchaseAmount, int age) {
		super();
		this.pid = pid;
		this.name = name;
		this.purchaseAmount = purchaseAmount;
		this.age = age;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPurchaseAmount() {
		return purchaseAmount;
	}

	public void setPurchaseAmount(int purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}

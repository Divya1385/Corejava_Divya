package com.evergent.corejava.casestudy_hashmap;

public class Employee
{
    private int id;
    private String name;
    private String dept;
    public int getId()
    {
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getDept()
	{
		return dept;
	}
	public void setDept(String dept)
	{
		this.dept = dept;
	}
	public String toString()
	{
		return "Employee Id :" +id+ " Employee name :" +name+ " Employee department :"+dept;
	}
}
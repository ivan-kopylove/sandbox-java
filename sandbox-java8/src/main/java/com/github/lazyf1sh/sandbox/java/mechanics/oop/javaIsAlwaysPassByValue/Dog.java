package com.github.lazyf1sh.sandbox.java.mechanics.oop.javaIsAlwaysPassByValue;

/**
 * @author Ivan Kopylov
 */
public class Dog
{
	private String name;

	public Dog(String name)
	{
		super();
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}
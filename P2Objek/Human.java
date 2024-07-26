public class Human 
{
	String name;
	String address;
	int age;
	String hairColor;
	
	//construktor 1
	Human (String name, String address, int age)
	{
		this.name = name;
		this.address = address;
		this.age = age;
		
	}
	
	//construktor 2
	Human (String name, String address, String hairColor)
	{
		this.name = name;
		this.address = address;
		this.hairColor = hairColor;
	}
	
	public void setName (String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
}
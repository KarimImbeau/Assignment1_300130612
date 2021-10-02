public class Employee
{
	private String name;
	int hours;
	double rate;
	Address address[];
	int numberOfAddress;


	Employee(String name, int hours, double rate){

		this.name = name;
		this.hours = hours;
		this.rate = rate;
		this.numberOfAddress = 0;
		address = new Address[5];

	}

	void addAddress(Address address)
	{
		if (numberOfAddress >= 5)
		{
			return;
		}
		this.address[numberOfAddress] = address;
		numberOfAddress++;
	}

	public String toString()
	{
		String str = "(" + name + ", " + hours + ", " + rate + ")\n";
		for (int i=0; i<numberOfAddress; i++)
		{
			str = str + "   " + address[i] + "\n";
		}
		return str;

	}
	
}

class Test
{
	public static void main(String[] args)
	{
		Employee employee = new Employee("Falcao", 40, 15.50);
		Address address1 = new Address("Queen", 48, "K1P1N2");
		Address address2 = new Address("King Edward", 800, "K1N6N5");

		employee.addAddress(address1);
		employee.addAddress(address2);
		

	        System.out.println(employee);
	}
}

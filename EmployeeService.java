package day7.task2;
public class EmployeeService {

	private String employees[] = {"101001011","102001022","103002011","104003080","105002020","106002090"};
	/*
	 * Note : employee codes are designed in following way: 
	 * a) first 3 digits are employee code
	 * b) next 3 digits are related to their department id.
	 * c) and last 3 digits are the city code of their work location 
	 *     for example 
	 *       011 : Delhi 
	 *       022 : Mumbai 
	 *       080 : Banglore
	 *       020 : Pune
	 * */
	public void docheckcity(String count)throws EmployeeException
	{
		if("011".equals(count) || "022".equals(count) || "080".equals(count) || "020".equals(count) )
		{
			 // book the tickets 
			//System.out.println("This is employee name and city details");
		}
		else
		{
			// raised the exception
			throw new EmployeeException(" City code is wrong please check " + count);
		}
		
	}
	public String[] getEmployeeCodes()
	{
		String codes[] = new String[employees.length];
		int count = -1;
		String citycodes[] = new String[employees.length];
		int count2 = -1;
		for (String empid : employees) {
			codes[++count] = empid.substring(0, 3);
			citycodes[++count2] = empid.substring(6,9);
			}
		
		return codes;
	}
	
	public String[] getEmployeeCityCodes()
	{
		
		String citycodes[] = new String[employees.length];
		int count2 = -1;
		for (String empid : employees) {
			
			citycodes[++count2] = empid.substring(6,9);
			}
		
		return citycodes;
	}
	
}

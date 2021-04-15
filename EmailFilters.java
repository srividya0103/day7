package day7.task3;
public class EmailFilters {
	
	String emails[] = {
			
			"ramesh@gmail.com",
			"rakesh@outlook.com",
			"lokesh@linkedin.com",
			"mahesh@gmail.com",
			"ganesh@gmail.com",
			"rajesh@outlook.com"
	};
	
	 
	public String getId(String pdfName){
	    String[] tokens = pdfName.split("@|\\.");
	    return tokens[1];
	}
	
	public static void main(String[] args) {
		EmailFilters e = new EmailFilters();
		int gcount = 0;
		int ocount = 0;
		int lcount = 0;
		
		for(int i = 0; i < e.emails.length; i++) {
			String string = e.getId(e.emails[i]);
			System.out.println(string);
			if(string.equalsIgnoreCase("gmail")) {
				gcount++;
			}
			else if(string.equalsIgnoreCase("linkedin")) {
				lcount++;
			}
			else if(string.equalsIgnoreCase("outlook")) {
				ocount++;
			}
		}
 	System.out.println("Gmail--"+gcount);
 	System.out.println("Linkedin--"+lcount);
 	System.out.println("outlook--"+ocount);
 	
	}

}



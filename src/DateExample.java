import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class DateExample {

	public static void main(String[] args) {
	    String month[] = 
	        {"Jan","Feb","Mar","Apr","May","Jun",
	                "Jul","Aug","Sep","Oct","Dec"};
	    String weekday[] = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
	    
		Scanner keybd = new Scanner(System.in);
		keybd.useDelimiter("[/]");
		System.out.print("Enter a Date(mm/dd/yyyy): ");
		int mm = keybd.nextInt();
		int dd = keybd.nextInt();
		int yyyy = keybd.nextInt();
		keybd.nextLine();
		//month is 0-based
		mm-=1;
		
		
		GregorianCalendar gc = new GregorianCalendar(yyyy,mm,dd);
       
		//This will show the month from the array defined above
		System.out.println("Month:" + month[gc.get(Calendar.MONTH)]);
		System.out.println("Day:" + gc.get(Calendar.DATE));
		System.out.println("Year:" + gc.get(Calendar.YEAR));
 		System.out.print("Day of Week: ");
        //This will show the weekday from the array defined above
 		System.out.println(weekday[gc.get(Calendar.DAY_OF_WEEK)]);

 		keybd.close();

 		//add the date to the database
 		
 		
 		//get the date from the database
 		
 		//display the date from the database in the format mmm dd, yyyy
 		
 		
	}

}

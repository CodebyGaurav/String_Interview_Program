package string_package;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Print_Date{
	
		public static void datedPrint() {
		 
		      Calendar cal = Calendar.getInstance();
		 
		      int date = cal.get(Calendar.DATE);
		      int month = cal.get(Calendar.MONTH) + 1;
		      int year = cal.get(Calendar.YEAR);
		      int dated =  512*(year-1980)+32*month+date;
		      
//		      for (int i=0;i<1001;i++){
//		          serialNo++;
//		      System.out.println("Ticket Serial ==> " + date + month + year + serialNo);
//		      }
		      System.out.println(dated);
		      System.out.println("Ticket Serial ==> " + date + month + year);
		}		

	
	  public static void main(String[] args) {  
		  
		  datedPrint();
	  }  
}   
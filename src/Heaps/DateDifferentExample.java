package Heaps;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class DateDifferentExample {

	public static void main(String[] args) {

		
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		format.setTimeZone(TimeZone.getTimeZone("CST"));
		String  dateStart = format.format(new Date());
		
		
		HashMap<String, String> fileNameAndDateMap = new HashMap<String, String>();
		fileNameAndDateMap.put("File1",  format.format(new Date()));
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		fileNameAndDateMap.put("File2",  format.format(new Date()));

		 ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		    Runnable runnable = new Runnable() {
		        public void run()
		        {
		        	
		        	if(fileNameAndDateMap.containsKey("File1"))
		        	printDate(format,fileNameAndDateMap.get("File1"));
		        	if(fileNameAndDateMap.containsKey("File1"))
		        	fileNameAndDateMap.remove("File1");
		        }
		    };

		    // Run it in 8 hours - you would have to calculate how long to wait from "now"
		   service.scheduleAtFixedRate(runnable, 0, 2, TimeUnit.SECONDS); // You can 

		//HH converts hour in 24 hours format (0-23), day calculation
		
	}
	
	public static void printDate(SimpleDateFormat format , String dateStart){
		
		
		String dateStop = format.format(new Date());
		Date d1 = null;
		Date d2 = null;

		try {
			d1 = format.parse(dateStart);
			d2 = format.parse(dateStop);

			//in milliseconds
			long diff = d2.getTime() - d1.getTime();

			long diffSeconds = diff / 1000 % 60;
			long diffMinutes = diff / (60 * 1000) % 60;
			long diffHours = diff / (60 * 60 * 1000) % 24;
			long diffDays = diff / (24 * 60 * 60 * 1000);

			System.out.print(diffDays + " days, ");
			System.out.print(diffHours + " hours, ");
			System.out.print(diffMinutes + " minutes, ");
			System.out.print(diffSeconds + " seconds.");
			System.out.println();
			if(diffSeconds > 2)
				System.out.println("Taking too much time");
			System.out.println();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
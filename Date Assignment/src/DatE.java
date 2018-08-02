import java.time.LocalDate;
import java.time.Period;

public class DatE {
	
	private int day;
	private int month;
	private int year;
	
	// C'tor with arguments
	public DatE(int day, int month, int year) {

		this.day = day;
		this.month = month;
		this.year = year;
	}

	//C'tor without any arguments
	public DatE() {
		
	}

	
	
	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}
	
	
	


	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	

	@Override
	public String toString() {
		return "Date: " + day + "/" + month + "/" + year;
	}
	
	// method to find the smaller date between two dates
	public boolean isSmaller(DatE date) {
		
		if(year < date.year) 
			return true;
		
		else if(year == date.year) {
			
			if(month < date.month)
				return true;
			else if(month == date.month) {
				
				if(day < date.day)
					return true;
				else
					return false;
			}
			else
				return false;
		}
		else 
			return false;
	}

	// method to get the difference between two dates and return an array
	public int[] difference(DatE date) {
		
		int[] dateGap = new int[3];
		
		LocalDate previous = LocalDate.of(day, month, year);
		LocalDate current = LocalDate.of(date.day, date.month, date.year);
		
		if(year > date.year) {
			
			Period age = Period.between(previous, current);
			dateGap[0] = age.getDays();
			dateGap[1] = age.getMonths();
			dateGap[2] = age.getYears();
		}
		
		else {
			
			Period age = Period.between(current, previous);
			dateGap[0] = age.getDays();
			dateGap[1] = age.getMonths();
			dateGap[2] = age.getYears();
		}
		
		return dateGap;
	}
	

}

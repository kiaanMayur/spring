import java.time.LocalDate;
import java.time.Period;

public class Person { 
	
	private String name;
	private DatE dob = new DatE();
	public Person(String name, int day, int month, int year) {
		
		this.name = name;
		dob.setDay(day);
		dob.setMonth(month);
		dob.setYear(year);
	}
	
	public void display() {
		
		System.out.println("Name: " + name + "\nDate of Birth: " + dob);
	}
	
	public void olderOne(Person person) {
		
		LocalDate current = LocalDate.now();
		LocalDate previous = LocalDate.of(dob.getYear(), dob.getMonth(), dob.getDay());
		
		if(dob.getYear() > person.dob.getYear()) {
			
			System.out.println(name + " is older by: ");
			Period age = Period.between(previous, current);
			System.out.println(age.getYears() + "years " + age.getMonths() + "months " + age.getDays() + "days");
			
		}
		
		else {
			
			System.out.println(person.name + " is older by: ");
			Period age = Period.between(current, previous);
			System.out.println(age.getYears() + "years " + age.getMonths() + "months " + age.getDays() + "days");
		}
	}
	

}
